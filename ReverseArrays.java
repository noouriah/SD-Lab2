import java.util.Arrays;

public class ReverseArrays {
    public static void main(String[] args) {
        int x[]={11,12,13,14,15,16};
        System.out.println( Arrays.toString(x));
        reverse(x);
        System.out.println( Arrays.toString(x));
    }
    public static void reverse(int a[])
{int n=a.length-1;
    for (int i = 0; i <a.length/2 ; i++) {
        int t=a[i];
        a[i]=a[n];
        a[n]=t;
        n--;
    }
}
}
