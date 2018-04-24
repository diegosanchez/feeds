
public class FeeBasedOnDefault implements Rival {
    private final Sell sell;

    public FeeBasedOnDefault(Item item, Shipment shipment) {
        this.sell = new SingleSell(item, shipment);
    }

    public FeeBasedOnDefault(Sell sell) {
        this.sell = sell;
    }

    @Override
    public Fee calculate() {
        Cost accumulated = sell.cost();
        return accumulated.percentage(3.5).asFee();

    }

    @Override
    public Rival oust(Rival policy) {
        return policy.oust(this);
    }
}
