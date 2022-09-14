import java.util.List;

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return  name + ":"
                + price
                + "\n"
                ;
    }
    public int getOrderValue(List<String> selectedItemNames) {
        int orderValue = 0;
        return orderValue;
    }

}
