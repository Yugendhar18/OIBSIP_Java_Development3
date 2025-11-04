# Simple ATM Simulation 🏧

A console-based application written in Java that simulates the basic functions of an Automated Teller Machine (ATM), allowing a user to manage a fixed account balance, track transactions, and view account details.

## 🚀 Getting Started

### Prerequisites

To run this simulation, you must have the **Java Development Kit (JDK)** installed on your machine.

### Compiling and Running

1.  **Save the file:** Ensure the code is saved as `SimpleATM.java`.
2.  **Compile the code** in your terminal:

    ```bash
    javac SimpleATM.java
    ```

3.  **Run the application**:

    ```bash
    java SimpleATM
    ```

---

## 🔑 Access Details

The system requires a PIN for authentication before accessing the main menu.

| Detail | Value |
| :--- | :--- |
| **PIN** | `1805` |
| **Initial Balance** | `₹5000` |
| **Account Holder** | `V Yugendhar` |
| **Account Number** | `785855008` |

---

## 📋 Features

The ATM provides a menu with the following operations:

1.  **Check Balance**: Displays the current available balance.
2.  **Withdraw**: Deducts funds, with a check for **Insufficient balance**.
3.  **Deposit**: Adds funds to the account balance.
4.  **Mini Statement**: Shows a history of all transactions (deposits, withdrawals, and transfers) recorded during the current session.
5.  **Transfer Money**: Simulates sending funds to another account number (deducts from the current balance).
6.  **Account Information**: Displays the account holder's name, number, and current balance.
7.  **Exit**: Closes the application.

## ⚙️ Implementation Details

The simulation uses several core Java features for its functionality:

* **Input Handling**: The `java.util.Scanner` handles all user input (PIN, menu choice, and transaction amounts).
* **Transaction History**: An `ArrayList<String>` is used to store transaction details dynamically, providing the data for the Mini Statement feature.
* **Main Loop**: A `while (true)` loop ensures the ATM menu remains active until the user chooses the "Exit" option.
* **Basic Validation**: The system checks the PIN upon entry and validates if the balance is sufficient before allowing withdrawals or transfers.
