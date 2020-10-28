class PrePostDemo {
   public static void main(String[] args){
     int i = 3;
     i++;
     System.out.println(i); // "4"
     ++i;
     System.out.println(i); // "5"
     System.out.println(++i); // "6" Reason: Reading value after value increase.
     System.out.println(i++); // "6" Reason: Reading value before value increase.
     System.out.println(i); // "7"
   }

}