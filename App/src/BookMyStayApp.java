public class BookMyStayApp {

    public static void main(String[] args) {
        // Execute Use Case 1: Welcome and Initialization
        UseCase1.execute();
    }
}
/**----------------------------------------------------------------------------------------------
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
