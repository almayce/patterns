package structural.proxy;

/**
 * Created by almayce on 06.04.17.
 */
public class RealProject implements Project {
    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load() {
        System.out.println("Loading project " + url + "...");
    }
    @Override
    public void run() {
        System.out.println("Running project " + url + "...");
    }
}
