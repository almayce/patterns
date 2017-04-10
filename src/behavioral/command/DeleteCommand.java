package behavioral.command;

/**
 * Created by almayce on 06.04.17.
 */
public class DeleteCommand implements Command{
    Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }
}
