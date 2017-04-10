package structural.bridge;

/**
 * Created by almayce on 05.04.17.
 */
public class BankSystem extends Program{
    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank System development in progress");
        developer.writeCode();

    }
}
