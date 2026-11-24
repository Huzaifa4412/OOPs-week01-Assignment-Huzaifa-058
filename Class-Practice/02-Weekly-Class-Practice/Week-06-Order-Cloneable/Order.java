package week06uniqueclasspractice;

class Item implements Cloneable {
    String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Order implements Cloneable {
    int orderId;
    Item item;

    public Order(int orderId, String itemName) {
        this.orderId = orderId;
        this.item = new Item(itemName);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Order clonedOrder = (Order) super.clone();
        clonedOrder.item = (Item) this.item.clone();
        return clonedOrder;
    }
}