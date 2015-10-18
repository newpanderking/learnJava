/**
 * Open Free.
 * Code for Open Community, free to use!
 */
package designpattern.builder;

/**
 * @author admin
 * @version $Id Director.java, v 0.1 2015-10-18 下午4:39 admin Exp $$
 */
public class Director {
    private Builder builder;
    public void constroct(){
        builder.buildWindow();
        builder.buildChassis();
        builder.buildWheel();
        builder.buildOther();
    }
    /**
     * Getter method for property <tt>builder</tt>.
     *
     * @return property value of builder
     */

    public Builder getBuilder() {
        return builder;
    }

    /**
     * Setter method for property <tt>builder</tt>.
     *
     * @param builder value to be assigned to property builder
     */
    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
}
