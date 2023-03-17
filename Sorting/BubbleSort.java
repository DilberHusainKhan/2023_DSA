import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Enter length of arr and then values");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        } 
        bubbleSort(arr, len );
    }

    public static void bubbleSort(int[] arr,int n){
        for(int i=0;i<n;i++){
            if((i+1)<n)
            System.out.println("----------------"+(i+1));
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    System.out.println("Is "+arr[j]+" < "+arr[j+1]+" ? - Yes then Swaping...");
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp; 
                }else{
                    System.out.println("Is "+arr[j]+" < "+arr[j+1]+" ? - No then No-change required...");
                }
            }
            
        }
        for(int i:arr){
            System.out.print(i+"\t");
        }

    }
}
