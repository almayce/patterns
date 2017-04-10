package creational.abstractfactory;

import creational.abstractfactory.banking.BankingTeamFactory;

/**
 * Created by almayce on 05.04.17.
 */
public class SuperBankSystem {
    public static void main(String[] args) {
        TeamFactory teamFactory = new BankingTeamFactory();
        Developer developer = teamFactory.getDeveloper();
        Tester tester = teamFactory.getTester();
        Manager manager = teamFactory.getManager();

        System.out.println("Creating bank system...");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
