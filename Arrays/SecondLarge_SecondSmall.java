
import java.util.Scanner;

public class SecondLarge_SecondSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i]= sc.nextInt();
        }
        secondLargestEle(arr,len);
        secondSmallestEle(arr,len);
    }
    public static void secondLargestEle(int[] arr,int n){
        int large = arr[0];
        int second = -1;
        for(int i=0;i<n;i++){
            if(arr[i]>large){
                second=large;
                large = arr[i];
            }else if(arr[i]<large && arr[i]>second){
                second =arr[i];
            }
        }
        System.out.println("Second larghest :"+second);
    }
    
    public static void secondSmallestEle(int[] arr,int n){
        int smaller = arr[0];
        int second = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<smaller){
                second=smaller;
                smaller = arr[i];
            }else if(arr[i]>smaller && arr[i]<second){
                second =arr[i];
            }
        }
        System.out.println("Second Smallest :"+second);
    }
}
