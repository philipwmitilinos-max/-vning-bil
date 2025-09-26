package se.iths.philip.email;

public class Email {
    private String to;
    private String from;
    private String subject;
    private String message;
    private String cc;

    public Email() {
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public void send() {
        if (to == null || to.isEmpty()
                || from == null || from.isEmpty()
                || subject == null || subject.isEmpty()
                || message == null || message.isEmpty()) {
            System.out.println("Mejlet kan inte skickas. Alla fält måste vara satta!");
        } else {
            System.out.println("Sending e-mail...");
            System.out.println("To: " + to);
            System.out.println("From: " + from);
            System.out.println("Subject: " + subject);
            System.out.println("Message: " + message);

            if (cc != null && !cc.isEmpty()) {
                System.out.println("CC: " + cc);
            }
        }
    }
}
