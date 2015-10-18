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
 * @version $Id SQLString.java, v 0.1 2015-10-11 下午3:28 admin Exp $$
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQLString {
    int value() default 0;

    String name() default "";

    Constraints constraints() default @Constraints;
}
