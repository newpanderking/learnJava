/**
 * Open Free.
 * Code for Open Community, free to use!
 */
package callbacktest;

/**
 * @author admin
 * @version $Id Test.java, v 0.1 2015-10-11 下午12:25 admin Exp $$
 */
public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setCallBack(new Boss());
        employee.doWork();
    }

}
