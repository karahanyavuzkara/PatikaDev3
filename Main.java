import java.util.Scanner;
public class Main {

   public static void main(String[]args){
   Scanner input = new Scanner(System.in);

   System.out.print("Enter the size of array : ");
   int size = input.nextInt();

   int[]array = new int[size];

   for(int i = 0; i < size; i++){
       System.out.print("Enter the " + (i+1) + " . number : ");
           array[i] = input.nextInt();
   }

   int [] freq = new int[size];
   int visited = -1;
   for(int i = 0; i < size; i++) {
       int count = i;
       for ( int j = i+1; j < size; j++) {
           if(array[i] == array[j]) {
               count++;
               freq[j] = visited;
           }
       }
       if ( freq[i] != visited) {
           freq[i] = count;
       }
   }
       System.out.println("Frequency of the array : ");
       for(int i= 0 ;i < size ; i++) {
           if(freq[i] != visited) {
               System.out.println(array[i] + " repeats " + freq[i] + " times");
           }
       }

   }
}



