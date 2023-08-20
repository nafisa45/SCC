import java.util.List;
import java.util.Arrays;


public class CarFacade {
    private CustomizationService customizationService;
    private NotificationService notificationService;
    private OnlineSystemService onlineSystemService;

    public CarFacade() {
        customizationService = new CustomizationService();
        notificationService = new NotificationService();
        onlineSystemService = new OnlineSystemService();
    }

    // Methods to interact with the system using facade pattern
    public void customizeCar(Car car, List<String> customizationOptions) {
        customizationService.customizeCar(car, customizationOptions);
    }

    public void subscribeToNotifications(Client client, List<NotificationType> notificationTypes) {
        notificationService.subscribeToNotifications(client, notificationTypes);
    }

    public void unsubscribeFromNotifications(Client client, List<NotificationType> notificationTypes) {
        notificationService.unsubscribeFromNotifications(client, notificationTypes);
    }

    public void requestCarServicing(Client client, Car car) {
        onlineSystemService.requestCarServicing(client, car);
    }

    public void requestCarWashing(Client client, Car car) {
        onlineSystemService.requestCarWashing(client, car);
    }

    public void requestOnlineDelivery(Client client, Car car) {
        onlineSystemService.requestOnlineDelivery(client, car);
    }
}
