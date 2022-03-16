package com.example.lab5;

public class Donut {
    private int id;
    private String name;
    private String dep;
    private String price;


    public Donut(int id, String name, String dep, String price) {
        this.id = id;
        this.name = name;
        this.dep = dep;
        this.price = price;
    }

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

    public void setDep(String dep) {
        this.dep = dep;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDep() {
        return dep;
    }

    public String getPrice() {
        return price;
    }
}
