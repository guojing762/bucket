package com.guojing.family.discoverydubboexamplefacade.model;

/**
 * @Author: guojing
 * @Date: 2019/4/18 15:58
 */
public class Goods {
    private int id;
    private String name;
    private double price;
    private int num;
    private String color;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Goods [id=" + id + ", name=" + name + ", price=" + price
                + ", num=" + num + ", color=" + color + "]";
    }

}