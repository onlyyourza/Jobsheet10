import java.util.Scanner;
public class Flowchart14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] survey = new int[10][6];
        int value;
        double sum, avg;
        double totalSum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Respondent #" + (i + 1));
            for (int j = 0; j < 6; j++) {
                while (true) {
                    System.out.print("  Score for question " + (j + 1) + " (1-5): ");
                    value = sc.nextInt();
                    if (value >= 1 && value <= 5) {
                        survey[i][j] = value;
                        break;
                    } else {
                        System.out.println("  Invalid input! Please enter a value from 1 to 5.");
                    }
                }
            }
        }

        System.out.println("\nAverage score per respondent:");
        for (int i = 0; i < 10; i++) {
            sum = 0;
            for (int j = 0; j < 6; j++) {
                sum += survey[i][j];
            }
            avg = sum / 6.0;
            System.out.printf("Respondent %d : %.2f%n", (i + 1), avg);
        }

        System.out.println("\nAverage score per question:");
        for (int j = 0; j < 6; j++) {
            sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += survey[i][j];
            }
            avg = sum / 10.0;
            System.out.printf("Question %d : %.2f%n", (j + 1), avg);
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalSum += survey[i][j];
            }
        }
        double overallAvg = totalSum / 60.0;
        System.out.printf("%nOverall average score : %.2f%n", overallAvg);
        sc.close();
    }
}
