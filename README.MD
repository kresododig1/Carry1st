# Carry1st project
### Test Automation with Selenium and Cucumber-Junit for UI with IntelliJ IDEA
This project utilizes Selenium WebDriver and Cucumber-Junit for automated testing of an e-commerce platform. Tests are written in Java and cover functionalities such as  login with invalid credentials and product search.

Here is the [link](https://shop.carry1st.com/en/HR) to home page of UI part of this project


### About framework

- I used `java` as my programming language in my framework.
- I used `Selenium` to automate my browsers.
- I used `maven` as my build automation tool. which has `pom.xml` file that allows me to manage my dependencies and plugins
- I used `Page Object Model` to simplify managing and maintain my framework for myself and my team.
- This design pattern allows me to locate `web elements` in their respective classes (under `pages` package).
- I created `Singleton Design Pattern` to allow my framework to pass the same instance of my webdriver in one session (`Driver` class under `utilities` package).
- I created a `configuration.properties` type of file where I keep the important test data about my framework. I keep Test data that can change the running flow of the whole framework, such as browser type
- I created `ConfigurationReader` utility class from existing java library to read from properties type of file.
- I implement `behavior driven development` (BDD) approach to simplify reading and understanding of my framework for the non-technical teammates in my team.
- I write my test cases as if they are scenarios from the end users perspective in `Gherkin` language in my `feature` files.
- `Gherkin` is very similar to English. Therefore, it is easy to understand for non-technical teammates.
- I implemented the actual coding logic with `JAVA-SELENIUM-JUNIT` inside my `step_definitions` package and in their related classes
- Under `step_definitions` package created `Hooks` class, where I implement some cucumber annotations such as `@After` to create outline for my scenarios.
- In `Hooks` class implemented a logic where my framework is taking a `screenshot` and attaching it to my report if a scenario is failing.
- `Data Driven Testing` (DDT) implemented through the SCENARIO OUTLINE in `feature` files


## How to run tests

- I trigger my framework from my `CukesRunner` class under `runners` package, in this package also have `FailedRunner` for running the failed tests only
- CukesRunner class allows me to run different types of testing suites that I created with my tags, such as @wip, @smoke or @regression
- For running the parallel testing press `maven`, `Lifecycle`, `test`
- I use `maven-cucumber-reporting` which is a very detailed reporting tool that has pie-charts and matrix's on which tests are passing and failing (`cucumber-report.html` file under `target` directory).
- Even has the option to show what percentage of which tags are failing and passing.




