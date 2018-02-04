package EPAM_LECTURE_10.COFFEE_POINT.model;


import java.util.LinkedList;
import java.util.List;

public class Order {
    private double sum;
    private List<Product> goods = new LinkedList<>();

    public Order() {

    }

    public void addProduct(Product product){
        this.goods.add(product);
        this.sum += product.getPrice();
    }

    public List<Product> getGoods() {
        return goods;
    }

    public double getSum() {
        return sum;
    }

}
