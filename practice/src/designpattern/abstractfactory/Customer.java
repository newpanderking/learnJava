/**
 * Open Free.
 * Code for Open Community, free to use!
 */
package designpattern.abstractfactory;

/**
 * @author admin
 * @version $Id Customer.java, v 0.1 2015-10-18 下午1:16 admin Exp $$
 */
public class Customer {
    public static void main(String[] args) {
        /**生产宝马*/
        CarFactory carFactory = new BmwFactory();
        //跑车
        SportsCar sportsCar = carFactory.createSportsCar();
        //商务车
        BusinessCar businessCar = carFactory.createBusinessCar();

        /**生产奥迪*/
        carFactory = new AudiFactory();
        //跑车
        sportsCar = carFactory.createSportsCar();
        //商务车
        businessCar = carFactory.createBusinessCar();

        /**生产一个奔驰*/
        carFactory = new BmwFactory();
        //跑车
        sportsCar = carFactory.createSportsCar();
        //商务车
        businessCar = carFactory.createBusinessCar();

    }
}
