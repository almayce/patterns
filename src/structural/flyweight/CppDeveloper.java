package structural.flyweight;

/**
 * Created by almayce on 06.04.17.
 */
public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println(this.getClass().getSimpleName() + " writeCode");
    }
}
