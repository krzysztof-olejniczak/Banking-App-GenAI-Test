![Capgemini Logo](https://www.capgemini.com/wp-content/themes/capgemini2020/assets/images/logo.svg)

### Make it real.

---
## BankAccount.java Documentation and Pseudocode

**1. Overview:**

This Java code defines a `BankAccount` class that represents a simple bank account with basic operations like deposit, withdrawal, balance inquiry, and checking for sufficient funds. It includes validation logic to ensure valid input values and handles potential errors through exceptions.

**2. Package/module name:**

io.genai.bankingapp.test

**3. Class/file name:**

BankAccount.java

**4. Detailed Documentation:**

* **Class `BankAccount`**: Represents a bank account with an owner and balance.

    * **Fields:**
        * `owner`: String representing the account owner's name (immutable).
        * `balance`: BigDecimal representing the current account balance.

    * **Constructor `BankAccount(String owner, BigDecimal initialBalance)`**: Initializes a new `BankAccount` object.

        * **Parameters:**
            * `owner`: The account owner's name (required, cannot be null or empty).
            * `initialBalance`: The starting balance for the account (required, must be non-negative).
        * **Return Value:** None.
        * **Important Logic:** 
            * Throws `IllegalArgumentException` if `owner` is null or empty or if `initialBalance` is negative.

    * **Method `getOwner()`:**: Returns the account owner's name.

        * **Parameters:** None.
        * **Return Value:** String representing the account owner's name.

    * **Method `getBalance()`:**: Returns the current account balance.

        * **Parameters:** None.
        * **Return Value:** BigDecimal representing the account balance.

    * **Method `deposit(BigDecimal amount)`**: Adds funds to the account.

        * **Parameters:**
            * `amount`: The amount of money to deposit (required, must be positive).
        * **Return Value:** None.
        * **Important Logic:** 
            * Calls `validateAmount` to ensure a valid deposit amount.
            * Updates the `balance` by adding the `amount`.

    * **Method `withdraw(BigDecimal amount)`**: Deducts funds from the account.

        * **Parameters:**
            * `amount`: The amount of money to withdraw (required, must be positive).
        * **Return Value:** None.
        * **Important Logic:** 
            * Calls `validateAmount` to ensure a valid withdrawal amount.
            * Checks if sufficient funds are available (`balance >= amount`).
                * If not, throws an `IllegalStateException` indicating insufficient funds.
            * Updates the `balance` by subtracting the `amount`.

    * **Method `hasSufficientFunds(BigDecimal amount)`**: Checks if there are enough funds to cover a withdrawal.

        * **Parameters:**
            * `amount`: The amount to check against (required, must be positive).
        * **Return Value:** Boolean indicating whether sufficient funds are available.
        * **Important Logic:** 
            * Calls `validateAmount` to ensure a valid amount.
            * Compares the `balance` with the `amount` using `compareTo`.

    * **Method `validateAmount(BigDecimal amount)`**: Validates that an amount is positive.

        * **Parameters:**
            * `amount`: The amount to validate (required).
        * **Return Value:** None.
        * **Important Logic:** 
            * Throws an `IllegalArgumentException` if the `amount` is null or less than or equal to zero.

    * **Method `equals(Object o)`**: Overrides the default equals method for comparing BankAccount objects based on their owner's name.

        * **Parameters:**
            * `o`: The object to compare with.
        * **Return Value:** Boolean indicating whether the two objects are equal.

    * **Method `hashCode()`**: Overrides the default hashCode method to generate a hash code based on the account owner's name.


**5. Pseudo Code:**



```
// Class: BankAccount

// Constructor: BankAccount(owner, initialBalance)
  1. Check if owner is null or empty string
    - If true, throw IllegalArgumentException("Owner is required")
  2. Check if initialBalance is null or negative
    - If true, throw IllegalArgumentException("Initial balance must be non-negative")
  3. Set the owner to the provided value
  4. Set the balance to the initial balance

// Method: getOwner()
  1. Return the account owner's name

// Method: getBalance()
  1. Return the current account balance

// Method: deposit(amount)
  1. Validate amount (must be positive)
    - If not, throw IllegalArgumentException("Amount must be positive")
  2. Add the amount to the balance

// Method: withdraw(amount)
  1. Validate amount (must be positive)
    - If not, throw IllegalArgumentException("Amount must be positive")
  2. Check if balance is greater than or equal to the amount
    - If false, throw IllegalStateException("Insufficient funds")
  3. Subtract the amount from the balance

// Method: hasSufficientFunds(amount)
  1. Validate amount (must be positive)
    - If not, throw IllegalArgumentException("Amount must be positive")
  2. Compare balance with amount
    - If balance is greater than or equal to amount, return true
    - Otherwise, return false

// Method: validateAmount(amount)
  1. Check if amount is null or less than or equal to zero
    - If true, throw IllegalArgumentException("Amount must be positive")



```




**6. Dependencies and Libraries:**


* **java.math.BigDecimal**: Used for handling decimal values with precision. This library is built into the Java standard library.

* **java.util.Objects**: Provides utility methods for working with objects, including `hashcode` and `equals`. Also part of the Java standard library.



