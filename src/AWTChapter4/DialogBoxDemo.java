package AWTChapter4;

import java.awt.*;

import java.awt.event.*;

public class DialogBoxDemo {
    private Frame mainFrame;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;

    public DialogBoxDemo() {
        prepareGUI();
    }

    public static void main(String[] args) {
        DialogBoxDemo dialogControlDemo = new DialogBoxDemo();
        dialogControlDemo.showDialogDemo();
    }

    private void prepareGUI() {
        mainFrame = new Frame("Java AWT Examples");
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(new GridLayout(3, 1));
        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        statusLabel = new Label();
        statusLabel.setAlignment(Label.CENTER);
        statusLabel.setSize(350, 100);
        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showDialogDemo() {
        headerLabel.setText("Control in action: Dialog");
        Button showAboutDialogButton = new Button("Show About Dialog");
        showAboutDialogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AboutDialog aboutDialog = new AboutDialog(mainFrame);
                aboutDialog.setVisible(true);
            }
        });
        controlPanel.add(showAboutDialogButton);
        mainFrame.setVisible(true);

    }

    class AboutDialog extends Dialog {
        public AboutDialog(Frame parent) {
            super(parent, true);
            setBackground(Color.gray);

            setLayout(new BorderLayout());

            Panel panel = new Panel();
            panel.add(new Button("Close"));
            add("South", panel);
            setSize(200, 200);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowEvent) {
                    dispose();
                }
            });
        }
    }
}