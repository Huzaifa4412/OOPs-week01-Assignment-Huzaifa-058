package week06uniqueclasspractice;

public class Main {
    public static void main(String[] args) {
        try {
            Order original = new Order(101, "Laptop");
            Order copy = (Order) original.clone();

            copy.item.name = "Smartphone";

            System.out.println("Original Item: " + original.item.name);
            System.out.println("Cloned Item: " + copy.item.name);
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported: " + e.getMessage());
        }
    }
}
