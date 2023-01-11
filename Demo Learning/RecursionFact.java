import java.util.Scanner;

public class RecursionFact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find fact");
        int n = sc.nextInt();
        int res=fact(n);
        System.out.println("Ans: "+res);
    }
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
