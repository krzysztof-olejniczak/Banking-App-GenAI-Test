![Capgemini Logo](https://www.capgemini.com/wp-content/themes/capgemini2020/assets/images/logo.svg)

### Make it real.

---
## BankAccount.java Documentation & Pseudocode

**1. Overview:**

This Java code defines a `BankAccount` class that represents a simple bank account with basic operations like deposit, withdrawal, balance inquiry, and checking for sufficient funds. It includes validation logic to ensure valid input and prevent errors.

**2. Package/Module Name:**

io.genai.bankingapp.test

**3. Class/File Name:**

BankAccount.java

**4. Detailed Documentation:**

* **Class: `BankAccount`**
    - Represents a bank account with an owner and balance. 
    - Enforces input validation to ensure data integrity.

* **Constructor: `BankAccount(String owner, BigDecimal initialBalance)`**
    - Description: Initializes a new `BankAccount` object with the given owner and initial balance.
    - Parameters:
        - `owner`: String representing the account owner's name (required).
        - `initialBalance`: BigDecimal representing the starting balance (must be non-negative).
    - Return Values: None
    - Important Logic: 
        - Throws `IllegalArgumentException` if `owner` is null or empty, or if `initialBalance` is null or negative.

* **Method: `getOwner()`**
    - Description: Returns the account owner's name.
    - Parameters: None
    - Return Values: String - The account owner's name.

* **Method: `getBalance()`**
    - Description: Returns the current balance of the account.
    - Parameters: None
    - Return Values: BigDecimal - The current account balance.

* **Method: `deposit(BigDecimal amount)`**
    - Description: Adds the specified amount to the account balance.
    - Parameters:
        - `amount`: BigDecimal representing the deposit amount (must be positive).
    - Return Values: None
    - Important Logic: 
        - Calls `validateAmount()` to ensure a positive deposit amount.
        - Updates the `balance` by adding the `amount`.

* **Method: `withdraw(BigDecimal amount)`**
    - Description: Subtracts the specified amount from the account balance if sufficient funds are available.
    - Parameters:
        - `amount`: BigDecimal representing the withdrawal amount (must be positive).
    - Return Values: None
    - Important Logic: 
        - Calls `validateAmount()` to ensure a positive withdrawal amount.
        - Throws `IllegalStateException` if the balance is insufficient to cover the withdrawal.
        - Updates the `balance` by subtracting the `amount`.

* **Method: `hasSufficientFunds(BigDecimal amount)`**
    - Description: Checks if the account has enough funds to cover the specified amount.
    - Parameters:
        - `amount`: BigDecimal representing the amount to check against (must be positive).
    - Return Values: Boolean - True if sufficient funds are available, false otherwise.
    - Important Logic: 
        - Calls `validateAmount()` to ensure a positive amount.
        - Compares the current `balance` with the `amount` using `compareTo()`.

* **Method: `validateAmount(BigDecimal amount)`**
    - Description: Validates that the provided amount is positive.
    - Parameters:
        - `amount`: BigDecimal to validate (must be positive).
    - Return Values: None
    - Important Logic: 
        - Throws `IllegalArgumentException` if `amount` is null or less than or equal to zero.

* **Method: `equals(Object o)`**
    - Description: Overrides the default equals method to compare BankAccount objects based on their owner's name.
    - Parameters:
        - `o`: Object to compare with.
    - Return Values: Boolean - True if the objects are equal (same owner), false otherwise.

* **Method: `hashCode()`**
    - Description: Overrides the default hashCode method to generate a hash code based on the account owner's name.
    - Parameters: None
    - Return Values: Integer - The hash code of the object.



**5. Pseudo Code:**


```
// Class: BankAccount

// Constructor: BankAccount(owner, initialBalance)
  1. Check if owner is null or empty string:
     - If true, throw IllegalArgumentException("Owner is required")
  2. Check if initialBalance is null or less than zero:
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
  2. Add the validated amount to the current balance.

// Method: withdraw(amount)
  1. Validate amount (must be positive):
     - If not, throw IllegalArgumentException("Amount must be positive")
  2. Check if balance is sufficient to cover the withdrawal:
     - If not, throw IllegalStateException("Insufficient funds")
  3. Subtract the validated amount from the current balance.

// Method: hasSufficientFunds(amount)
  1. Validate amount (must be positive):
     - If not, throw IllegalArgumentException("Amount must be positive")
  2. Compare the current balance with the provided amount:
     - If balance is greater than or equal to amount, return true.
     - Otherwise, return false.

// Method: validateAmount(amount)
  1. Check if amount is null or less than or equal to zero:
     - If true, throw IllegalArgumentException("Amount must be positive")



```


**6. Dependencies and Libraries:**

* **java.math.BigDecimal:** Used for handling decimal values (balance). 
* **java.util.Objects:** Used for comparing objects and generating hash codes.




