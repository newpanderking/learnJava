/**
 * Open Free.
 * Code for Open Community, free to use!
 */
package designpattern.abstractfactory;

/**
 * @author admin
 * @version $Id CarFactory.java, v 0.1 2015-10-18 下午1:06 admin Exp $$
 */
public interface CarFactory {

    public SportsCar createSportsCar();

    public BusinessCar createBusinessCar();
}
