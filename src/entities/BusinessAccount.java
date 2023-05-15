package entities;

public class BusinessAccount extends Account{
    private Double loamLimit;


    public void loamMount(){
        if(this.getBalance() > this.loamLimit){
            this.setBalance(this.getBalance() - this.loamLimit);
        }else{
            this.setBalance(0.0);
        }
    }

    private void setBalance(double d) {
    }

    private Double getBalance() {
        return null;
    }

    public BusinessAccount(){ 
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balence, Double loamLimit) {
        super(number, holder, balence);
        this.loamLimit = loamLimit;
    }

    public Double getLoamLimit() {
        return this.loamLimit;
    }

    public void setLoamLimit(Double loamLimit) {
        this.loamLimit = loamLimit;
    }

}
