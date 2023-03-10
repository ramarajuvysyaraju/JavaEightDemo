package StreamDemo;

import com.sun.jna.platform.unix.X11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<Product>();

        for(Product product: getProducts()){
           if(product.getPrice()>25000f)

               list.add(product);

        }


for(Product product :list){
    System.out.println(product);

}


        System.out.println("************Filter Start***************");

        //using stream api

  getProducts()
                                .stream()
                                    .filter((product) -> product.getPrice()>25000f)
                                        .forEach(System.out::println);

        System.out.println("**********Filter End*****************");
    }

    private static List<Product> getProducts(){

        List<Product> producesLists= new ArrayList<Product>();
        producesLists.add(new Product( 1,"Dell",25000f,20));
        producesLists.add(new Product(2,"HP",35000f,40));
        producesLists.add(new Product(3,"Lenovo",30000f,30));
        producesLists.add(new Product(4,"Apple",80000f,28));
        producesLists.add(new Product(5,"Toshiba",50000f,31));
        return producesLists;

    }














}


class Product{



    private String name;
    private int id;
    private float price;
    private int sal;

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
       this.sal = sal;
    }




    public Product( int id,String name, float price, int sal) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.sal=sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


}