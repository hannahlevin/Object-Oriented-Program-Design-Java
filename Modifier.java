public class Modifier {

   public static void modify( int [] array2 ) {

      for ( int counter = 0; counter < array2.length; counter++ )
         array2[ counter ] *= 10;
   }

   public static void modify ( int element ) {

      element *= 10;
   }

   public static void main( String args[] ) {

     int array[] = { 1, 2, 3, 4, 5 };
     modify( array[array.length – 1] );
     System.out.println( "The last array element is " + array[array.length - 1] );
     modify( array );
     System.out.println( "The last array element is " + array[array.length - 1] );
   }
}