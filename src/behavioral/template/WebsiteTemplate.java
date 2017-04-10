package behavioral.template;

/**
 * Created by almayce on 08.04.17.
 */
public abstract class WebsiteTemplate {
    public void showPage() {
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    public abstract void showPageContent();
}
