![Capgemini Logo](https://www.capgemini.com/wp-content/themes/capgemini2020/assets/images/logo.svg)

### Make it real.

---
## BankAccount.java Documentation

**1. Overview:**

This Java code defines a `BankAccount` class that represents a simple bank account with basic operations like deposit, withdrawal, balance inquiry, and checking for sufficient funds. It includes validation logic to ensure data integrity and handles potential errors appropriately.

**2. Package/module name:**

io.genai.bankingapp.test

**3. Class/file name:**

BankAccount.java

**4. Detailed Documentation:**

   - **Constructor `BankAccount(String owner, BigDecimal initialBalance)`:**
     - **Description:** Initializes a new bank account with the given owner and initial balance.
     - **Parameters:**
       - `owner`: String representing the account owner's name (required).
       - `initialBalance`: BigDecimal representing the starting balance (must be non-negative).
     - **Return Values:** None.
     - **Important Logic:** 
       - Throws `IllegalArgumentException` if `owner` is null or blank, or if `initialBalance` is null or negative.

   - **Method `getOwner()`:**
     - **Description:** Returns the account owner's name.
     - **Parameters:** None.
     - **Return Values:** String representing the account owner's name.

   - **Method `getBalance()`:**
     - **Description:** Returns the current balance of the account.
     - **Parameters:** None.
     - **Return Values:** BigDecimal representing the account balance.

   - **Method `deposit(BigDecimal amount)`:**
     - **Description:** Adds the specified amount to the account balance.
     - **Parameters:**
       - `amount`: BigDecimal representing the deposit amount (must be positive).
     - **Return Values:** None.
     - **Important Logic:** 
       - Calls `validateAmount` to ensure the deposit amount is valid.
       - Updates the `balance` by adding the `amount`.

   - **Method `withdraw(BigDecimal amount)`:**
     - **Description:** Subtracts the specified amount from the account balance if sufficient funds are available.
     - **Parameters:**
       - `amount`: BigDecimal representing the withdrawal amount (must be positive).
     - **Return Values:** None.
     - **Important Logic:** 
       - Calls `validateAmount` to ensure the withdrawal amount is valid.
       - Checks if the `balance` is greater than or equal to the `amount`.
       - Throws `IllegalStateException` if insufficient funds are available.
       - Updates the `balance` by subtracting the `amount` if sufficient funds exist.

   - **Method `hasSufficientFunds(BigDecimal amount)`:**
     - **Description:** Checks if the account has enough funds to cover the specified amount.
     - **Parameters:**
       - `amount`: BigDecimal representing the amount to check against (must be positive).
     - **Return Values:** Boolean indicating whether sufficient funds are available.
     - **Important Logic:** 
       - Calls `validateAmount` to ensure the amount is valid.
       - Compares the `balance` with the `amount` using `compareTo`.

   - **Method `validateAmount(BigDecimal amount)`:**
     - **Description:** Validates that the provided amount is positive.
     - **Parameters:**
       - `amount`: BigDecimal representing the amount to validate (must be positive).
     - **Return Values:** None.
     - **Important Logic:** 
       - Throws `IllegalArgumentException` if `amount` is null or less than or equal to zero.

   - **Method `equals(Object o)`:**
     - **Description:** Overrides the default equals method to compare BankAccount objects based on their owner's name.
     - **Parameters:**
       - `o`: Object to compare with.
     - **Return Values:** Boolean indicating whether the two BankAccount objects are equal.

   - **Method `hashCode()`:**
     - **Description:** Overrides the default hashCode method to generate a hash code based on the owner's name.
     - **Parameters:** None.
     - **Return Values:** Integer representing the hash code of the object.



**5. Pseudo Code:**


```
// Class: BankAccount

// Constructor: BankAccount(owner, initialBalance)
  1. Check if owner is null or blank:
    - If true, throw IllegalArgumentException("Owner is required")
  2. Check if initialBalance is null or negative:
    - If true, throw IllegalArgumentException("Initial balance must be non-negative")
  3. Set the owner to the provided value.
  4. Set the balance to the provided initialBalance.

// Method: getOwner()
  1. Return the stored owner name.

// Method: getBalance()
  1. Return the stored balance.

// Method: deposit(amount)
  1. Validate amount (must be positive):
    - If not, throw IllegalArgumentException("Amount must be positive")
  2. Add the amount to the current balance.

// Method: withdraw(amount)
  1. Validate amount (must be positive):
    - If not, throw IllegalArgumentException("Amount must be positive")
  2. Check if balance is greater than or equal to the withdrawal amount:
    - If true, subtract the amount from the balance.
    - If false, throw IllegalStateException("Insufficient funds")

// Method: hasSufficientFunds(amount)
  1. Validate amount (must be positive):
    - If not, throw IllegalArgumentException("Amount must be positive")
  2. Compare the balance with the withdrawal amount:
    - If balance is greater than or equal to the amount, return true.
    - Otherwise, return false.

// Method: validateAmount(amount)
  1. Check if amount is null or less than or equal to zero:
    - If true, throw IllegalArgumentException("Amount must be positive")



```




**Dependencies and Libraries:**


* **java.math.BigDecimal:** This class provides support for decimal arithmetic in Java. It's a built-in library and doesn't require any external dependencies.

* **java.util.Objects:** This class provides utility methods for working with objects, including the `hashcode` and `equals` methods used in the BankAccount class. It's also a built-in library.



