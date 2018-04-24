import java.nio.DoubleBuffer;

public class Item {
    private final Double cost;

    public Item(Double cost) {
        this.cost = cost;
    }

    public Fee acumulateFee(Shipment shipment) {
        return this.acumulateCost(shipment).asFee();

    }

    public Fee percentage(double value) {
        return new Fee(this.cost * value / 100);
    }

    public boolean isBiggerThan(double value) {
        return this.cost >= value;
    }

    public Cost acumulateCost(Shipment shipment) {
        Double result = this.cost;
        return shipment.acumulateCostHere(result);
    }
}
