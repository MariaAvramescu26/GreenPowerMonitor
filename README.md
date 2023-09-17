# Selenium Test Automation Proof of Concept (POC)

## Introduction

This repository contains a Proof of Concept (POC) for automating tests on [DNV.com] using Selenium WebDriver and TestNG. The purpose of this POC is to demonstrate the feasibility and effectiveness of automated testing for this website.

## Prerequisites

Before running the automation tests, ensure you have the following prerequisites set up:

- **Java Development Kit (JDK)**: Install JDK 8 or later.
- **Maven**: Install Maven for managing project dependencies.
- **WebDriver**: Download the appropriate WebDriver for your browser (e.g., ChromeDriver for Google Chrome).

## Getting Started

1. **Clone the Repository**: Clone this repository to your local machine using the following command:

     ```shell
 [git clone project](https://github.com/MariaAvramescu26/POC-Selenium-TestNG-POM.git)  

3. **Navigate to the Project Directory**: Change your current directory to the project folder:

   ```shell
   cd repo
   ```

4. **Set WebDriver Path**: Replace the `webdriverPath` in the test suite XML file (e.g., `testng.xml`) with the path to your WebDriver executable.

5. **Run the Tests**: Execute the tests using Maven:

   ```shell
   mvn test
   ```

## Test Structure

- **TestNG**: We use TestNG for test orchestration and reporting. The test suite configuration can be found in the `testng.xml` file.
- **Test Cases**: Test cases are located in the `src/test/java` directory and are organized into packages based on functionality.
- **Page Objects**: Page Object Model (POM) design pattern is used to represent web pages. Page classes are stored in the `src/main/java` directory.

## Reporting

TestNG generates HTML reports by default. After running the tests, you can find the report in the `target/surefire-reports` directory.

## Contributing

Contributions are welcome! If you find any issues or have improvements to suggest, please open an issue or submit a pull request.

## Acknowledgments

- Mention any libraries, tools, or resources used in this POC.
- Give credit to the authors or contributors of any third-party code or resources.



