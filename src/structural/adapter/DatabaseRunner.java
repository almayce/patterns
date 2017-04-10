package structural.adapter;

/**
 * Created by almayce on 05.04.17.
 */
public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterAppToDB();
        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
