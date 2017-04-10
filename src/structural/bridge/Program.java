package structural.bridge;

/**
 * Created by almayce on 05.04.17.
 */
public abstract class Program {
    protected Developer developer;

    protected Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}
