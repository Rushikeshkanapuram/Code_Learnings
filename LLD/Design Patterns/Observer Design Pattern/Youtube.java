public class Youtube {
    public static void main(String[] args) {

        // Observer Design Pattern implementation.
        // Channel acts as the Subject and maintains a list of Observers (Subscribers).
        // Whenever a new video is uploaded, all subscribed Observers are notified automatically.
        // This design ensures loose coupling between the Subject and its Observers.

        Channel javaTutorials = new Channel();

        Subscriber s1 = new Subscriber("rushi");
        Subscriber s2 = new Subscriber("vijay");
        Subscriber s3 = new Subscriber("xyz");

        javaTutorials.subscribe(s1);
        javaTutorials.subscribe(s2);
        javaTutorials.subscribe(s3);

        javaTutorials.upload("Observer Design Pattern in Java");
    }
}
