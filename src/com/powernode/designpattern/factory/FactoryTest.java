package com.powernode.designpattern.factory;

/**
 * @Author AlanLin
 * @Description
 * @Date 2020/9/18
 */
public class FactoryTest {
    public static void main(String[] args) {
        ProductFactory factory=new ProductFactory1();
        Product object = factory.getObject();
        object.method1();

    }
}
interface Product{
    void method1();
}

class Product1 implements Product{
    @Override
    public void method1() {
        System.out.println("产品1");
    }
}

class Product2 implements Product{
    @Override
    public void method1() {
        System.out.println("产品2");
    }
}

abstract class ProductFactory{
    abstract Product createProduct();

    public Product getObject(){
        Product product=createProduct();
        //...
        //...省略的中间步骤
        return product;
    }
}

class ProductFactory1 extends ProductFactory{
    @Override
    Product createProduct() {
        return new Product1();
    }
}

class ProductFactory2 extends ProductFactory{
    @Override
    Product createProduct() {
        return new Product2();
    }
}
