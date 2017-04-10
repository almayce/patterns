package behavioral.command;

/**
 * Created by almayce on 06.04.17.
 */
public class InsertCommand implements Command{
    Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }
}
