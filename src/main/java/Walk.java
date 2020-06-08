import java.util.Scanner;

public class Walk {

    private Scanner scanner;
    private Board chaLab;

    public Walk() {
        this.scanner = new Scanner(System.in);
        this.chaLab = new Board();
    }




    private void printBoard(){
        char[][] chaLab = this.chaLab.getMaze();
        for (int i = 0; i < chaLab.length; i++) {
            for (int j = 0; j < chaLab[1].length; j++) {
                System.out.print(chaLab[i][j]);
            }
            System.out.println();
        }
    }
}
