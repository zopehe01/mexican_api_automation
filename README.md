# API Automation Framework Using RestAssured

## Overview
This project is an API automation framework built using RestAssured. It is designed to simplify API testing and ensure the reliability of RESTful services.

## Features
- **Modular Design**: Easy to extend and maintain.
- **TestNG Integration**: Supports parallel execution and test grouping.
- **Data-Driven Testing**: Uses external data sources for dynamic test cases.
- **Custom Reporting**: Generates detailed test execution reports.
- **Logging**: Provides comprehensive logs for debugging.

## Prerequisites
- **Java**: Version 8 or higher.
- **Maven**: Build tool for dependency management.
- **IDE**: IntelliJ IDEA or Eclipse recommended.

## Installation
1. Clone the repository:
    ```bash
    git clone https://github.com/your-repo/api_automation_framework.git
    ```
2. Navigate to the project directory:
    ```bash
    cd api_automation_framework
    ```
3. Install dependencies:
    ```bash
    mvn clean install
    ```

## Usage
1. Configure API endpoints and test data in the `src/test/resources` folder.
2. Run tests using Maven:
    ```bash
    mvn test
    ```
3. View test reports in the `target/surefire-reports` directory.

## Project Structure
- **src/main/java**: Contains framework utilities and helper classes.
- **src/test/java**: Contains test cases and test configurations.
- **src/test/resources**: Contains test data and configuration files.

## Reporting
The framework generates HTML reports using TestNG. Reports can be found in the `target` directory after test execution.

## Contributing
Contributions are welcome! Please follow these steps:
1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Submit a pull request with a detailed description.

## License
This project is licensed under the [MIT License](LICENSE).

## Contact
For any questions or feedback, feel free to reach out:
- **Email**: hzope12@gmail.com
- **GitHub**: [ZopeHe01](https://github.com/ZopeHe01)