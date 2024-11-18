package vn.hcmute.demo3_security.Services;

import vn.hcmute.demo3_security.entity.Product;

import java.util.List;

public interface ProductServices {
    void delete(Long id);
    Product get(Long id);
    Product save (Product product);
    List<Product> listAll();
}