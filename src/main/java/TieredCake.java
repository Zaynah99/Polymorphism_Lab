public class TieredCake extends Cake {

    private int tiers;

    public TieredCake(String name, double price, String baseFlavour, boolean healthyOption, int tiers) {
        super(name, price, baseFlavour, healthyOption);
        this.tiers = tiers;
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int newTiers) {
        this.tiers = newTiers;
    }

    public String addFilling() {
        return "Jam";
    }

}


