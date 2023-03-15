import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int [len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        sorting(arr);
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+"\t");
        }
    }
    public static void sorting(int[] arr){
        int n = arr.length;
        int mini;
        for(int i=0;i<=n-2;i++){
            mini =i;
            for(int j=i;j<=n-1;j++){
                if(arr[mini]>arr[j])
                mini=j;
            }
            int temp = arr[mini];
            arr[mini]=arr[i];
            arr[i] = temp;
        }
    }
   
}
