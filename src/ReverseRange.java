import java.util.Scanner;

public class ReverseRange {
    public static int[] reverseArray(int[] arr,int a,int b){
        int size=arr.length;
        int i=a;
        int j=b;
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
        System.out.println("Enter the sub array start and end value");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int array[]=reverseArray(arr,a,b);

        for(int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
}
