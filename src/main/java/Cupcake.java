public class Cupcake extends Cake {
    private String frosting;

    public Cupcake(String name, double price, String baseFlavour, boolean healthyOption, String frosting) {
        super(name, price, baseFlavour, healthyOption);
        this.frosting = frosting;
    }

    public String getAddFrosting() {
        return frosting;
    }

    public void setAddFrosting(String newFrosting) {
        this.frosting = newFrosting;
    }
}