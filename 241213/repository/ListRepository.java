package repository;

import myInterface.ArrayListInterface;
import vo.Product;

import java.util.ArrayList;
import java.util.List;

public class ListRepository implements ArrayListInterface {
    @Override
    public boolean insert(Product product) {
        InitArratList.productList.add(product);
        System.out.println(InitArratList.productList);
        return true;
    }

    @Override
    public boolean update(int index, Product product) {
        InitArratList.productList.set(index, product);
        return true;
    }

    @Override
    public boolean delete(int index) {
        InitArratList.productList.remove(index);
        return false;
    }

    @Override
    public Product findByName(String name) {
        for (Product x : InitArratList.productList) {
            if (x.getItem().equals(name)) {
                return x;
            }
        }
        return null;
    }

    @Override
    public int findIndex(String name) {
        for (Product x : InitArratList.productList) {
            if (x.getItem().equals(name)) {
                return InitArratList.productList.indexOf(x);
            }
        }
        return -1;
    }

    @Override
    public List<Product> findAll() {
        return InitArratList.productList;
    }
}
