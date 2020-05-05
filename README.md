
# Pyramid of Testing // TDD II

```
Feature: Calculate the popularity of Indian gods in Mahabharata

Background: The Mahabharata is one of the two major Sanskrit epics of ancient India

Scenario: Calculate the influence of Indian gods in Mahabharata

	Given a REST API about Indian Gods

	When the client sends the request

	Then return the Top 3 indian gods mentioned in Mahabharata

	And with presence in Wikipedia

	And the number of hits in Mahabharata data source
```

## Getting Started

Before we begin, open a terminal and run the following commands to ensure that you have valid versions of Java and Maven installed:
```
$ java -version
java version "1.8.0_102"
Java(TM) SE Runtime Environment (build 1.8.0_102-b14)
Java HotSpot(TM) 64-Bit Server VM (build 25.102-b14, mixed mode)
```

```
$ mvn -v
Apache Maven 3.5.4 (1edded0938998edf8bf061f1ceb3cfdeccf443fe; 2018-06-17T14:33:14-04:00)
Maven home: /usr/local/Cellar/maven/3.3.9/libexec
Java version: 1.8.0_102, vendor: Oracle Corporation
```

### Installing

```
mvn package
```


## Running the tests

```
mvn clean test
```


### And coding style tests


## Deployment

Trunk based development

* https://trunkbaseddevelopment.com/
