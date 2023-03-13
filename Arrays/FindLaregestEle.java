import java.util.Scanner;

public class FindLaregestEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i]= sc.nextInt();
        }
        largeestEle(arr,len);
    }
    public static void largeestEle(int[] arr, int n){
        int large = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>large){
                large =arr[i];
            }
        }
        System.out.println(large);
    } 
}
