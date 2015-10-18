/**
 * Open Free.
 * Code for Open Community, free to use!
 */
package threadtest;

/**
 * @author admin
 * @version $Id MyThread.java, v 0.1 2015-10-11 下午12:31 admin Exp $$
 */
public class MyThread extends Thread {
    private long   sleetTime = 0;
    private String threadName;

    @Override
    public void run() {
        super.run();
        System.out.println(threadName + ":开始执行线程。");
        try {
            sleep(sleetTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadName + ":结束执行线程。");
    }

    public void setSleetTime(long sleetTime) {
        this.sleetTime = sleetTime;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }
}
