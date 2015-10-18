/**
 * Open Free.
 * Code for Open Community, free to use!
 */
package designpattern.simpefactory;

/**
 * @author admin
 * @version $Id Customer.java, v 0.1 2015-10-18 下午1:16 admin Exp $$
 */
public class Customer {
    public static void main(String[] args) {
        //生产一个宝马
        Car car = CarFactory.createCar("Bmw");
        if (car == null){
            System.out.println("Procuct Bmw failed!");
        }

        //生产一个奥迪
        Car car1 = CarFactory.createCar("Audi");
        if (car1 == null){
            System.out.println("Product Audi failed!");
        }

        //生产一个奔驰
        Car car2 = CarFactory.createCar("Benz");
        if (car2 == null){
            System.out.println("Product Benz failed!");
        }

        //生产一个大众
        Car car3 = CarFactory.createCar("dazhong");
        if (car3 == null){
            System.out.println("Product 大众 failed!");
        }


    }
}
