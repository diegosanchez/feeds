public class Seller {
    public SingleSell sells(Item item, Shipment shipment) {
        return new SingleSell(item, shipment);
    }

    public PartialSell sells(Item item) {
        return new PartialSell(item);
    }
}
