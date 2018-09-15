public class Test5 {

   public static void main(String[] args) {

      int[] a1 = {1, 2, 3, 4};
      int[] a2 = a1;
      a1 = new int[3];
      for (int i = 0; i < a2.length; i++)
         System.out.printf("%d ", a2[i]);
   }
}

