## TDD Workshop for CBF Event - July 2024


In this workshop, you would learn Test Driven Development by building a simple `CoffeeOrder` service.
A sample solution to the problem can be found on the `workshop-solution` [branch](https://github.com/lotaibe/tdd-workshop-july-24/tree/workshop-solution)

## Functional Requirements

### 1. Place Order:

* The system should allow a user to place an order for coffee.
* The order must include the type of coffee, size, and quantity.

### 2. Order Validation:

* The system must validate the coffee order before processing:
* The coffee type cannot be empty.
* The coffee size cannot be empty.
* The quantity must be at least 1.

  
### 3. Order Confirmation:
* The system should confirm a successfully placed order with a message that includes the quantity, size, and type of coffee ordered.


### 4. Invalid Order Handling:
* The system should return specific error messages for invalid orders:
* If the coffee type is empty, return "Invalid order: Coffee type cannot be empty."
* If the coffee size is empty, return "Invalid order: Coffee size cannot be empty."
* If the quantity is less than 1, return "Invalid order: Quantity must be at least 1."

## Testing Framework:
* Use JUnit for writing and running tests.

## Design Patterns:
* Follow the MVC (Model-View-Controller) pattern and a Service Layer pattern to structure the application.


## Example Use Case
*Use Case: Placing a Coffee Order*

- ### User Input:

      Coffee Type: "Latte" 
      Coffee Size: "Large" 
      Quantity: 2 


- ### System Validation:
  * The system checks that the coffee type is not empty.
  * The system checks that the coffee size is not empty.
  * The system checks that the quantity is at least 1.

- ### System Response:
  * If all inputs are valid, the system returns: "Order placed: 2 Large Latte(s)"
  * If any input is invalid, the system returns the appropriate error message.
  * These requirements set the foundation for developing the Coffee Order Service using Test Driven Development (TDD), ensuring that all necessary functionality is implemented and validated through tests.
