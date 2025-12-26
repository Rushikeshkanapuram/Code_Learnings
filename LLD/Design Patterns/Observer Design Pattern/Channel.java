import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private List<Observer> subscribers = new ArrayList<>();
    private String title;

    public void subscribe(Observer sub) {
        subscribers.add(sub);
    }

    public void unSubscribe(Observer sub) {
        subscribers.remove(sub);
    }

    public void notifySubscribers() {
        for (Observer sub : subscribers) {
            sub.update(title);
        }
    }

    public void upload(String title) {
        this.title = title;
        notifySubscribers();
    }
}
