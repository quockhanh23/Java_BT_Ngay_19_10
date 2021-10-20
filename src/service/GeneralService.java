package service;

import model.Product;

public interface GeneralService<T> {

    int findIndexById(int id);

    void findIndexByName( String name);

    void addProduct(T t);

    void update(T t, int id);

    void deleteById(int id);

    void print();

    void sortByPriceUp();

    void sortByPriceDown();

    void sortByName();

    Product create();
    void disPlay();

}
