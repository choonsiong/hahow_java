package org.example.bookmall.dao.impl;

import org.example.bookmall.dao.ProductDao;
import org.example.bookmall.model.Product;
import org.example.bookmall.rowmapper.ProductRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public Product getProductById(Integer productId) {
        String sql = "SELECT product_id, product_name, category, image_url, price, stock, description, created_date, last_modified_date FROM product WHERE product_id = :productId";

        Map<String, Object> map = new HashMap<>();
        map.put("productId", productId);

        List<Product> products = jdbcTemplate.query(sql, map, new ProductRowMapper());

        if (products != null && products.size() > 0) {
            return products.get(0);
        }

        return null;
    }
}
