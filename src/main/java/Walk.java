import java.util.Scanner;

public class Walk {

    private Scanner scanner;
    private Board chaLab;

    public Walk() {
        this.scanner = new Scanner(System.in);
        this.chaLab = new Board();
    }

    public void play() {
        char[][] chaLab = this.chaLab.getMaze();
        boolean[][] boolMaze = this.chaLab.getBooLab();
        int x = 1;
        int y = 1;
        chaLab[x][y] = 'X';
        String cantMove = "You can't! There is a wall!";

        while (chaLab[19][38] != 'X') {
            printBoard();
            System.out.println();
            String way = scanner.nextLine();

            switch (way) {
                case "up":
                    x--;
                    if (boolMaze[x][y] == false) {
                        chaLab[x + 1][y] = 'o';
                        chaLab[x][y] = 'X';
                    } else {
                        System.out.println(cantMove);
                        x++;
                    }
                    break;
                case "down":
                    x++;
                    if (boolMaze[x][y] == false) {
                        chaLab[x - 1][y] = 'o';
                        chaLab[x][y] = 'X';
                    } else {
                        System.out.println(cantMove);
                        x--;
                    }
                    break;
                case "right":
                    y++;
                    if (boolMaze[x][y] == false) {
                        chaLab[x][y - 1] = 'o';
                        chaLab[x][y] = 'X';
                        break;
                    } else {
                        System.out.println(cantMove);
                        y--;
                        break;
                    }
                case "left":
                    y--;
                    if (boolMaze[x][y] == false) {
                        chaLab[x][y + 1] = 'o';
                        chaLab[x][y] = 'X';
                    } else {
                        System.out.println(cantMove);
                        y++;
                    }
                    break;
            }

        }
        printBoard();
        System.out.println("Congratulations!!!");
    }

//    private boolean canMove() {
//        //boolean[][] boolMaze = this.chaLab.getBooLab();
//        //if
//    }

    private void moveUp() {
    }

    private void moveDown() {
    }

    private void moveRight() {
    }

    private void moveLeft(int x, int y) {
        //chaLab[x][y] = '+';
        //y--;
        //chaLab[x][y] = 'X';
    }


    public void printBoard() {
        char[][] chaLab = this.chaLab.getMaze();
        for (int i = 0; i < chaLab.length; i++) {
            for (int j = 0; j < chaLab[1].length; j++) {
                System.out.print(chaLab[i][j]);
            }
            System.out.println();
        }
    }
}
