package emailapp;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity;
    private int defaultPasswordLength = 10;
    private String companySuffix = "company.com";
    private String alternativeEmail;

    // Constructor to receive the first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        this.department = getDepartment();
        System.out.println("Department: " + this.department);

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + this.department + this.companySuffix;
        System.out.println("Your email is: " + this.email);
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

    public String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789#@!$%";
        char[] password = new char[length];
        for(int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);

    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Set the alternate email
    public void setAlternativeEmail(String email) {
        this.alternativeEmail = email;
    }

    // Change the password
    public void changePassword(String password) {
        this.password = password;
    }


}
