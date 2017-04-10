package structural.proxy;

/**
 * Created by almayce on 06.04.17.
 */
public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("http://www.github.com");
        project.run();
    }
}
