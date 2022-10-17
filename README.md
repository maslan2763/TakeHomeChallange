# TakeHomeChallange

 ===============Overview================


- Project has been created based on Cucumber/BDD framework witten in Java OOP language.

- Selenium WebDriver is a library tool which is used for UI automation testing. 

- My framework is created as a maven project which is a project builder tool; maven is used to manage dependencies and plugins and run our tests, as mvn test/verify from terminal. 

- In my framework, I used POM according to which has separate class for every page of the application

- My framework uses a singleton pattern to share the WebDriver instance between different classes.

- I used Junit as a testing tool. Junit is used to kick off cucumber tests and also do assertions. 

- I used Cucumber to write test cases, requirements, specifications in a GHERKIN language understandable by non-tech people.

- In Cucumber, I have runner files includes CukesRunner class run the test cases with specified tags and FailedTestRunner class reruns the failed test. I have Step definitions files where I store test case codes and Features files includes test case each test case steps written in Gherkin Language.
- I have in my framework configuration. properties file to store the important test data, like url’s, browsers etc.. 

- I have Utilities package that has reusable utilities which can be used across different classes of my framework, like, ConfigurationReader that reads my configuration.properties file, and My Driver that I can choose which browser I will use in this test case, BrowserUtil which has many useful methods for different tests.

- My framework generates detailed HTML and JSON reports with is easy to read and understand to non-technical team members. My reports have details test steps and screenshots for any failures that may occur. It can also do metrics on what percentage is passing, failing, skipped etc. 

- Some important datas have been taken from a separate  data file(excel file) by the help of Apache.poi


