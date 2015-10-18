/**
 * Open Free.
 * Code for Open Community, free to use!
 */
package designpattern.builder;

/**
 * @author admin
 * @version $Id Customer.java, v 0.1 2015-10-18 下午4:39 admin Exp $$
 */
public class Customer {
    public static void main(String[] args) {
        //建一个奥迪Audi
        Builder builder = new AudiBuilder();
        //流程控制师
        Director director = new Director();
        //注入构建audi的建造
        director.setBuilder(builder);
        director.constroct();
        Car car = builder.getCar();
        System.out.println(car);


        //建造一个宝马
        builder = new BmwBuilder();
        //注入构建audi的建造
        director.setBuilder(builder);
        director.constroct();
        car = builder.getCar();
        System.out.println(car);
    }
}
