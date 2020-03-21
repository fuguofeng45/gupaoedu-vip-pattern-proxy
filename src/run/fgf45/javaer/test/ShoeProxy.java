package run.fgf45.javaer.test;

import java.lang.reflect.Proxy;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description:
 * @date 2020/3/2119:57
 */
public class ShoeProxy {

    private Object target;

    public Object getProxyInstance(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println(1);
                    Object returnObject = method.invoke(target, args);
                    System.out.println(2);
                    return returnObject;
                }
        );
    }

}
