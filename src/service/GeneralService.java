package service;

public interface GeneralService<T> {

    int findIndexById(int id);

    void add(T t);

    void update(T t, int id);

    void deleteById(int id);

    void print();

    void sortByPriceUp();

    void sortByPriceDown();

    void sortByName();

}
