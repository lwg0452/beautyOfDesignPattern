package Memento;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Application app = new Application();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.next();
            if (input.equals(":list")) {
                app.print();
            } else if (input.equals(":delete")) {
                app.deleteLatest();
            } else {
                app.addText(input);
            }
        }

    }
}
