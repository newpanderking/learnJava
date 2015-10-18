/**
 * Open Free.
 * Code for Open Community, free to use!
 */
package designpattern.builder;

/**
 * @author admin
 * @version $Id BmwBuilder.java, v 0.1 2015-10-18 下午4:34 admin Exp $$
 */
public class BmwBuilder implements Builder {

    /**
     * 要构建的产品
     */
    private Car car;

    public BmwBuilder() {
        this.car = new Car();
    }

    @Override
    public void buildWheel() {
        car.setWheel("Bmw wheel!");
    }

    @Override
    public void buildChassis() {
        car.setChassis("Bmw chassis!");
    }

    @Override
    public void buildWindow() {
        car.setWindow("Bmw window!");
    }

    @Override
    public void buildOther() {
        car.setOther("Bmw other!");
    }

    /**
     * Getter method for property <tt>car</tt>.
     *
     * @return property value of car
     */

    public Car getCar() {
        return car;
    }

    /**
     * Setter method for property <tt>car</tt>.
     *
     * @param car value to be assigned to property car
     */
    public void setCar(Car car) {
        this.car = car;
    }
}
