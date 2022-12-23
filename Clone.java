public class Clone {
    public static void main(String[] args) {
        backup();
    }
    static void backup(){
        int [] arr={12,14,19};
        System.out.println("array before clone");
        for (int i=0;i<arr.length;i++)
        System.out.println(arr[i]+" ");

        int copyarray[]=new int[arr.length];
        copyarray=arr;
        copyarray[1]++;
        System.out.println("array list");
        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]+" ");
        System.out.println("copyarray");
        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]+" ");


    }}
