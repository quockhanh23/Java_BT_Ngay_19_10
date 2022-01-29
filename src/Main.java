import model.Product;
import service.ProductService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        productService.addProduct(new Product(1, "Mũ bảo hiểm giá rẻ", 2000, "china"));
        productService.addProduct(new Product(2, "Bàn chải đánh răng", 1000, "china"));
        productService.addProduct(new Product(3, "Tăm", 3000, "Mexico"));
        productService.addProduct(new Product(4, "Dây điện", 13000, "America"));

        int choice = -1;
        while (choice != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Mục lục: ");
            System.out.println("1. In danh sách sản phẩm có sẵn.");
            System.out.println("2. Xóa phần tử trong danh sách.");
            System.out.println("3. Tìm kiếm sản phẩm theo id.");
            System.out.println("4. Sắp xếp sản phẩm theo giá tăng dần.");
            System.out.println("5. Sắp xếp sản phẩm theo giá giảm dần.");
            System.out.println("6. Sắp xếp sản phẩm theo tên.");
            System.out.println("7. Thêm 1 sản phẩm.");
            System.out.println("0. Kết thúc chương trình.");
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
                    default:
                        System.out.println("/************************************/");
                        System.out.println(choice + " không có trong mục lục mời nhập lại");

                        System.out.println("=================  ==================");
                        System.out.println("=====================================");
                }
            } catch (Exception e) {
                System.out.println("Lỗi");
            }
        }
    }
}



