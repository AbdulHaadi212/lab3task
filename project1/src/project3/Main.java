package project3;

//Main.java
public class Main {
 public static void main(String[] args) {
     // Sample data for Customer
     Customer customer = new Customer('C', "John Doe", "123 Main St", 1234567890, 30);
     System.out.println("Customer Created: " + customer.getName());

     // Sample data for Agent
     Agent agent = new Agent(1, "Agent Smith");
     System.out.println("Agent Created: " + agent.getName());

     // Sample data for Ticket
     Ticket ticket = new Ticket("New York", "Los Angeles", new java.util.Date(), "10:00 AM", "B", "A1");

     System.out.println("Ticket Booked from " + ticket.getSource() + " to " + ticket.getDestination());

     // Sample data for Refund
     Refund refund = new Refund(100.50f, 'C');
     System.out.println("Refund Processed for Customer ID: " + refund.getCustomerId());

     // You can add more method calls here to test the functionality of your classes
     // For example, testing booking and cancellation logic
     customer.bookTicket();
     customer.cancelTicket();
     agent.bookTicket();
 }
}
