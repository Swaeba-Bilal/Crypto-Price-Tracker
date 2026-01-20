# 🪙 Crypto Tracker – Live Crypto Price Dashboard

A **Spring Boot + Thymeleaf** web application that allows users to track **real-time cryptocurrency prices** and **24-hour percentage changes** using a **public REST API**.

This project demonstrates **backend fundamentals**, **API integration**, **server-side rendering**, and **clean UI design** .

---

## 🟢🔴 Result Page Highlights (Price Indicators)

The **index.html** page immediately reflects market sentiment using **color‑based indicators**:

* 🟢 **Green** → Positive 24‑hour price change (gains)
* 🔴 **Red** → Negative 24‑hour price change (losses)

These indicators are applied dynamically using **Thymeleaf conditional expressions**, ensuring users can quickly understand price movement **at a glance**, just like professional financial dashboards.

---

## 🚀 Features

* 🔍 Search multiple cryptocurrencies at once
* 📊 View **live USD prices**
* 📈 See **24-hour percentage change**
* 🟢🟥 Automatic green/red indicators for gains & losses
* ⚠️ Graceful handling of invalid or unknown coins
* 🎨 Modern, finance-style UI
* 🔐 No authentication required (public access)

---

## 🛠️ Tech Stack

| Technology         | Usage                         |
| ------------------ | ----------------------------- |
| ☕ **Java**         | Core backend logic            |
| 🌱 **Spring Boot** | REST client & MVC framework   |
| 🍃 **Thymeleaf**   | Server-side HTML rendering    |
| 🌐 **REST API**    | Fetch live crypto market data |
| 🎨 **HTML + CSS**  | Responsive UI styling         |
| 📦 **Maven**       | Dependency management         |

---

## 🌐 Public API Used

This project uses the **CoinGecko Public API** (no API key required):

```
https://api.coingecko.com/api/v3/simple/price
```

### API Parameters Used

* `ids` → cryptocurrency IDs (e.g. bitcoin, ethereum)
* `vs_currencies` → USD
* `include_24hr_change` → true

### Sample API Response

```json
{
  "bitcoin": {
    "usd": 92932,
    "usd_24h_change": -2.20
  }
}
```

---

## 🧠 How It Works

1. User enters coin names (comma-separated)
2. Spring Controller validates input
3. Service layer calls CoinGecko API
4. JSON response is parsed into Java objects
5. Thymeleaf renders data dynamically in the UI
6. Price changes are styled conditionally (green/red)

---

## ⚠️ Error Handling

* ❌ Invalid symbols (e.g. `@!$`) are ignored
* ❌ Unknown coins are skipped safely
* ⚠️ User-friendly error messages displayed
* 🛡️ Prevents null rendering errors in Thymeleaf

---

## 📁 Project Structure

```
CryptoTracker
 ├── controller
 │   └── CryptoController.java
 ├── service
 │   └── CryptoService.java
 ├── model
 │   └── CryptoCoin.java
 ├── templates
 │   ├── index.html
 │   └── result.html
 ├── resources
 │   └── application.properties
 └── pom.xml
```

---

## ▶️ How to Run Locally

1. Clone the repository
2. Open in IntelliJ / STS
3. Ensure Java 17+ is installed
4. Run the Spring Boot application
5. Visit:

```
http://localhost:8080
```

---

## 📌 Example Input

```
bitcoin, ethereum, ripple
```

---

## 🎯 Why This Project Matters

This project shows:

* ✅ Real-world API consumption
* ✅ Clean MVC architecture
* ✅ Proper error handling
* ✅ Backend + UI integration
* ✅ Professional project structure

It is intentionally **simple, focused, and realistic**, reflecting how public data dashboards work in production.

---

## 🔮 Future Improvements

* ⏱️ Rate-limit protection
* ⭐ Favorite coins
* 📊 Historical price charts
* 🌍 Currency conversion
* 🚀 Deployment (Render / Railway)

---

## 👩‍💻 Author

**Swaeba Bilal**

Backend-focused Java Developer

🔗 GitHub: https://github.com/Swaeba-Bilal

---

⭐ *If you like this project, consider giving it a star!*
