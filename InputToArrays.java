import java.util.Arrays;
import java.util.Scanner;

public class InputToArrays {
    static int numberOfElements=0;
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner in= new Scanner(System.in);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <7 ; i++) {
           if(add(arr, in.nextInt()))
               System.out.println(Arrays.toString(arr));
       else System.out.println("Array is full");
        }
    }
    public static boolean add(int x[],int newElement)
    {
      if(numberOfElements<x.length)
      {
          x[numberOfElements]=newElement;
          numberOfElements++;
          return true;
      }
      return false;
    }
}
