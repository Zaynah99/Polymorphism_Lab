public abstract class Cake extends Bakery {

    Cake cake; //instantiating

    protected String name;
    protected double price;
    protected String baseFlavour;
    protected boolean healthyOption;

    public Cake(String name, double price, String baseFlavour, boolean healthyOption) {//constructor
        this.name = name;
        this.price = price;
        this.baseFlavour = baseFlavour;
        this.healthyOption = healthyOption;
    }



    // NAME
    public String getName() {
        return name; }

    public void setName(String newName) {
        this.name = "Yummy";
    }
    // PRICE
    public double getPrice() {
        return price;
    }
    public void setPrice(double newPrice){
        this.price = 40.00;
    }

    //BASE FLAVOUR

    public String getBaseFlavour(){
        return baseFlavour;
    }

    public void setBaseFlavour(String newFlavour){
        this.baseFlavour = "Vanilla";
    }

    public boolean getIsHealthyOption(){
        return healthyOption;
    }
    public void setIsHealthyOption(boolean newOption){
        this.healthyOption = false;
    }

    public boolean getAddAlcohol(){
        return true;
    }


}
