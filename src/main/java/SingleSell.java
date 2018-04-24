import calendar.BlackDaysCalendar;
import calendar.NoneCalendar;

import java.util.Arrays;
import java.util.List;

public class SingleSell implements Sell {
    private final Item item;
    private final Shipment shipment;

    public SingleSell(Item item, Shipment shipment) {
        this.item = item;
        this.shipment = shipment;
    }

    public Fee fee() {
        return this.fee(new NoneCalendar());
    }

    @Override
    public Cost cost() {
        return item.acumulateCost(shipment);
    }

    public Fee fee(BlackDaysCalendar calendar) {
        Rival policy = new FeeBasedOnDefault(this.item, this.shipment);
        List<Rival> policies = Arrays.asList(
            new FeeBasedOnCalendar(this.item, this.shipment, calendar ),
            new FeeBasedOnItemPriceBiggerThan(this.item, this.shipment, 1000.0)
        );

        for(Rival r : policies) {
            policy = policy.oust(r);
        }

        return policy.calculate();
    }

    public PartialSell and(Item item) {
        return new PartialSell(this).and(item);
    }
}
