
public class PartialSell implements Sell {

    private Sell sellCached;
    private Sell defaultSell;

    public PartialSell(SingleSell sell) {
        this.sellCached = sell;
        this.defaultSell = new NoSell();
    }

    public PartialSell(Item item) {
        this.sellCached = new SingleSell(item, new NoShipment());
        this.defaultSell = new NoSell();
    }

    @Override
    public Fee fee() {
        return new FeeBasedOnDefault(defaultSell).calculate();
    }

    @Override
    public Cost cost() {
        return this.defaultSell.cost();
    }

    public PartialSell and(Item item) {
        return this;
    }

    public PartialSell close() {
        this.defaultSell = this.sellCached;
        return this;
    }
}
