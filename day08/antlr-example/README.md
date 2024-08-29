# Maven Project Setup for ANTLR with Custom Cleanup

This guide will walk you through setting up a Maven project using a Maven archetype, configuring the `pom.xml` to use Java 21, integrating ANTLR, and customizing the `mvn clean` command to remove specific files.

## 1. Generate a New Maven Project

Start by generating a new Maven project using the `maven-archetype-quickstart` archetype.

```bash
mvn archetype:generate \
    -DgroupId=com.example \
    -DartifactId=antlr-example \
    -DarchetypeArtifactId=maven-archetype-quickstart \
    -DinteractiveMode=false

Rename App.java to ArithmeticApp.java.
Rename AppTest.java to AritmethicAppTest.java.

```bash
mvn compile

## 2. Update your pom.xml for Java 21, ANTLR, JUnit 5, and Hamcrest

Copy the pom.xml from this folder to your project. Check properties, dependencies, plugins, and Java version.

```bash
mvn compile

## 3. Create your Grammar

Copy the Arithmetic.g4 file to yout project. Check that you get the folder name right.

```bash
mvn compile

Check for new files inside the antlr subfolder.
If no new file is found, try:

```bash
mvn generate-sources

## 4. Write your Application

Copy ArithmeticApp.java from this folder to your project. Check the use of lexer and parser.

```bash
mvn compile

## 5. Run the application

A plugin will get the application class name from pom.xml. Just use exec to run the app:

```bash
mvn compile exec:java


## 5. Write your Test

Copy ArithmeticAppTest.java from this folder to your project. Check the use of Hamcrest assertions.

```bash
mvn compile

## 5. Run your Test

```bash
mvn test
