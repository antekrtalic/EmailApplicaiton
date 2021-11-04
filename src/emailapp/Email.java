package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    String alternativeEmail;

    // Constructor to receive the first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.printf("EMAIL CREATED: " + this.firstName + " " + this.lastName);
    }

    // Ask for department
    public String getDepartment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the deparment:\n1 for Sales\n2 for Development\n3 for Accounting\n4 none of this");
        int deparmentRole = scanner.nextInt();

        if (deparmentRole == 1) { return "sales"; }
        else if (deparmentRole == 2) { return "development"; }
        else if (deparmentRole == 3) { return "accounting"; }
        else { return ""; }
    }

    // Generate a random password

    // Set the mailbox capacity

    // Set the alternate email

    // Change the password
}
