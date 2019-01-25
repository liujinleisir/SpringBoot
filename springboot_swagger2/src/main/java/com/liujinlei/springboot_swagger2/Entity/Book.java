package com.liujinlei.springboot_swagger2.Entity;
/**
 * Title:
 * Description:
 *
 * @author liujinlei
 * @version 1.0
 */
public class Book {
    private Long id;
    private String name;
    private String price;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
