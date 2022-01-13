package practiceJava;

public class Practice {
    private int amount;// instance variable
    private String name;//declare instance variable

    public Practice(String name, int amount){
        this.name = name;
        this.amount = amount;

    }


    public void setName(String name){
        this.name = name;

    }

    public String getName(){
        return name;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }
    public int getAmount(){
        return amount;
    }
}
