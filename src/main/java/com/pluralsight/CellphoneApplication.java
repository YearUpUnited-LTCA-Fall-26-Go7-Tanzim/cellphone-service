package com.pluralsight;

import java.util.Scanner;

public class CellphoneApplication {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        CellPhone phone = new CellPhone();

        System.out.print("What is the serial number? ");
        phone.setSerialNumber(Integer.parseInt(scanner.nextLine().trim()));
        System.out.print("What is the cellphone model? ");
        phone.setModel(scanner.nextLine().trim());
        System.out.print("Who is the carrier? ");
        phone.setCarrier(scanner.nextLine().trim());
        System.out.print("What is the phone number? ");
        phone.setPhoneNumber(scanner.nextLine().trim());
        System.out.print("Who is the owner of the phone? ");
        phone.setOwner(scanner.nextLine().trim());





        CellPhone cellPhone2 = new CellPhone();
        cellPhone2.setSerialNumber(1234567);
        cellPhone2.setModel("Galaxy S24");
        cellPhone2.setCarrier("AT&T");
        cellPhone2.setPhoneNumber("855-555-2222");
        cellPhone2.setOwner("Dana Wyatt");

        CellPhone cellPhone3 = new CellPhone(7654321, "Pixel 9", "T-Mobile", "877-555-0000", "Alex");

        display(phone);
        display(cellPhone2);
        display(cellPhone3);

        phone.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(phone.getPhoneNumber());
        phone.dial(cellPhone3.getPhoneNumber());





    }
    public static void display(CellPhone phone) {
        System.out.println("Owner: " + phone.getOwner());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Phone number: " + phone.getPhoneNumber());

    }



}
