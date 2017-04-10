package behavioral.observer;

import java.util.List;

/**
 * Created by almayce on 07.04.17.
 */
public class Subscriber implements Observer {

    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + name + "!" + "\nWe have some changes in vacancies:\n" + vacancies + "\n***\n");
    }
}
