package questions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

//write a program to take the name and email of student then write the name of student into file "std,txt" whose email is Gmail domain
public class ExamQuestion {

    public static void main(String[] args)
            throws IOException {
        System.out.println("Enter your name");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Enter your email");
        String email = scan.nextLine();
        Path fileName = Path.of(
                "C:\\Users\\user\\Downloads\\std.txt");
        if (email.contains("gmail")) {
            Files.writeString(fileName, name);

        }
        String file_content = Files.readString(fileName);
        System.out.println(file_content);
    }

}
