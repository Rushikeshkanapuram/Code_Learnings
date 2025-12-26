public class Subscriber implements Observer {
    private String name;
    private Subject channel;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(String title) {
        System.out.println("Hey " + name + ", new video uploaded: " + title);
    }

    public void subscribeChannel(Subject ch) {
        this.channel = ch;
    }
}
