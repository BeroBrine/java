package twoDarrays;
import java.util.Arrays;
public class spiralPrint {
    public static void print(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) 
        {
            // top
            for (int j = startCol; j <= endCol; j++) 
            {
                System.out.print(matrix[startRow][j] + " ");
            }
            // right
            for (int i = startRow + 1; i <= endRow; i++) 
            {
                if (startCol == endCol)
                {
                    break;
                }
                System.out.print(matrix[i][endCol] + " ");

            }
            // bottom
            for (int j = endCol - 1; j >= startCol; j--) 
            {
                if ( startRow == endRow)
                {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");

            } 
            // left
            for (int i = endRow - 1; i >= startRow+1; i--) 
            {
                if ( startRow == endRow)
                {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;;
        }
    }

    public static void main(String args[]) {
        int matrix[][] = {
                { 1, 2, 3 , 5},
                { 4, 5, 6 , 5},
                { 7, 8, 9 , 5 } };

        print(matrix);
    }
}