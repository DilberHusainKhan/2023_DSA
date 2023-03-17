import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("Enter length of arr and then values");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        insertionSort(arr,len);
        for(int i:arr){
            System.out.print(i+"\t");
        }
    }
    public static void insertionSort(int[] arr,int n){
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
}
