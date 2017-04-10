package structural.bridge;

/**
 * Created by almayce on 05.04.17.
 */
public class StockExchange extends Program{
    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock Exchange development in progress");
        developer.writeCode();
    }
}
