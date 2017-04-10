package behavioral.command;

/**
 * Created by almayce on 06.04.17.
 */
public class SelectCommand implements Command {
    Database database = new Database();

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}
