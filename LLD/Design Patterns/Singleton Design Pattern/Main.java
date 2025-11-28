public class Main {

    public static void main(String[] args) {

        /*
        The Singleton Pattern ensures that:

                Only one object of a class is created
                That object is globally accessible

                Main needs one object, 
                as the object shoudn't be created outside the singleton class we use static obj inside the class 
                then it is returned using a static method which doesnt require object to call..

*/
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);
    }
}
