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
        if (type.equals("AudiBusiness")){
            return new Audi();
        }else if (type.equals("BenzBusiness")){
            return new Benz();
        }else if (type.equals("BmwBusiness")){
            return new Bmw();
        }
        return null;
    }
}
