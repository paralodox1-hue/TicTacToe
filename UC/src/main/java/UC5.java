public class UC5 {
    public static boolean isValidMove(int row, int col, char[][] board) {

        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Invalid move! Out of bounds.");
            return false;
        }
        if (board[row][col] != ' ') {
            System.out.println("Invalid move! Cell already occupied.");
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        char[][] board = {
                {' ', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'O'}
        };

        System.out.println(isValidMove(0, 0, board));
        System.out.println(isValidMove(1, 1, board));
        System.out.println(isValidMove(3, 0, board));
    }
}