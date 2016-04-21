package p.training.integration.lab04.order;

public class OrderItem {

    private Long id;
    private Coffee coffee;

    public OrderItem() {
    }

    public OrderItem(Coffee coffee) {
        this.coffee = coffee;
    }

    public Coffee getCoffee() {
        return coffee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderItem orderItem = (OrderItem) o;

        return coffee != null ? coffee.equals(orderItem.coffee) : orderItem.coffee == null;

    }

    @Override
    public int hashCode() {
        return coffee != null ? coffee.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", coffee=" + coffee +
                '}';
    }

}
