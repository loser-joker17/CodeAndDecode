# Problem Statement: Coupon Discount System using Strategy Pattern

Design a flexible system where an e-commerce platform applies different types of discount strategies (like Flat, Percentage, BOGO, etc.) based on the coupon code applied by the user.  
Use the **Strategy Design Pattern**.

---

## 📌 Requirements

### 🎯 Functional:

- User applies a coupon code while checking out.
- Based on the coupon code, apply appropriate discount:

  | Coupon Code  | Description               |
    |--------------|---------------------------|
  | FLAT_100     | Flat ₹100 off             |
  | PERCENT_10   | 10% off                   |
  | BOGO         | Buy 1 Get 1 (Only for even quantity items) |

- Total bill is calculated after applying the discount.

---

## 🔡 Sample Input & Output

### ✅ Input And Output:

```java 
Product totalAmount = ₹1000  (Input-1)
Quantity = 2  
Coupon Code = "PERCENT_10"

Applied coupon: PERCENT_10  
Original amount: ₹1000  
Discount: ₹100  
Final amount to pay: ₹900


Amount = ₹400  (Input-2)
Quantity = 4  
Coupon = "BOGO"


Applied coupon: BOGO  
Original amount: ₹400  
Discount: ₹200  
Final amount to pay: ₹200


