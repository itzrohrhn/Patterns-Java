import java.util.Scanner;
public class RightHalfPyramid {
    public static void main(String[] args) {
        System.out.print("Enter the number of Rows: ");
        Scanner sc = new Scanner(System.in);
        int rowSize = sc.nextInt();
        sc.close();
        for(int row=1; row<=rowSize; row++){
            for(int col=1; col<=row; col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
