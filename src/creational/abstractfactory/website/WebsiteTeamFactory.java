package creational.abstractfactory.website;

import creational.abstractfactory.Developer;
import creational.abstractfactory.Manager;
import creational.abstractfactory.TeamFactory;
import creational.abstractfactory.Tester;

/**
 * Created by almayce on 05.04.17.
 */
public class WebsiteTeamFactory implements TeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public Manager getManager() {
        return new WebsiteManager();
    }
}
