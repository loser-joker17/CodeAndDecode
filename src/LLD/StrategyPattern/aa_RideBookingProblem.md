## Problem Statement

Design a Ride Booking System (like Ola/Uber) where users can choose different types of rides like:

- Bike
- Auto
- Mini
- Sedan

Each ride type has different:
- Base fare
- Per km rate
- Per minute rate

### System should:
- Allow booking a ride by selecting ride type.
- Calculate fare dynamically based on distance and time.
- Be easily extensible — so that new ride types (e.g., SUV, EV) can be added without touching existing code.

> 🔥 Use **Strategy Design Pattern** to implement this system.

---

## ✅ Example Usage

```java 
input 
RideBooking booking = new RideBooking();
booking.setStrategy(new AutoRide());
booking.bookRide(10, 30); // 10 km, 30 mins 

output 
Ride Type: Auto
Base Fare: ₹30
Fare for 10 km and 30 mins: ₹120


