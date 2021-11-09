package service;

import model.Product;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ProductService implements GeneralService<Product> {
    private ArrayList<Product> listProduct;

    public ProductService(ArrayList<Product> listProduct) {
        this.listProduct = listProduct;
    }

    public ProductService() {
        listProduct = new ArrayList<>();
    }


    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId() == id) {
                return i;

            }
        }
        return -1;
    }

    @Override
    public void findIndexByName(String name) {

        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getName().equals(name)) {
                System.out.println(listProduct.get(i));

            }
        }
    }
    @Override
    public void addProduct(Product product) {
        listProduct.add(product);

    }

    @Override
    public void update(Product product, int id) {
        int index = findIndexById(id);
        listProduct.set(index, product);

    }

    @Override
    public void deleteById(int id) {
        int index = findIndexById(id);
        listProduct.remove(index);


    }

    @Override
    public void print() {
        for (int i = 0; i < listProduct.size(); i++) {
            System.out.println(listProduct.get(i));
        }

    }

    @Override
    public void sortByPriceUp() {
        listProduct.sort(Comparator.comparingInt(Product::getPrice));
    }

    @Override
    public void sortByPriceDown() {
        listProduct.sort((p1, p2) -> p2.getPrice() - p1.getPrice());
    }

    @Override
    public void sortByName() {
        listProduct.sort(Comparator.comparing(Product::getName));
    }

    @Override
    public Product create() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập nơi sản suất: ");
        String made = scanner.nextLine();
        System.out.print("Nhập id: ");
        int id = scanner.nextInt();
        System.out.print("Nhập giá tiền: ");
        int price = scanner.nextInt();
        return new Product(id, name, price, made);
    }

    @Override
    public void disPlay() {
    }

}




