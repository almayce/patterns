package behavioral.template;

/**
 * Created by almayce on 08.04.17.
 */
public class WebsiteRunner {
    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();

        welcomePage.showPage();
        System.out.println("\n***\n");

        newsPage.showPage();
    }
}
