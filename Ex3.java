import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10};
        remove(arr);

    }
    static void remove(int[]arr){
        Random r=new Random();
        while (arr.length>0){
            int in=r.nextInt(arr.length);
            System.out.println("index="+ in+"  element= "+arr[in]);
            int[] arr1=new int[arr.length-1];

            for (int i=0;i<in;i++)
            arr1[i]=arr[i];
            for (int i=in;i<arr.length-1;i++)

                arr1[i]=arr[i+1];
            arr=arr1;




        }
    }
}
