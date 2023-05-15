package entities;

public class Account {
    private Integer number;
    private String holder;
    private Double balence;

    public Account(){
    }


    public Account(Integer number, String holder, Double balence) {
        this.number = number;
        this.holder = holder;
        this.balence = balence;
    }


    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return this.holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalence() {
        return this.balence;
    }

    public void withdraw(double amount){
        if (amount > this.balence) {
            System.out.println("Insufficient funds");
        }else {
            this.balence = this.balence - amount;
            System.out.println(String.format("Withdrawn %.2f",amount));
        }
    }

    public void deposit(double amount){
        this.balence = this.balence + amount;
    }
}
