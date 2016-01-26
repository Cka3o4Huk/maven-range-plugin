[![Build Status](https://api.travis-ci.org/Cka3o4Huk/range-maven-plugin.svg?branch=master)](https://travis-ci.org/Cka3o4Huk/range-maven-plugin)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.Cka3o4Huk/range-maven-plugin/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.Cka3o4Huk/range-maven-plugin)

range-maven-plugin
=====================

Maven plugin to generate random data using range library

Usage
-----

Just include the plugin in your `pom.xml` and execute `mvn jmeter-graph:create-graph`.

```xml
<project>
  <!-- ... -->
  <build>
    <plugins>
      <plugin>
        <groupId>com.github.Cka3o4Huk.jmeter-graph-plugin</groupId>
        <artifactId>jmeter-graph-maven-plugin</artifactId>
        <version>0.1.1</version>
        <configuration>
          <inputFile>${project.build.directory}/jmeter/results/SimpleWebservicePerformanceTest.jtl</inputFile>
          <graphs>
            <graph>
              <pluginType>ThreadsStateOverTime</pluginType>
              <width>800</width>
              <height>600</height>
              <outputFile>${project.build.directory}/jmeter/results/SimpleWebservicePerformanceTest-ThreadsStateOverTime.png</outputFile>
            </graph>
            <!-- ... you can declare more <graph>-elements here -->
          </graphs>
        </configuration>
      </plugin>
    </plugins>
  </build>
</project>
```
