/**
 * Open Free.
 * Code for Open Community, free to use!
 */
package designpattern.factorymethod;

/**
 * @author admin
 * @version $Id BusinessCarFactory.java, v 0.1 2015-10-18 下午1:36 admin Exp $$
 */
public class BenzFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Benz();
    }
}
