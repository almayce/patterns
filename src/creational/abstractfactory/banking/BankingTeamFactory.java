package creational.abstractfactory.banking;

import creational.abstractfactory.Developer;
import creational.abstractfactory.Manager;
import creational.abstractfactory.TeamFactory;
import creational.abstractfactory.Tester;

/**
 * Created by almayce on 05.04.17.
 */
public class BankingTeamFactory implements TeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public Manager getManager() {
        return new ProjectManager();
    }
}
