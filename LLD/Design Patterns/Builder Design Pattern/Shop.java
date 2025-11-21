public class Shop {
     public static void main(String[] args) {
      //      Phone p=new Phone("android",4,"snapdragon 700",5.5,3100);


           Phone p=new PhoneBuilder().setOs("android").setRam(4).getPhone();
           System.out.println(p);

        }
}
