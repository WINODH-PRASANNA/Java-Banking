# 🏦 ATM Project

## 📄 Overview
`ATM_Project.java` is a simple console-based ATM (Automated Teller Machine) simulation program written in Java. The application allows a user to perform basic banking operations such as checking their balance, depositing money, withdrawing money, and printing a receipt, after verifying a secure PIN.

## ✨ Features
- 🔐 PIN authentication
- 💳 Balance inquiry
- 💵 Deposit funds
- 💸 Withdraw funds with balance validation
- 🔓 Receipt generation
- ⏹️ Exit functionality

## 📊 Requirements
- Java Development Kit (JDK) 8 or later

## 📚 How to Run
1. 📂 **Download or clone the repository.**
2. 🚷 **Open a terminal or command prompt.**
3. 🗺️ **Navigate to the directory containing `ATM_Project.java`.**
4. ✅ **Compile the program:**
   ```bash
   javac ATM_Project.java
   ```
5. 🔄 **Run the program:**
   ```bash
   java ATM_Project
   ```
6. 💻 **Follow the on-screen prompts.**

## 🔑 Default Credentials
- **PIN:** `1234`

## 🔹 Notes
- ⛔️ If you enter an incorrect PIN, the program will deny access.
- ⚡️ Withdrawal is only allowed if the requested amount does not exceed the available balance.
- 📈 Receipt displays the name, available balance, amount deposited, and amount withdrawn.

## 🔎 Known Issues
- ❌ Minor spelling mistakes in user messages (e.g., "withdrow" instead of "withdraw").
- 🛳️ No multiple user support.
- 🔢 No persistent data storage (session-based only).

## 💡 Future Improvements
- ✅ Improve input validation.
- 🖊️ Fix typos in user-facing text.
- 👥 Add support for multiple users and account types.
- 🔧 Implement data persistence using files or databases.

## 📚 License
This project is free to use for educational purposes.

---

📢 Feel free to contribute and suggest improvements!
