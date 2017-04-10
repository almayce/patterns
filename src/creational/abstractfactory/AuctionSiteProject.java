package creational.abstractfactory;

import creational.abstractfactory.website.WebsiteTeamFactory;

/**
 * Created by almayce on 05.04.17.
 */
public class AuctionSiteProject {
    public static void main(String[] args) {
        TeamFactory teamFactory = new WebsiteTeamFactory();
        Developer developer = teamFactory.getDeveloper();
        Tester tester = teamFactory.getTester();
        Manager manager = teamFactory.getManager();

        System.out.println("Creating website project...");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
