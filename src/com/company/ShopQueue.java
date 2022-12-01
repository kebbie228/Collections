package com.company;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class ShopQueue {
    public static void main(String[] args) {
        Buyer buyer3=new Buyer(BuyerType.REGULAR);
        Buyer buyer1=new Buyer(BuyerType.VETERAN);
        Buyer buyer2=new Buyer(BuyerType.CHILD);
       Seller seller=new Seller();
       Product product1=new Product("Apple",10);
        Product product2=new Product("Bread",100);
        Product product3=new Product("Bread",100);

        buyer1.basket.add(product2);
        buyer1.basket.add(product3);

        buyer2.basket.add(product1);
        buyer2.basket.add(product1);

        buyer3.basket.add(product1);
        buyer3.basket.add(product2);
        buyer3.basket.add(product3);

        PriorityQueue<Buyer> priorityQueue=new PriorityQueue<>();
        priorityQueue.add(buyer3);
        priorityQueue.add(buyer1);
        priorityQueue.add(buyer2);

        int sum=0;
        while (priorityQueue.isEmpty()){
         Buyer buyer=priorityQueue.poll();
         sum+=seller.calc(buyer);
            System.out.println(buyer.type);
            System.out.println(sum);
        }

    }
}

class Product{
    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

}
enum BuyerType{VETERAN,CHILD,REGULAR}

class Buyer implements  Comparable{
    public Buyer(BuyerType type) {
        this.type = type;
    }

    BuyerType type;
public ArrayList<Product> basket=new ArrayList<>();

    @Override
    public int compareTo(Object o) {
        int type1=this.type.ordinal();
        int type2=((Buyer)o).type.ordinal();

        return type1-type2;
    }
}
class Seller{
    public int calc(Buyer buyer){
        return buyer.basket.stream()
                .mapToInt(product-> product.price)
                .sum();
    }
}