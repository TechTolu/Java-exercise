package practiceJava;

public class PracticeDriver {
    public static void main(String[] args) {
        Practice newPractice = new Practice("Tolu",3000);
//        newPractice.setName("tolu");
//        newPractice.getName();
        System.out.printf("the buyer name is %s%n",newPractice.getName());
        newPractice.setAmount(5000);
        newPractice.getAmount();
        System.out.printf("The amount is %d",newPractice.getAmount());


    }
}
