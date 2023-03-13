import java.rmi.server.ServerNotActiveException;
import java.util.Scanner;

public class FindSecondLargeestEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i]= sc.nextInt();
        }
        secondLargeestEle(arr,len);
    }
    public static void secondLargeestEle(int[] arr,int n){
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
}
