package entities;

public class BusinessAccount extends Account{
    private Double loamLimit;


    

    private void loan(double amount){
        if(this.getBalence() > loamLimit){
            this.setBalance(this.getBalence() - amount);
            }else{
                System.out.println("You can't loan this amount");
            }
    }

    private void setBalance(double d) {
    }

    public BusinessAccount(){ 
    }


    public BusinessAccount(Double loamLimit) {
        this.loamLimit = loamLimit;
    }
    

    public Double getLoamLimit() {
        return this.loamLimit;
    }

    public void setLoamLimit(Double loamLimit) {
        this.loamLimit = loamLimit;
    }
}
