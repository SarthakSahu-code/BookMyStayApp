public class BookMyStayApp {

    public static void main(String[] args) {
        // Execute Use Case 1: Welcome and Initialization
        UseCase1.execute();

        // Execute Use Case 2: Room Initialization & Static Availability
        UseCase2.execute();
    }
}

/**
 * ============================================================================
 * USE CASE CLASS - UseCase1
 * ============================================================================
 *
 * Use Case 1: Application Entry & Welcome Message
 *
 * Description:
 * This class represents the initial startup phase of the
 * Hotel Booking Management System.
 *
 * At this stage, the application:
 * - Is called by the main BookMyStayApp class
 * - Displays a welcome message to the user
 * - Confirms that the system has started successfully
 *
 * No business logic, data structures, or user input
 * is implemented in this use case.
 *
 * The goal is to establish a clear and predictable
 * application startup point.
 *
 * @author Developer
 * @version 1.0
 */
class UseCase1 {

    /**
     * Executes the initial welcome sequence.
     *
     * This method is called by the main application to display
     * the startup messages.
     */
    public static void execute() {
        System.out.println("Welcome to the Hotel Booking Management System");
        System.out.println("System initialized successfully.");
    }
}

/**
 * ============================================================================
 * ABSTRACT CLASS - Room
 * ============================================================================
 *
 * Use Case 2: Basic Room Types & Static Availability
 *
 * Description:
 * This abstract class represents a generic hotel room.
 *
 * It models attributes that are intrinsic to a room type
 * and remain constant regardless of availability.
 *
 * Inventory-related concerns are intentionally excluded.
 *
 * @version 2.0
 */
abstract class Room {

    /** Number of beds available in the room. */
    protected int numberOfBeds;

    /** Total size of the room in square feet. */
    protected int squareFeet;

    /** Price charged per night for this room type. */
    protected double pricePerNight;

    /**
     * Constructor used by child classes to
     * initialize common room attributes.
     *
     * @param numberOfBeds number of beds in the room
     * @param squareFeet total room size
     * @param pricePerNight cost per night
     */
    public Room(int numberOfBeds, int squareFeet, double pricePerNight) {
        this.numberOfBeds = numberOfBeds;
        this.squareFeet = squareFeet;
        this.pricePerNight = pricePerNight;
    }

    /** Displays room details. */
    public void displayRoomDetails() {
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Size: " + squareFeet + " sqft");
        System.out.println("Price per night: " + pricePerNight);
    }
}

/**
 * ============================================================================
 * CLASS - SingleRoom
 * ============================================================================
 *
 * Represents a single room in the hotel.
 *
 * @version 2.0
 */
class SingleRoom extends Room {

    /**
     * Initializes a SingleRoom with
     * predefined attributes.
     */
    public SingleRoom() {
        super(1, 250, 1500.0);
    }
}

/**
 * ============================================================================
 * CLASS - DoubleRoom
 * ============================================================================
 *
 * Represents a double room in the hotel.
 *
 * @version 2.0
 */
class DoubleRoom extends Room {

    /**
     * Initializes a DoubleRoom with
     * predefined attributes.
     */
    public DoubleRoom() {
        super(2, 400, 2500.0);
    }
}

/**
 * ============================================================================
 * CLASS - SuiteRoom
 * ============================================================================
 *
 * Represents a suite room in the hotel.
 *
 * @version 2.0
 */
class SuiteRoom extends Room {

    /**
     * Initializes a SuiteRoom with
     * predefined attributes.
     */
    public SuiteRoom() {
        super(3, 750, 5000.0);
    }
}

/**
 * ============================================================================
 * USE CASE CLASS - UseCase2
 * ============================================================================
 *
 * Use Case 2: Basic Room Types & Static Availability
 *
 * Description:
 * This class demonstrates room initialization
 * using domain models before introducing
 * centralized inventory management.
 *
 * Availability is represented using
 * simple variables to highlight limitations.
 *
 * @version 2.0
 */
class UseCase2 {

    /**
     * Executes the room initialization and displays static availability.
     */
    public static void execute() {
        System.out.println("\nHotel Room Initialization\n");

        SingleRoom singleRoom = new SingleRoom();
        int singleAvailable = 5;
        System.out.println("Single Room:");
        singleRoom.displayRoomDetails();
        System.out.println("Available: " + singleAvailable + "\n");

        DoubleRoom doubleRoom = new DoubleRoom();
        int doubleAvailable = 3;
        System.out.println("Double Room:");
        doubleRoom.displayRoomDetails();
        System.out.println("Available: " + doubleAvailable + "\n");

        SuiteRoom suiteRoom = new SuiteRoom();
        int suiteAvailable = 2;
        System.out.println("Suite Room:");
        suiteRoom.displayRoomDetails();
        System.out.println("Available: " + suiteAvailable);
    }
}