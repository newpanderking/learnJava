/**
 * Open Free.
 * Code for Open Community, free to use!
 */
package callbacktest;

/**
 * @author admin
 * @version $Id Boss.java, v 0.1 2015-10-11 上午11:26 admin Exp $$
 */
public class Boss implements CallBackInterface {
    @Override
    public void excute() {
        System.out.println("收到了，时间：" + System.currentTimeMillis());
    }
}
