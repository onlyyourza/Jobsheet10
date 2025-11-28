import java.util.Scanner;
public class SIAKAD14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] score = new int [4][3];

        for (int i = 0; i < score.length; i++) {
            System.out.println("Enter scores for student #" + (i + 1));
            double sumForEachStudent = 0;

            for (int j = 0; j < score[i].length; j++) {
                System.out.println("Course #" + (j + 1) + " score: ");
                score[i][j] = sc.nextInt();
                sumForEachStudent += score[i][j];
            }
            System.out.println("Average score: " + sumForEachStudent / 3);
        }
    sc.close();
    }
}
