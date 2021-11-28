import java.util.Scanner;

public class Sentinel {
    public static void main(String[] args) {
        //collect score
        //check for sentinel
        //add score

        int total =0;
        int score =0;

        do {
            System.out.println("Enter score");
            Scanner scanner = new Scanner(System.in);
            score = scanner.nextInt();
        }
        while (score != -50);
    }
}
