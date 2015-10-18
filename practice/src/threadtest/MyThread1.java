/**
 * Open Free.
 * Code for Open Community, free to use!
 */
package threadtest;

import callbacktest.Boss;
import callbacktest.Employee;

/**
 * @author admin
 * @version $Id MyThread.java, v 0.1 2015-10-11 下午12:31 admin Exp $$
 */
public class MyThread1 implements Runnable {
    private String threadName;

    @Override
    public void run() {
        System.out.println(threadName + ":开始执行线程。");
        Employee employee = new Employee();
        employee.setCallBack(new Boss());
        employee.doWork();
        System.out.println(threadName + ":结束执行线程。");
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }
}
