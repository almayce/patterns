package structural.facade;

/**
 * Created by almayce on 06.04.17.
 */
public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker){
        if (bugTracker.isActiveSprint()) {
            System.out.println(this.getClass().getSimpleName() + " is working.");
        } else {
            System.out.println(this.getClass().getSimpleName() + " is reading.");
        }
    }
}
