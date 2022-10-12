package gent.maker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProducMagager {
   static ArrayList<Product> arrayList = new ArrayList<>();

    public static void main(String[] args) {

        do {
            System.out.println("  ----   ----");
            System.out.println("1. Them san pham ");
            System.out.println("2. Sua thong tin san pham theo ID");
            System.out.println("3. Xoa san pham thoe ID ");
            System.out.println("4. Hien thi san pham ");
            System.out.println("5. Tim kiem san pham theo ten ");
            System.out.println("6. Sap xep san pham thoe gia tang, giam dan");
            Scanner sc = new Scanner(System.in);
            int pick = Integer.parseInt(sc.nextLine());
            switch (pick){
                case 1:
                    System.out.println("Nhap so san pham muon them : ");
                    int inputPro = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < inputPro; i++) {
                        Product newProduct = new Product() {
                            @Override
                            public int compareTo(Object o) {
                                return 0;
                            }
                        };
                        newProduct.inputData();
                        arrayList.add(newProduct);
                    }
                    break;
                case 2:
                    System.out.println("Nhap vao ID thong tin muon sua");
                    for (Product pr : arrayList) {
                        System.out.println(pr);
                    }
                    int idPro = Integer.parseInt(sc.nextLine());
                    for (Product pr : arrayList) {
                        if(idPro == pr.getIdProduc()){
                            pr.display();
                            System.out.println("Nhap vao thong tin moi :");
                            pr.inputData();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Nhap vao ID san pham muon xoa : ");
                    for (Product pr : arrayList ) {
                        System.out.println(pr);
                    }
                    int pickID = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < arrayList.size(); i++) {
                        if(pickID == arrayList.get(i).getIdProduc()){
                            arrayList.remove(arrayList.get(i));
                        }
                    }
                    break;
                case 4:
                    for (Product pr : arrayList ) {
                        pr.display();
                    }
                    break;
                case 5:
                    System.out.println("Nhap ten san pham muon tim kiem : ");
                    String namePro = sc.nextLine();
                    for (Product pr : arrayList) {
                        if(pr.getName().contains(namePro)){
                            pr.display();
                        }else {
                            System.out.println(" Khong co thong tin !");
                        }
                    }
                    break;
                case 6:
                    System.out.println("Gia tang dan : ");
                    sortACS();
                    for (Product pe : arrayList) {
                        pe.display();
                    }
                    System.out.println(" ");
                    sortDES();
                    for (Product pe : arrayList) {
                        pe.display();
                    }
                   break;
                case 7:
                    System.exit(0);
            }
        }while (true);






    }
    public static void sortACS(){
        Collections.sort(arrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) o1.getPrice() - (int) o2.getPrice();
            }
        });
    }
    public static void sortDES(){
        Collections.sort(arrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return -(int) o1.getPrice() - (int) o2.getPrice();
            }
        });
    }

}
