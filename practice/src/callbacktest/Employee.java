/**
 * Open Free.
 * Code for Open Community, free to use!
 */
package callbacktest;

/**
 * @author admin
 * @version $Id Employee.java, v 0.1 2015-10-11 上午11:29 admin Exp $$
 */
public class Employee {
    private CallBackInterface callBack;

    /**
     * 注册回调函数
     * @param callBack
     */
    public void setCallBack(CallBackInterface callBack) {
        this.callBack = callBack;
    }

    public void doWork() {
        System.out.println("工作做完了！时间：" + System.currentTimeMillis());
        this.callBack.excute();
    }
}
