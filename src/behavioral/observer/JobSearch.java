package behavioral.observer;

/**
 * Created by almayce on 07.04.17.
 */
public class JobSearch {
    public static void main(String[] args) {
        JobSite jobSite = new JobSite();

        jobSite.addVacancy("First Developer Position");
        jobSite.addVacancy("Second Developer Position");

        Observer firstSubscriber = new Subscriber("Alex Kolch");
        Observer secondSubscriber = new Subscriber("Roma Leon");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third Developer Position");

        jobSite.removeVacancy("Second Developer Position");
    }
}
