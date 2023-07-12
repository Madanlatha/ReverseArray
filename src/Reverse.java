import java.util.Scanner;

public class Reverse {
    public static int[] reverseArray(int[] arr){
        int size=arr.length;
        int i=0;
        int j=size-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array index");
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int array[]=reverseArray(arr);

        for(int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
}
