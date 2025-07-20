# 🛒 Selenium Automation Framework for eCommerce Application

This project is a Selenium-based automation test framework for an eCommerce web application, built using **Java**, **TestNG**, and **Page Object Model (POM)**. It uses **Excel-based Data Driven Testing** to run test cases with multiple sets of input data.

---

## 📌 Features

- 🔹 Test automation for key eCommerce functionalities (Login, Search, Add to Cart, Checkout)
- 🔹 Modular **Page Object Model (POM)** architecture
- 🔹 **Data Driven Testing** using Apache POI to read test data from Excel files
- 🔹 **TestNG** for test execution, grouping, and reporting
- 🔹 Cross-browser support (optional: Chrome, Firefox, Edge)
- 🔹 Easy-to-understand test reports

---

## 🧱 Technology Stack

| Component            | Technology          |
|----------------------|---------------------|
| Programming Language | Java                |
| Test Framework       | TestNG              |
| Browser Automation   | Selenium WebDriver  |
| Data Source          | Excel (Apache POI)  |
| Design Pattern       | Page Object Model   |
| Build Tool           | Maven               |
| Reporting            | TestNG Reports / ExtentReports (optional) |

---


---

## 🧪 Sample Test Flow

1. Open browser and navigate to the eCommerce site
2. Perform login using credentials from Excel
3. Search for an item
4. Add item to cart
5. Proceed to checkout
6. Validate total amount and order success message

---

## 🚀 How to Run

### 📦 Prerequisites
- Java JDK 11+
- Maven
- Chrome/Firefox WebDriver in PATH
- TestNG plugin in IDE
- Excel file `TestData.xlsx` in `testdata/` folder

### ▶️ Run via TestNG XML
```bash
mvn clean test
