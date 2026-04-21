public class UC1 {
    public static void main(String[] args) {
        // Step 1: Create a 2D array (3x3 board)
        char[][] board = new char[3][3];

        // Step 2: Initialize each cell with '-'
        for (int i = 0; i < 3; i++) {          // Outer loop → rows
            for (int j = 0; j < 3; j++) {      // Inner loop → columns
                board[i][j] = '-';             // Empty placeholder
            }
        }

        // Step 3: Print the board in a readable format
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " "); // Print with spacing
            }
            System.out.println(); // Move to next row
        }
    }
}