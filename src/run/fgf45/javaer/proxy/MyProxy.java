package run.fgf45.javaer.proxy;

import java.io.ObjectInputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description:
 * @date 2020/3/1723:30
 */
public class MyProxy {

    private Object target;

    //给目标对象生成代理对象
    public Object getProxyInstance(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("开始事务2");
                    Object returnValue = method.invoke(target, args);
                    System.out.println("提交事务2");
                    return returnValue;
                }
        );
    }
}
