import calendar.BlackDaysCalendar;

public class FeeBasedOnCalendar implements Rival {
    private final BlackDaysCalendar calendar;
    private final Item item;
    private final Shipment shipment;


    public FeeBasedOnCalendar(Item item, Shipment shipment, BlackDaysCalendar calendar) {
        this.calendar = calendar;
        this.item = item;
        this.shipment = shipment;
    }

    @Override
    public Fee calculate() {
        return item.percentage(3.5);
    }

    @Override
    public Rival oust(Rival policy) {
        if ( this.calendar.isBlack() ) {
            return this;
        }

        return new FeeBasedOnDefault(this.item, this.shipment);
    }
}
