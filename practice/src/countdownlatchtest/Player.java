/**
 * Open Free.
 * Code for Open Community, free to use!
 */
package countdownlatchtest;

import java.util.concurrent.CountDownLatch;

/**
 * @author admin
 * @version $Id Player.java, v 0.1 2015-10-12 下午7:12 admin Exp $$
 */
public class Player implements Runnable {
    private int            id;
    private CountDownLatch singleone;
    private CountDownLatch all;

    public Player(int i, CountDownLatch singleone, CountDownLatch all) {
        super();
        this.id = i;
        this.singleone = singleone;
        this.all = all;
    }

    @Override
    public void run() {
        try {
            singleone.await();
            Thread.sleep((long) (Math.random() * 100));
            System.out.println("Player " + id + " arrived!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            all.countDown();
        }

    }

}
