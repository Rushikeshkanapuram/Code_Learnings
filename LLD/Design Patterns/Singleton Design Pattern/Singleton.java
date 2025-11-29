public class Singleton {
    
     // Lazy initialization can be optimized for multithreads
    private static Singleton instance;  

    private Singleton() { }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();  
        }
        return instance;
    }
}
