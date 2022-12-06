package com.nest.productapp2_backend.controller;


import com.nest.productapp2_backend.dao.ProductDao;
import com.nest.productapp2_backend.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductDao dao;


    @PostMapping("/add")
    public String ProductAdd(@RequestBody Product p)
    {
        System.out.println(p.getPname().toString());
        dao.save(p);
        return "product the add";
    }

    @GetMapping("/view")
    public List<Product> View()
    {
        return (List<Product>) dao.findAll();
    }
}
