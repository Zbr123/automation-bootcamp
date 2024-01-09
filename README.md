****Project Name** : automation-bootcamp**

**Introduction**
This is a Maven-based Java project implementing the Page Object Model (POM) and Behavior-Driven Development (BDD) frameworks. It is designed for automated testing, ensuring high-quality software development with a focus on maintaining clean and readable code.

**Prerequisites**
- Java JDK (version 8 or higher)
- Maven (version 3.6 or higher)
- Any IDE that supports Java and Maven (e.g., IntelliJ IDEA)
- Setup and Installation
- Clone the repository: git clone
- Navigate to the project directory: cd [project_name]
- Install dependencies: mvn install

**Structure**
- src/main/java: Contains the main Java code implementing the POM framework.
- src/test/java: Contains the test cases written using BDD principles.
- pom.xml: Maven Project Object Model file, defining project configuration and dependencies.

**Frameworks and Libraries**
- Selenium WebDriver: For automating web applications.
- Cucumber: For writing tests in a human-readable format (Gherkin).
- JUnit: As the testing framework.
- Extent Reports: For generating detailed test reports along with Cucmber report

**Writing Tests**
- Write feature files in src/test/resources/features.
- Implement step definitions in src/test/java/stepDefinitions.
- Create page classes under src/main/java/pages implementing the POM structure.
- Running Tests
- Execute tests WebRunner


**Reporting:**
Generated reports can be found in the target directory post-execution, using cucumber reporting.
