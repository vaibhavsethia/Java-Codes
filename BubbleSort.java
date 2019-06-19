import java.util.*;
public class BubbleSort
{
    public static void bubble_srt(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
            printNumbers(array);
        }
    }
 
    private static void swapNumbers(int i, int j, int[] array) {
 
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
 
    private static void printNumbers(int[] input) {
         
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
 
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the no. of elements :");
        int noe = SC.nextInt();
        int[] input = new int[noe];
        System.out.println("Enter elements one by one :");
        for(int i=0;i<input.length;i++)
        {
           input[i] = SC.nextInt();
        }
        bubble_srt(input);
 
    }
}