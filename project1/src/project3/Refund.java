package project3;

//Refund.java
public class Refund {
 private float amount;
 private char customerId;

 public Refund(float amount, char customerId) {
     this.amount = amount;
     this.customerId = customerId;
 }

 // Getters and Setters
 public float getAmount() { return amount; }
 public void setAmount(float amount) { this.amount = amount; }

 public char getCustomerId() { return customerId; }
 public void setCustomerId(char customerId) { this.customerId = customerId; }

 // Method
 public void refundAmount() {
     // Implementation here
 }
}

