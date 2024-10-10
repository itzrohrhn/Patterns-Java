import java.util.Scanner;
public class InvertedRightHalfPyramid {
    public static void main(String[] args) {
        System.out.print("Enter the number of Rows: ");
        Scanner inp = new Scanner(System.in);
        int rowSize = inp.nextInt();
        inp.close();
        for(int row=1; row<=rowSize; row++){
            for(int col=row; col<=rowSize; col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
//Made with Love by Rohh </>
