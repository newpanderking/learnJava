/**
 * Open Free.
 * Code for Open Community, free to use!
 */
package designpattern.abstractfactory;

/**
 * @author admin
 * @version $Id AudiFactory.java, v 0.1 2015-10-18 下午2:15 admin Exp $$
 */
public class AudiFactory implements CarFactory {
    @Override
    public SportsCar createSportsCar() {
        return new AudiSports();
    }

    @Override
    public BusinessCar createBusinessCar() {
        return new AudiBusiness();
    }
}
