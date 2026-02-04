# Arbitrage Engine (Spring Boot Migration)

This repository contains the migration of my personal sports arbitrage engine from a standard Java application to the **Spring Boot** framework.

Arbitrage betting (or "arbing") involves placing bets on all possible outcomes of an event at odds that guarantee a profit. This program automates the tedious math required to find these specific discrepancies.

**How it works:**
1.  **Fetch:** The app pulls live odds for all NBA games for today.
2.  **Compare:** It cross-references odds across multiple bookmakers.
3.  **Detect:** It calculates the implied probability. If the sum of probabilities is `< 100%`, an arbitrage opportunity exists.
4.  **Report:** It prints the specific matchup, the bookmakers to use, and the calculated profit margin to the console.

## 🛠 Tech Stack
While the architecture is moving to Spring, I am currently retaining my familiar tools for logic and data fetching:

* **Framework:** Spring Boot 3+
* **Build Tool:** Gradle
* **HTTP Client:** OkHttp3 (wrapped in Spring Beans)
* **JSON Parsing:** Gson (managed via Dependency Injection)

## 🚀 Future Changes
* At the moment, nothing is planned for this as I just mess around with Spring. In the future, it'll be a fully fledged project posted on a seperate repository.
