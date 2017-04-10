package creational.abstractfactory.website;

import creational.abstractfactory.Tester;

/**
 * Created by almayce on 05.04.17.
 */
public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println(this.getClass().getSimpleName() + " testCode");
    }
}
