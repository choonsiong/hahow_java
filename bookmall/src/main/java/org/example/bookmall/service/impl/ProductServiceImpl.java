package org.example.bookmall.service.impl;

import org.example.bookmall.dao.ProductDao;
import org.example.bookmall.model.Product;
import org.example.bookmall.service.ProductService;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    private final ProductDao productDao;

    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

}
