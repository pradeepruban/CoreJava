public class Boxings {
     public static void main(String args[])
     {
         // non auto boxing
         Integer x = new Integer(10);
         int y = x.intValue();
         System.out.println("Y = "+y);

         // auto boxing
         Integer z = new Integer(43);
         z++;
         System.out.println("z = "+z);


         Integer h = new Integer(44);
         System.out.println("h = "+h);

         // Comparing two refferences
         System.out.println("z == h "+(h == z ));


     }
}

