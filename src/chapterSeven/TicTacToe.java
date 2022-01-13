package chapterSeven;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] ticTacToe = {{'x', 'O', 'O'},{'X', 'X', 'X'},{'O', 'X', 'O'}};
        for (int row = 0; row < ticTacToe.length; row++){
            for(int column = 0; column < ticTacToe.length; column++){
                System.out.println();
            }
        }
    }
}
