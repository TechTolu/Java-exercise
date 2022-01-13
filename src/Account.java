public class Account {
    private int sole;//instance variable
    private String name;//instance variable
    private double balance;//instance variable

    public Account(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return  name;
    }

    public void deposit(double deposit){
        balance = deposit + balance;
        this.balance = balance;
    }

    public double getBalance(){
        this.balance = balance;
        return balance;
    }




}
