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

        System.out.println("\nSerial number:" + phone.getSerialNumber());
        System.out.println("Cellphone model: " + phone.getModel());
        System.out.println("Cellphone carrier: " + phone.getCarrier());
        System.out.println("Phone number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());



    }
}
