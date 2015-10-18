/**
 * Open Free.
 * Code for Open Community, free to use!
 */
package designpattern.builder;

/**
 * @author admin
 * @version $Id Builder.java, v 0.1 2015-10-18 下午4:29 admin Exp $$
 */
public interface Builder {
    /**
     * 建造轮子
     */
    public void buildWheel();

    /**
     * 建造底盘
     */
    public void buildChassis();

    /**
     * 建造窗户
     */
    public void buildWindow();

    /**
     * 建造其他部件
     */
    public void buildOther();

    /**
     * 返回构建的产品
     * @return
     */
    public Car getCar();

}
