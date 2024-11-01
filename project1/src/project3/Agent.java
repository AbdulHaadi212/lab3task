package project3;

//Agent.java
public class Agent implements CommonFunctions {
 private int id;
 private String name;

 public Agent(int id, String name) {
     this.id = id;
     this.name = name;
 }

 // Getters and Setters
 public int getId() { return id; }
 public void setId(int id) { this.id = id; }

 public String getName() { return name; }
 public void setName(String name) { this.name = name; }

 // Interface methods
 @Override
 public void searchTicket() {
     // Implementation here
 }

 @Override
 public void bookTicket() {
     // Implementation here
 }

 @Override
 public void cancelTicket() {
     // Implementation here
 }

 @Override
 public void makePayment() {
     // Implementation here
 }

 @Override
 public void fillDetail() {
     // Implementation here
 }
}

