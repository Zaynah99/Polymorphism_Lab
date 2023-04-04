public class TieredCake extends Cake implements IFill {

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

//        public String addFilling() { // works! but for MVP
//        return "Jam";

    public String fill(String filling) { // attempting to use interface
        return this.name;
    }


}



