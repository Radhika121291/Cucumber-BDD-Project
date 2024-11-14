**BDD CUCUMBER PROJECT**

**SELENIUM-CUCMBER-JAVA-MAVEN**

This repository contains a sample project that demonstrate how to use selenium-cucmber-java,a BDD(Behavior-Driven Development)
with cucumber and java.The projects showcase automation script development and utilize various reporters such as Extent-spark, HTML, and JSON. Additionally, it offers the ability to capture screenshots for tests and generate error shots for failed test cases.

**INSTALLATION & PREREQUISITIES**

1.JDK(1.8+)

2.Maven

3.IntelliJ IDEA

4.Required Plugins

    Maven
    
    Cucumber.
    
**FRAMEWORK SETUP**

To setup the framework you can either clone the repository or download the zip file and set it up in your local workspace.

**REPOTERS**

Once you have run your tests, you can generate various types of reports. This selenium-cucumber-java framework utilizes different test reporters to communicate pass/failure information.

**REPORTING**

Extent Spark Report

The framework utilizes the Spark Reports Framework to generate HTML test reports. Here is an example of a report generated by the Extent Reports open-source library:

![github](https://github.com/Aishwaryavenkat10/Cucumber-BDD-Projects/assets/54104504/2ce02288-e766-4602-847e-b7a740b19011)

**BDD AUTOMATION WITH CUCUMBER-JAVA AND PAGE OBJECTS**

In this repository, I have used the use of BDD with cucumber and java to develop automation scripts.

Tests are written in the Cucumber framework using the Gherkin syntax

src/main/java/factory - In this package, DriverFactory.java used to initialize the threadlocal driver on the basis of given browser and return the driver

src/main/java/utils - In ths package, ConfigReader.java used to load the properties from config.properties file and  return thr object prop

src/test/resources/features - all the cucumber features files (files .feature ext) goes here.

src/test/java/stepdefinition - you can define step defintion under this package for your feature steps.

src/test/java/AppHooks - where you can configure all before and after test settings ApplicationHooks.java

In Cucumber using Junit the feature files are run in parallel mode rather than the scenarios,which means all the scenarios in a feature file will be executed by same thread.

To run the scenarios in parallel, we can use TestNG

src/test/java/parallel - This package contains all stepdefinitions,Hooks and Runner files to run the scenarios in parallel.

**RUNNING THE TESTS**

Go to your project directory from commandprompt and hit following commands:

mvn test (defualt will run on local chrome browser)

mvn test "-Dbrowser=browsername" (to use any other browser)

mvn test -Dcucumber.options="classpath:features/login.feature" to run specific feature.

