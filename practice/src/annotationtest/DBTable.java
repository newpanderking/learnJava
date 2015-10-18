/**
 * Open Free.
 * Code for Open Community, free to use!
 */
package annotationtest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author admin
 * @version $Id DBTable.java, v 0.1 2015-10-11 下午3:24 admin Exp $$
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DBTable {
    public String name() default "";
}
