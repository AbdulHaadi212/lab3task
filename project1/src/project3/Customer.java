package project3;

//Customer.java
public class Customer implements CommonFunctions {
 private char customerId;
 private String name;
 private String address;
 private int phoneNo;
 private int age;

 public Customer(char customerId, String name, String address, int phoneNo, int age) {
     this.customerId = customerId;
     this.name = name;
     this.address = address;
     this.phoneNo = phoneNo;
     this.age = age;
 }

 // Getters and Setters
 public char getCustomerId() { return customerId; }
 public void setCustomerId(char customerId) { this.customerId = customerId; }

 public String getName() { return name; }
 public void setName(String name) { this.name = name; }

 public String getAddress() { return address; }
 public void setAddress(String address) { this.address = address; }

 public int getPhoneNo() { return phoneNo; }
 public void setPhoneNo(int phoneNo) { this.phoneNo = phoneNo; }

 public int getAge() { return age; }
 public void setAge(int age) { this.age = age; }

 // Methods
 public void addDetails() {
     // Implementation here
 }

 public void modifyDetails() {
     // Implementation here
 }

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

