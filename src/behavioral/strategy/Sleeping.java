package behavioral.strategy;

/**
 * Created by almayce on 07.04.17.
 */
public class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Sleeping...");
    }
}
