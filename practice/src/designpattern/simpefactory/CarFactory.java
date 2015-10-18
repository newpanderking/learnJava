/**
 * Open Free.
 * Code for Open Community, free to use!
 */
package designpattern.simpefactory;


/**
 * @author admin
 * @version $Id CarFactory.java, v 0.1 2015-10-18 下午1:06 admin Exp $$
 */
public class CarFactory {
    public static Car createCar(String type){
        if (type.equals("Audi")){
            return new Audi();
        }else if (type.equals("Benz")){
            return new Benz();
        }else if (type.equals("Bmw")){
            return new Bmw();
        }
        return null;
    }
}
