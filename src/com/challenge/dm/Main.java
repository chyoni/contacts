package com.challenge.dm;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static ArrayList<Contact> contacts;

    public static void main(String[] args) {
        contacts = new ArrayList<>();
        startApp();
    }

    private static void startApp() {
        System.out.println("Welcome simulation phone contact.\n");

        while (true) {
            System.out.println("Select one this options:\n" +
                    "\t1. Manage contacts\n" +
                    "\t2. Messages\n" +
                    "\t3. Quit\n");
            int selected = scanner.nextInt();
            switch (selected) {
                case 1:
                    showManageContactsOptions();
                    break;
                case 2:
                    //TODO: Show messages options
                    break;
                case 3:
                    System.out.println("See u later.");
                    return;
            }
        }
    }

    private static void showManageContactsOptions() {
        while (true) {
            System.out.println("------ Select what you want ------\n" +
                    "\t1. Show all contacts\n" +
                    "\t2. Add a new contact\n" +
                    "\t3. Search for a contact\n" +
                    "\t4. Delete a contact\n" +
                    "\t5. Go back to the previous menu\n");
            int selected = scanner.nextInt();
            switch (selected) {
                case 1:
                    showAllContact();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    // TODO: Search for a contact
                    break;
                case 4:
                    // TODO: Delete a contact
                    break;
                case 5:
                    return;
            }
        }
    }

    private static void showAllContact() {
        System.out.println("Your contacts: ");
        if (contacts.size() == 0) {
            System.out.println("Not yet. add a new contact!.\n");
        } else {
            for (Contact contact : contacts) {
                System.out.println(contact.toString());
            }
        }
    }

    public static void addContact() {
        while (true) {
            System.out.println("Enter contact name: ");
            String name = scanner.next();
            System.out.println("Enter contact number: ");
            String number = scanner.next();

            if (!name.equals("") && !number.equals("")) {
                contacts.add(new Contact((int)Math.floor((Math.random() * 100)) , name, number));
                System.out.println("New contact added.");
                break;
            }
            System.out.println("Please confirm your new contact's name or number.");
        }
    }
}
