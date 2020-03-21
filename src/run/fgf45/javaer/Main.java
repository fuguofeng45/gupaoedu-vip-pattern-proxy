package run.fgf45.javaer;

import run.fgf45.javaer.proxy.Man;
import run.fgf45.javaer.proxy.MyProxy;
import run.fgf45.javaer.proxy.Person;

/**
 * @author fuguofeng
 * @Title:
 * @Package
 * @Description: 代理模式作用：AOP实现，拦截器，中介，黄牛，媒婆，解耦，专人做专事，增强
 * @date 2020/3/17 23:06
 */
public class Main {

    public static void main(String[] args) {
        Person person = (Person) new MyProxy().getProxyInstance(new Man());
        System.out.println(person.getClass());
        person.findLove();
        //1，拿到被代理对象的引用，并且获取到所有的接口
        //2，JDK Proxy类重新生成一个新的类，同时新的类实现被代理类的所有的实现方法
        //3，把新加的业务逻辑方法由一定的逻辑代码去调用
        //4，编译新生成的java文件
        //5，在重新加载到JVM
        //以上为字节码重组
    }

}
