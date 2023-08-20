import java.util.Arrays;
import java.util.List;

public class Main {
    public class Car {
        private Engine engine;
        private Tire tire;
        private Chassis chassis;
        private AirConditioning ac;
        private Color color;
        private double totalPrice;
        private BodyDesign bodyDesign;
        private AutomatedAI automatedAI;
        private Seat seat;

        public Car(Engine engine, Tire tire, Chassis chassis, AirConditioning ac,
                   Color color, double totalPrice, BodyDesign bodyDesign,
                   AutomatedAI automatedAI, Seat seat) {
            this.engine = engine;
            this.tire = tire;
            this.chassis = chassis;
            this.ac = ac;
            this.color = color;
            this.totalPrice = totalPrice;
            this.bodyDesign = bodyDesign;
            this.automatedAI = automatedAI;
            this.seat = seat;
        }

        public Engine getEngine() {
            return engine;
        }

        public void setEngine(Engine engine) {
            this.engine = engine;
        }

        public Tire getTire() {
            return tire;
        }

        public void setTire(Tire tire) {
            this.tire = tire;
        }

        public Chassis getChassis() {
            return chassis;
        }

        public void setChassis(Chassis chassis) {
            this.chassis = chassis;
        }

        public AirConditioning getAirConditioning() {
            return ac;
        }

        public void setAirConditioning(AirConditioning ac) {
            this.ac = ac;
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        public double getTotalPrice() {
            return totalPrice;
        }

        public void setTotalPrice(double totalPrice) {
            this.totalPrice = totalPrice;
        }

        public BodyDesign getBodyDesign() {
            return bodyDesign;
        }

        public void setBodyDesign(BodyDesign bodyDesign) {
            this.bodyDesign = bodyDesign;
        }

        public AutomatedAI getAutomatedAI() {
            return automatedAI;
        }

        public void setAutomatedAI(AutomatedAI automatedAI) {
            this.automatedAI = automatedAI;
        }

        public Seat getSeat() {
            return seat;
        }

        public void setSeat(Seat seat) {
            this.seat = seat;
        }

    }
    public class Engine {
        private String type; // 1300CC, 1700CC, ...
        public Engine(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
    public class Tire {
        private String type; // Snow, Spare, ...
        public Tire(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
    public class Chassis {
        private String type; // Tabular, Backbone, ...
        public Chassis(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
    public class AirConditioning {
        private String type; // high-powered, low-powered
        public AirConditioning(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
    public class Color {
        private String color; // Red, White, ...
        public Color(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }
    public class BodyDesign {
        private String design; // Body design for a group of cars
        public BodyDesign(String design) {
            this.design = design;
        }

        public String getDesign() {
            return design;
        }

        public void setDesign(String design) {
            this.design = design;
        }
    }
    public class AutomatedAI {
        private String type; // Asia Based Automated AI, USA Based Automated AI
        public AutomatedAI(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
    public class Seat {
        private int numberOfSeats; // Number of seats based on car type
        public Seat(int numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
        }

        public int getNumberOfSeats() {
            return numberOfSeats;
        }

        public void setNumberOfSeats(int numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
        }
    }
    public class CarGroup {
        private String name; // Ferrari, Ford, ...
        public CarGroup(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public class CarVariant {
        private String name; // Racing Car, Private Car, ...
        public CarVariant(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public class Client {
        // Client details
        // Constructor, getters, and setters
    }
    public enum NotificationType {
        PRICE_CHANGE, BASIC_FEATURES_CHANGE
    }


    public static void main(String[] args) {
        // Create an instance of CarFacade
        CarFacade carFacade = new CarFacade();

        // Create a car
        Car car = new Car();
        car.setEngine(new Engine("1700CC"));
        car.setTire(new Tire("Snow"));
        car.setChassis(new Chassis("Backbone"));
        car.setAirConditioning(new AirConditioning("high-powered"));
        car.setColor(new Color("Red"));
        car.setTotalPrice(25000.0);
        car.setBodyDesign(new BodyDesign("Sporty"));
        car.setAutomatedAI(new AutomatedAI("Asia Based Automated AI"));
        car.setSeat(new Seat(5));
        car.setCarGroup(new CarGroup("Ford"));
        car.setCarVariant(new CarVariant("Private Car"));

        // Customize the car
        List<String> customizationOptions = Arrays.asList("Thick Rain Shield", "Loosen Big Bumper");
        carFacade.customizeCar(car, customizationOptions);

        // Subscribe to notifications
        Client client = new Client(/* client details */);
        List<NotificationType> notificationTypes = Arrays.asList(NotificationType.PRICE_CHANGE);
        carFacade.subscribeToNotifications(client, notificationTypes);

        // Request car servicing, washing, and online delivery
        carFacade.requestCarServicing(client, car);
        carFacade.requestCarWashing(client, car);
        carFacade.requestOnlineDelivery(client, car);
    }
}
