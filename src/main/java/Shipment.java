public class Shipment {
    private final Double cost;

    public Shipment(Double cost) {
        this.cost = cost;
    }

    public Cost acumulateCostHere(Double result) {
        return new Cost( result += this.cost );
    }
}
