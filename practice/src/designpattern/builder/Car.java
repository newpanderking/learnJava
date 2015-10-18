/**
 * Open Free.
 * Code for Open Community, free to use!
 */
package designpattern.builder;

/**
 * @author admin
 * @version $Id Car.java, v 0.1 2015-10-18 下午4:26 admin Exp $$
 */
public class Car {
    /**
     * 轮子
     */
    private String wheel;

    /**
     * 底盘
     */
    private String chassis;

    /**
     * 车窗
     */
    private String window;

    /*****
     * 其他很多属性。。。
     */
    private String other;

    /**
     * Getter method for property <tt>wheel</tt>.
     *
     * @return property value of wheel
     */

    public String getWheel() {
        return wheel;
    }

    /**
     * Setter method for property <tt>wheel</tt>.
     *
     * @param wheel value to be assigned to property wheel
     */
    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    /**
     * Getter method for property <tt>chassis</tt>.
     *
     * @return property value of chassis
     */

    public String getChassis() {
        return chassis;
    }

    /**
     * Setter method for property <tt>chassis</tt>.
     *
     * @param chassis value to be assigned to property chassis
     */
    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    /**
     * Getter method for property <tt>window</tt>.
     *
     * @return property value of window
     */

    public String getWindow() {
        return window;
    }

    /**
     * Setter method for property <tt>window</tt>.
     *
     * @param window value to be assigned to property window
     */
    public void setWindow(String window) {
        this.window = window;
    }

    /**
     * Getter method for property <tt>other</tt>.
     *
     * @return property value of other
     */

    public String getOther() {
        return other;
    }

    /**
     * Setter method for property <tt>other</tt>.
     *
     * @param other value to be assigned to property other
     */
    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheel='" + wheel + '\'' +
                ", chassis='" + chassis + '\'' +
                ", window='" + window + '\'' +
                ", other='" + other + '\'' +
                '}';
    }
}
