package structural.bridge;

/**
 * Created by almayce on 05.04.17.
 */
public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println(this.getClass().getSimpleName() + " writeCode");
    }
}
