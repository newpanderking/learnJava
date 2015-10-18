/**
 * Open Free.
 * Code for Open Community, free to use!
 */
package threadtest;

/**
 * @author admin
 * @version $Id Test.java, v 0.1 2015-10-11 下午12:33 admin Exp $$
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 测试MyThread 继承于Thread类
         */
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        thread1.setSleetTime(1500);
        thread1.setThreadName("thread1");
        thread2.setSleetTime(1000);
        thread2.setThreadName("thread2");
        thread1.start();
        thread2.start();
        /**
         * 测试MyThread 实现Runnable
         */
        MyThread1 thread3 = new MyThread1();
        thread3.setThreadName("thread3");
        Thread thread = new Thread(thread3);
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        try {
            thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getState());
    }
}
