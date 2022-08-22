/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Dell
 */
public class PizzaDelivery extends Frame {

    private Label customerNameLabel, phoneLabel,
            addressLabel, pizzaTypeLabel, toppingLabel,
            qantityLabel, sizeLabel, billLabel, amountLabel,
            amountRsLabel, quantityBillLabel, quantityDisplayLabel,
            vatLabel, vatPercentageLabel, lineLabel, totalLabel,
            totalAmountLabel;

    private TextField customerNameTxtField, phoneTxtField,
            addressTxtField, quantityTxtField;

    private Choice pizzaTypeChoice;

    private Checkbox cheeseCheckBox, oliveCheckBox, mushroomCheckbox;

    private Checkbox smallSizeCheckBox, mediumCheckBox, largeCheckBox;

    private Button submitBtn, cancelBtn;

    private Panel formPanel, billPanel;

    private double amount = 0, totalAmount = 0;

    private void init() {
        setTitle("Pizza delivery");
        setLayout(new GridLayout(2, 1));

        formPanel = new Panel();
        formPanel.setBackground(Color.BLUE);
        add(formPanel);

        formPanel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.ipady = 5;
        gbc.insets = new Insets(3, 5, 3, 5);
        customerNameLabel = new Label("Customer :");
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridy = 0;
        formPanel.add(customerNameLabel, gbc);

        phoneLabel = new Label("Phone :");
        gbc.gridy = 1;
        formPanel.add(phoneLabel, gbc);

        addressLabel = new Label("Address :");
        gbc.gridy = 2;
        formPanel.add(addressLabel, gbc);

        pizzaTypeLabel = new Label("Pizza Type :");
        gbc.gridy = 3;
        formPanel.add(pizzaTypeLabel, gbc);

        toppingLabel = new Label("Extra-Toppings");
        gbc.gridy = 4;
        formPanel.add(toppingLabel, gbc);

        qantityLabel = new Label("Quantity");
        gbc.gridy = 5;
        formPanel.add(qantityLabel, gbc);

        sizeLabel = new Label("Size :");
        gbc.gridy = 6;
        formPanel.add(sizeLabel, gbc);

        gbc.gridx = 1;

        customerNameTxtField = new TextField(25);
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        formPanel.add(customerNameTxtField, gbc);

        phoneTxtField = new TextField(25);
        gbc.gridy = 1;
        formPanel.add(phoneTxtField, gbc);

        addressTxtField = new TextField(25);
        gbc.gridy = 2;
        formPanel.add(addressTxtField, gbc);

        pizzaTypeChoice = new Choice();
        pizzaTypeChoice.addItem("Cheese");
        pizzaTypeChoice.addItem("Mushroom");
        pizzaTypeChoice.addItem("Chicken");
        gbc.gridy = 3;
        formPanel.add(pizzaTypeChoice, gbc);

        cheeseCheckBox = new Checkbox("Cheese");
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        formPanel.add(cheeseCheckBox, gbc);

        quantityTxtField = new TextField(25);
        gbc.gridy = 5;
        gbc.gridwidth = 3;
        formPanel.add(quantityTxtField, gbc);

        CheckboxGroup sizeCg = new CheckboxGroup();
        smallSizeCheckBox = new Checkbox("Small", sizeCg, false);
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        formPanel.add(smallSizeCheckBox, gbc);

        submitBtn = new Button("Submit");
        gbc.gridy = 7;
        submitBtn.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e){
                String pizzaType = pizzaTypeChoice.getSelectedItem();
                if(pizzaType.equalsIgnoreCase("Cheese")){
                    amount = 200;
                }else if(pizzaType.equalsIgnoreCase("Mushroom")){
                    amount = 250;
                }else if(pizzaType.equalsIgnoreCase("Chicken")){
                    amount = 300;
                }

                double extraTopingAmmount = 0;
                if(cheeseCheckBox.getState()){
                    extraTopingAmmount = extraTopingAmmount + 50;
                }
                if(oliveCheckBox.getState()){
                    extraTopingAmmount += 50;
                }
                if(mushroomCheckbox.getState()){
                    extraTopingAmmount += 50;
                }

                int quantity = Integer.parseInt(quantityTxtField.getText());

                String size = sizeCg.getSelectedCheckbox().getLabel();
                if(size.equalsIgnoreCase("Medium")){
                    amount += 50;
                }else if(size.equalsIgnoreCase("Large")){
                    amount += 100;
                }

                amount = amount + extraTopingAmmount;
                double vatAmount = amount * 0.13;
                totalAmount = amount + vatAmount;

                amountRsLabel.setText(String.valueOf(amount));
                quantityDisplayLabel.setText(String.valueOf(quantity));
                vatPercentageLabel.setText(String.valueOf(vatAmount));
                totalAmountLabel.setText(String.valueOf(totalAmount));


            }
        });
        formPanel.add(submitBtn, gbc);

        gbc.gridx = 2;

        oliveCheckBox = new Checkbox("Olive");
        gbc.gridy = 4;
        formPanel.add(oliveCheckBox, gbc);

        mediumCheckBox = new Checkbox("Medium", sizeCg, false);
        gbc.gridy = 6;
        formPanel.add(mediumCheckBox, gbc);

        cancelBtn = new Button("Cancel");
        gbc.gridy = 7;
        formPanel.add(cancelBtn, gbc);

        gbc.gridx = 3;

        mushroomCheckbox = new Checkbox("Mushroom");
        gbc.gridy = 4;
        formPanel.add(mushroomCheckbox, gbc);

        largeCheckBox = new Checkbox("Large", sizeCg, false);
        gbc.gridy = 6;
        formPanel.add(largeCheckBox, gbc);

        // Bill Panel setup
        billPanel = new Panel();
        billPanel.setBackground(Color.ORANGE);
        add(billPanel);

        billPanel.setLayout(new GridBagLayout());

        GridBagConstraints billgbc = new GridBagConstraints();
        billgbc.fill = GridBagConstraints.HORIZONTAL;
        billgbc.insets = new Insets(5, 5, 5, 5);

        billgbc.gridx = 0;

        billLabel = new Label("Bill");
        billgbc.gridy = 0;
        billgbc.gridwidth = 2;
        billPanel.add(billLabel, billgbc);

        amountLabel = new Label("Amount:");
        billgbc.gridy = 1;
        billgbc.gridwidth = 1;
        billPanel.add(amountLabel, billgbc);

        quantityBillLabel = new Label("Quantity:");
        billgbc.gridy = 2;
        billPanel.add(quantityBillLabel, billgbc);

        vatLabel = new Label("Vat (13%) :");
        billgbc.gridy = 3;
        billPanel.add(vatLabel, billgbc);

        lineLabel = new Label("_____________________");
        billgbc.gridy = 4;
        billgbc.gridwidth = 2;
        billPanel.add(lineLabel, billgbc);

        totalLabel = new Label("Total amount :");
        billgbc.gridy = 5;
        billgbc.gridwidth = 1;
        billPanel.add(totalLabel, billgbc);

        billgbc.gridx = 1;

        amountRsLabel = new Label("0.00");
        billgbc.gridy = 1;
        billPanel.add(amountRsLabel, billgbc);

        quantityDisplayLabel = new Label("0");
        billgbc.gridy = 2;
        billPanel.add(quantityDisplayLabel, billgbc);

        vatPercentageLabel = new Label("0.00");
        billgbc.gridy = 3;
        billPanel.add(vatPercentageLabel, billgbc);

        totalAmountLabel = new Label("0.00");
        billgbc.gridy = 5;
        billPanel.add(totalAmountLabel, billgbc);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setSize(500, 600);
        setVisible(true);

    }

    public PizzaDelivery() {
        init();
    }

    public static void main(String[] args) {
        new PizzaDelivery();
    }

}
