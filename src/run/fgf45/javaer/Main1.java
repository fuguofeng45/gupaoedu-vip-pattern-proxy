package run.fgf45.javaer;

import run.fgf45.javaer.test.IShoes;
import run.fgf45.javaer.test.NikeShoe;
import run.fgf45.javaer.test.ShoeProxy;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description:
 * @date 2020/3/2119:57
 */
public class Main1 {

    public static void main(String[] args) {
        IShoes shoe = (IShoes)new ShoeProxy().getProxyInstance(new NikeShoe());
        shoe.canRun();
    }

}
