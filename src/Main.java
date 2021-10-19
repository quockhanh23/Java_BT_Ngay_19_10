import model.Product;
import service.ProductService;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        productService.add(new Product(1, "Khánh2", 2000, "china"));
        productService.add(new Product(2, "Khánh5", 1000, "china"));
        productService.add(new Product(3, "Khánh3", 3000, "china"));
        productService.add(new Product(4, "Khánh4", 13000, "America"));
        productService.sortByName();
        productService.print();
        System.out.println("======================================================================================");
        productService.sortByPriceUp();
        productService.print();
        System.out.println("======================================================================================");




    }
}
