/**
 * Open Free.
 * Code for Open Community, free to use!
 */
package designpattern.abstractfactory;

/**
 * @author admin
 * @version $Id BmwFactory.java, v 0.1 2015-10-18 下午2:18 admin Exp $$
 */
public class BmwFactory implements CarFactory {
    @Override
    public SportsCar createSportsCar() {
        return new BmwSports();
    }

    @Override
    public BusinessCar createBusinessCar() {
        return new BmwBusiness();
    }
}
