// public class Singleton {
    
//      // Lazy initialization can be optimized for multithreads
//     private static Singleton instance;  

//     private Singleton() { }

//     public static Singleton getInstance() {
//         if (instance == null) {
//             instance = new Singleton();  
//         }
//         return instance;
//     }
// }



// Double checked Locking 
public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {   
            synchronized (Singleton.class) {  
                if (instance == null) {     
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
