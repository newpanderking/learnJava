/**
 * Open Free.
 * Code for Open Community, free to use!
 */
package designpattern.builder;

/**
 * @author admin
 * @version $Id AudiBuilder.java, v 0.1 2015-10-18 下午4:33 admin Exp $$
 */
public class AudiBuilder implements Builder {

    /**
     * 要构建的产品
     */
    private Car car;

    public AudiBuilder() {
        this.car = new Car();
    }

    @Override
    public void buildWheel() {
        car.setWheel("Audi wheel!");
    }

    @Override
    public void buildChassis() {
        car.setChassis("Audi chassis!");
    }

    @Override
    public void buildWindow() {
        car.setWindow("Audi window!");
    }

    @Override
    public void buildOther() {
        car.setOther("Audi other!");
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
