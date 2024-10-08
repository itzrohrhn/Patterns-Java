import java.util.Scanner;
public class InvertedLeftHalfPyramid{
    public static void main(String[]args){
        System.out.print("Enter the number of Rows:");
        Scanner val = new Scanner(System.in);
        int rowSize = val.nextInt();
        val.close();
        for(int row=1; row<=rowSize; row++){
            
            for(int col=1; col<=row-1; col++){
                System.out.print(" ");
            }
            for(int col=1; col<=rowSize-row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}