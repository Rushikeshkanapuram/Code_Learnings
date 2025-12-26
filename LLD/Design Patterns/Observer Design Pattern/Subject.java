public interface Subject {
    void subscribe(Observer sub);
    void unSubscribe(Observer sub);
    void notifySubscribers();
    void upload(String title);
}
