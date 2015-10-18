/**
 * Open Free.
 * Code for Open Community, free to use!
 */
package designpattern.factorymethod;

/**
 * @author admin
 * @version $Id Customer.java, v 0.1 2015-10-18 下午1:16 admin Exp $$
 */
public class Customer {
    public static void main(String[] args) {
        //生产一个宝马
        CarFactory carFactory = new BmwFactory();
        Car car = carFactory.createCar();
        if (car == null) {
            System.out.println("Procuct BmwBusiness failed!");
        }
        //生产一个奥迪
        carFactory = new AudiFactory();
        Car car1 = carFactory.createCar();
        if (car1 == null) {
            System.out.println("Product AudiBusiness failed!");
        }
        //生产一个奔驰
        carFactory = new BenzFactory();
        Car car2 = carFactory.createCar();
        if (car2 == null) {
            System.out.println("Product BenzBusiness failed!");
        }
    }
}
