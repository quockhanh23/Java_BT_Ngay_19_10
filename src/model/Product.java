package model;

public class Product {
    private int id;
    private String name;
    private int price;
    private String made;
    private static String addres = "Nhà số 3";

    public Product(int id, String name, int price, String made) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.made = made;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", made='" + made + '\'' + ", Địa chỉ mua sản phẩm: " + addres +
                '}';
    }
}
