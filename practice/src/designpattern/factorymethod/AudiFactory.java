/**
 * Open Free.
 * Code for Open Community, free to use!
 */
package designpattern.factorymethod;

/**
 * @author admin
 * @version $Id SportsCarFactory.java, v 0.1 2015-10-18 下午1:35 admin Exp $$
 */
public class AudiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}
