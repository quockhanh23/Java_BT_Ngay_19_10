import model.Product;
import service.Note;
import service.ProductService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        productService.addProduct(new Product(1, "Mũ bảo hiểm", 2000, "china"));
        productService.addProduct(new Product(2, "Bàn chải", 1000, "china"));
        productService.addProduct(new Product(3, "Tăm", 3000, "Mexico"));
        productService.addProduct(new Product(4, "Dây điện", 13000, "America"));
        productService.addProduct(new Product(5, "Bàn là", 6000, "America"));

        int choice = -1;
        while (choice != 0) {
            Scanner scanner = new Scanner(System.in);
            Note.alertMenu();
            try {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        productService.print();
                        break;
                    case 2:
                        int delete = scanner.nextInt();
                        productService.deleteById(delete);
                        productService.print();
                        break;
                    case 3:
                        int find = scanner.nextInt();
                        productService.findIndexById(find);
                        System.out.println(productService.findIndexById(find));
                        break;
                    case 4:
                        productService.sortByPriceDown();
                        productService.print();
                        break;
                    case 5:
                        productService.sortByPriceUp();
                        productService.print();
                        break;
                    case 6:
                        productService.sortByName();
                        productService.print();
                        break;
                    case 7:
                        System.out.println(productService.create());
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println(choice + " không có trong mục lục mời nhập lại");
                        break;
                }
            } finally {
                System.out.println("Xong");
            }
        }
    }
}



