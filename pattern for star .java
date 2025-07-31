import java.util.*;
public class SymmetricStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int totalRows = 2 * n - 1;
        for (int i = 1; i <= totalRows; i++) {
            for (int j = 1; j <= totalRows; j++) {
                if (i == 1 || i == totalRows || j == 1 || j == totalRows || i == j || j == totalRows - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
