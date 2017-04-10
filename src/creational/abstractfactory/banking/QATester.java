package creational.abstractfactory.banking;

import creational.abstractfactory.Tester;

/**
 * Created by almayce on 05.04.17.
 */
public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println(this.getClass().getSimpleName() + " testCode");
    }
}
