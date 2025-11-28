import java.util.Scanner;
public class CinemaWithScanner14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] audience = new String[4][2];
        int choice;
        do {
            System.out.println("\n=== CINEMA MENU ===");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.print("Choose menu: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    int row, column;
                    while (true) {
                        System.out.print("Enter row number (1-4): ");
                        row = sc.nextInt();
                        System.out.print("Enter column number (1-2): ");
                        column = sc.nextInt();
                        sc.nextLine();
                        if (row < 1 || row > 4 || column < 1 || column > 2) {
                            System.out.println("Error: Seat row/column not available! Try again.\n");
                            continue;
                        }
                        if (audience[row - 1][column - 1] != null) {
                            System.out.println("Error: That seat is already taken! Choose another seat.\n");
                            continue;
                        }
                        break;
                    }
                    audience[row - 1][column - 1] = name;
                    System.out.println("Audience added successfully!");
                    break;

                case 2:
                    System.out.println("\n=== AUDIENCE LIST (4x2) ===");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {
                            System.out.print((audience[i][j] == null ? "-" : audience[i][j]) + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 3);
        sc.close();
    }
}
