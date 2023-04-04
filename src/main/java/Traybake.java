public class Traybake extends Cake{

    private String sprinkles;

    public Traybake (String name, double price, String baseFlavour, boolean healthyOption, String sprinkles) {
        super(name, price, baseFlavour, healthyOption);
        this.sprinkles = sprinkles;
    }
    public String getAddSprinkles() {
        return sprinkles;
    }
    public void setAddSprinkles(String newSprinkles) {
        this.sprinkles = newSprinkles;
    }
}
