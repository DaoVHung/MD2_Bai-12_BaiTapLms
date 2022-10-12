package gent.maker;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public abstract class Product implements Comparable, ProductPri {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private int price;
    private int idProduc;
    private boolean status;

    public Product(String name, int price, int idProduc, boolean status) {
        this.name = name;
        this.price = price;
        this.idProduc = idProduc;
        this.status = status;
    }

    public Product() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getIdProduc() {
        return idProduc;
    }

    public void setIdProduc(int idProduc) {
        this.idProduc = idProduc;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public void inputData(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap vao id : ");
        this.idProduc = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao name : ");
        this.name = sc.nextLine();
        System.out.println("Nhap vao gia ban : ");
        this.price = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap trang thai");
        this.status = Boolean.parseBoolean(sc.nextLine());
    }
    public void display(){
        System.out.println("San Pham : \n " +
                "   Product: " + this.idProduc +
                ",   Price:" + this.price +
                ",   Status:" + this.status);
    }

    public String toString(){
        return "San Pham : \n " +
                "  ProductID: " + this.idProduc +
                ",   Price:" + this.price +
                ",   Status:" + this.status;
    }






}
