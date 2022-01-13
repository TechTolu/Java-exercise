import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter user name: ");
        String names = input.nextLine();
        Account toluAccount = new Account(names,0);
        System.out.printf(" %s account balance is %.2f%n ",toluAccount.getName(),toluAccount.getBalance());
        double pAY = input.nextDouble();
        toluAccount.deposit(pAY);
        System.out.printf(" %s account balance is %.2f ",toluAccount.getName(),toluAccount.getBalance());

    }
}
