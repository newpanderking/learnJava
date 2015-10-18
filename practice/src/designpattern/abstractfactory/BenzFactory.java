/**
 * Open Free.
 * Code for Open Community, free to use!
 */
package designpattern.abstractfactory;

/**
 * @author admin
 * @version $Id BenzFactory.java, v 0.1 2015-10-18 下午2:17 admin Exp $$
 */
public class BenzFactory implements CarFactory {
    @Override
    public SportsCar createSportsCar() {
        return new BenzSports();
    }

    @Override
    public BusinessCar createBusinessCar() {
        return new BenzBusiness();
    }
}
