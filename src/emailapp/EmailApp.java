package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        Email userOne = new Email("Larsen", "McCanley");

        userOne.setAlternativeEmail("js@gmail.com");
        System.out.println("Alternative email: " + userOne.getAlternativeEmail());
    }
}
