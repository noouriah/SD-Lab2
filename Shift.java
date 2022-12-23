import java.util.Arrays;

public class Shift {
    public static void main(String[] args) {
        int x[]={11,12,13,14,15,16};
        System.out.println( Arrays.toString(x));
//        shiftLeft(x);
//        System.out.println( Arrays.toString(x));
        rotateLeft(x);
        System.out.println( Arrays.toString(x));
    }
    public static void shiftLeft(int a[])
    {
        for (int i = 0; i <a.length-1 ; i++) {
            a[i]=a[i+1];
        }
        a[a.length-1]=Integer.MIN_VALUE;
    }
    public static void rotateLeft(int a[])
    {
        int t=a[0];
        for (int i = 0; i <a.length-1 ; i++) {
            a[i]=a[i+1];
        }
        a[a.length-1]=t;
    }

    public static void shiftRight(int a[])
    {
        for (int i = a.length-1; i >0 ; i--) {
            a[i]=a[i-1];
        }
        a[0]=Integer.MIN_VALUE;
    }
    public static void rotateRight(int a[])
    {
        int t=a[a.length-1];
        for (int i = a.length-1; i >0 ; i--) {
            a[i]=a[i-1];
        }
        a[0]=t;
    }

}
