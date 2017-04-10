package creational.abstractfactory.website;

import creational.abstractfactory.Manager;

/**
 * Created by almayce on 05.04.17.
 */
public class WebsiteManager implements Manager {
    @Override
    public void manageProject() {
        System.out.println(this.getClass().getSimpleName() + " manageProject");
    }
}
