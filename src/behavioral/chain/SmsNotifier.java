package behavioral.chain;

/**
 * Created by almayce on 06.04.17.
 */
public class SmsNotifier extends Notifier {
    public SmsNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending SMS to manager: " + message);
    }
}
