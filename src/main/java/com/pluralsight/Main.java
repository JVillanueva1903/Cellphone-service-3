package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}
import java.util.Scanner;

public class CellPhoneApplication {

    public static void main() {
        main(null);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner();

        // FIRST CELL PHONE (user enters data)
        CellPhone cellPhone1 = new CellPhone();

        System.out.print("Enter owner name: ");
        cellPhone1.setOwner(input.nextLine());

        System.out.print("Enter phone model: ");
        cellPhone1.setModel(input.nextLine());

        System.out.print("Enter carrier: ");
        cellPhone1.setCarrier(input.nextLine());

        System.out.print("Enter phone number: ");
        cellPhone1.setPhoneNumber(input.nextLine());

        System.out.print("Enter serial number: ");
        cellPhone1.setSerialNumber(input.nextInt());
        input.nextLine(); // clear buffer


        // SECOND CELL PHONE (hard-coded)
        CellPhone cellPhone2 = new CellPhone();
        cellPhone2.setOwner("Dana Wyatt");
        cellPhone2.setModel("iPhone X");
        cellPhone2.setCarrier("AT&T");
        cellPhone2.setPhoneNumber("855-555-2222");
        cellPhone2.setSerialNumber(1234567);

        // THIRD CELL PHONE using overloaded constructor
        CellPhone cellPhone3 = new CellPhone(
                7777777,
                "Pixel 9 Pro",
                "T-Mobile",
                "999-444-1212",
                "Grover Smith"
        );

        System.out.println();
        System.out.println("Displaying all phones:");
        display(cellPhone1);
        display(cellPhone2);
        display(cellPhone3);

        System.out.println("Dialing demonstration:");
        System.out.println();

        // Phone 1 calls Phone 2 using dial(String)
        cellPhone1.dial(cellPhone2.getPhoneNumber());

        // Phone 2 calls Phone 1 using dial(String)
        cellPhone2.dial(cellPhone1.getPhoneNumber());

        // Phone 3 calls Phone 1 using overloaded dial(CellPhone)
        cellPhone3.dial(cellPhone1);

        // Phone 1 calls Phone 3 using overloaded dial(CellPhone)
        cellPhone1.dial(cellPhone3);

        input.close();
    }

    // display() method
    public static void display(CellPhone phone) {
        System.out.println("Owner: " + phone.getOwner());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println();
    }

    private static class Scanner {
        public void close() {

        }

        public CellPhone.String nextLine() {

        }

        public int nextInt() {

        }
    }

    private static class System {
        public static java.lang.Object out
                ;
        public static java.lang.Object in
                ;
    }

    private static class String {
    }
}