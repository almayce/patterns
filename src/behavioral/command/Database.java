package behavioral.command;

/**
 * Created by almayce on 06.04.17.
 */
public class Database {
    public void insert() {
        System.out.println("Inserting record...");
    }

    public void update() {
        System.out.println("Updating record...");
    }

    public void select() {
        System.out.println("Reading record...");
    }

    public void delete() {
        System.out.println("Deleting record...");
    }
}
