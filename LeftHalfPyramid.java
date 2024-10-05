import java.util.Scanner;
public class LeftHalfPyramid{
    public static void main(String[]args){
        System.out.print("Enter the number of Rows: ");
        Scanner input = new Scanner(System.in);
        int rowSize = input.nextInt();
        input.close();
        for(int row=1; row<=rowSize; row++){
            for(int col=1; col<=rowSize-row; col++){
                System.out.print(" ");
            }
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}