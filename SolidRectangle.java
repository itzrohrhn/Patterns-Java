import java.util.Scanner;
public class SolidRectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows: ");
        int rowSize = sc.nextInt();
        System.out.print("Enter the number of Colmns: ");
        int colSize = sc.nextInt();
        sc.close();
        for(int row=1; row<=rowSize; row++){
            for(int col=1; col<=colSize; col++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}