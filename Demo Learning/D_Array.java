import java.util.*;
public class D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][]= new int[row][col];

        System.out.println("Enter values");
        // row 
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Display");

        System.out.println("Row Major ...");
        for(int i=0;i<row;i++){
            for(int j =0;j<col;j++){
                System.out.print(arr[i][j]+" <-["+i+"-"+j+"]\t");
            }
        }
        System.out.println();
        System.out.println("Column major display");
        for(int i=0;i<col;i++){
            for(int j =0;j<row;j++){
                System.out.print(arr[j][i]+" <-["+j+"-"+i+"]\t");
            }
        }
    }
}
