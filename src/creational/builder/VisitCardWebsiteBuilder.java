package creational.builder;

/**
 * Created by almayce on 05.04.17.
 */
public class VisitCardWebsiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("Visit card");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);

    }

    @Override
    void buildPrice() {
        website.setPrice(500);

    }
}
