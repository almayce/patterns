package structural.decorator;

/**
 * Created by almayce on 06.04.17.
 */
public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaTeamLead( new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(developer.makeJob());

    }

}
