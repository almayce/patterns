package creational.abstractfactory;

public interface TeamFactory {
    Developer getDeveloper();
    Tester getTester();
    Manager getManager();
}
