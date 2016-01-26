[![Build Status](https://api.travis-ci.org/Cka3o4Huk/maven-range-plugin.svg?branch=master)](https://travis-ci.org/Cka3o4Huk/maven-range-plugin)
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
				<groupId>com.github.Cka3o4Huk</groupId>
				<artifactId>range-maven-plugin</artifactId>
				<version>0.0.1-SNAPSHOT</version>
				<configuration>
				  <!-- ... you can declare more <field>-elements here -->
					<fields>
						<field>
							<name>accountName</name>
							<type>range(1000000,9999999)</type>
						</field>
						<field>
							<name>emailAddress</name>
							<type>regex([a-z][a-z0-9]{3,10}\@[a-z]{5,7}\.jp)</type>
						</field>
						<field>
							<name>password</name>
							<type>regex([1-9a-f][0-9a-f]{31})</type>
						</field>
					</fields>
				</configuration>
			</plugin>
		</plugins>
	</build>
  
</project>
```
