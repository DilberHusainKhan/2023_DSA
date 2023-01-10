import java.util.Scanner;

public class A_IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            int num = sc.nextInt();
            isPrime(num);
        }

    }
    public static void isPrime(int n){
        boolean isPrime = true;
        int i=2;
        while(i<n){
            if(n%i==0){
                isPrime =false;
                break; 
            }

            i++;
        }
        if(isPrime){
            System.out.println("Prime");
        }else{
            System.out.println("Not a Prime");
        }
    }
}
