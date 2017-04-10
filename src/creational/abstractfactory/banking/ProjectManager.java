package creational.abstractfactory.banking;

import creational.abstractfactory.Manager;

/**
 * Created by almayce on 05.04.17.
 */
public class ProjectManager implements Manager {
    @Override
    public void manageProject() {
        System.out.println(this.getClass().getSimpleName() + " manageProject");
    }
}
