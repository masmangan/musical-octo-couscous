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
