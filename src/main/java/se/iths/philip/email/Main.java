package se.iths.philip.email;

public class Main {
    public static void main(String[] args) {
        Email myEmail = new Email();
        myEmail.setTo("info@iths.se");
        myEmail.setFrom("Philip@iths.se");
        myEmail.setSubject("Hey");
        myEmail.setMessage("Hello, world!");
        myEmail.setCc("admin@iths.se");

//        System.out.println(myEmail.getTo());
//        System.out.println(myEmail.getFrom());
//        System.out.println(myEmail.getSubject());
//        System.out.println(myEmail.getMessage());
//        System.out.println(myEmail.getCc());

        myEmail.send();

    }
}
