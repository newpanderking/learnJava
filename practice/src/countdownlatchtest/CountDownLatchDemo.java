/**
 * Open Free.
 * Code for Open Community, free to use!
 */
package countdownlatchtest;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author admin
 * @version $Id CountDownLatchDemo.java, v 0.1 2015-10-12 下午7:09 jason.wzr Exp $$
 */
public class CountDownLatchDemo {
    private static final int PALAYER_AMOUNT = 5;

    public CountDownLatchDemo() {
        //TODO
    }

    public static void main(String[] args) {
        //每一位运动员，countdownlatch减1后，他的比赛就结束
        CountDownLatch singleone = new CountDownLatch(1);
        //对于整个比赛，所有运动员跑完整个比赛才结束
        CountDownLatch all = new CountDownLatch(PALAYER_AMOUNT);

        Player[] players = new Player[PALAYER_AMOUNT];
        for (int i = 0; i < PALAYER_AMOUNT; i++) {
            players[i] = new Player(i + 1, singleone, all);
        }

        //设置特定的线程池大小
        ExecutorService exe = Executors.newFixedThreadPool(PALAYER_AMOUNT);
        for (Player p : players) {
            exe.execute(p);
        }
        System.out.println("Race begin!");
        singleone.countDown();
        try {
            all.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Race end!");
        }
        exe.shutdown();
    }

}
