# test-task-netguru 

# Installation

## General setup for Windows 10

- Install [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
- Install [Apache Maven](https://maven.apache.org/download.cgi)
- Install some IDE, for example [Eclipse](https://www.eclipse.org/downloads/)

Before you start, install variables:
1 - Go to "Advanced system settings > Advanced > Environment Variables" 
2 - Add system variable "JAVA_HOME" with a path to current JDK folder
3 - Add system variable "MAVEN_HOME" with a path to current apache-maven folder
4 - Add a path to "Path" system variable
```
%JAVA_HOME%\bin
```

and 

```
%MAVEN_HOME%\bin
```

## Checking existing software

1 - Open promt and type

```
java -version
```

and 

```
mvn -version
```

2 - Open your Chrome and check the browser version.

-- In case you have a different version from "91":

- download the newest version 91

Or if your curent version is higher you need to [update ChromeDriver](https://www.selenium.dev/downloads/):
- download zip
- unpack
- replace it into the folder "test-task-netguru/src/main/resources"

## Project

1. To clone the project open git bash or promt put the string of code and press enter

```
git clone https://github.com/daniil5469/test-task-netguru
```

2. Open the project in Eclipse IDE or in someone else
3. For run the tests use the Eclipse environment
4. For run the test through out promt open it go to the project folder and type comands:

```
mvn -Dtest=PositiveLogInTest
```

And press enter to run test Or

```
mvn -Dtest=NegativeLogInTest
```

and press enter to run negative test


## Additional link information

- https://www.guru99.com/install-java.html
- https://mkyong.com/java/how-to-set-java_home-on-windows-10/
- https://mkyong.com/maven/how-to-install-maven-in-windows/

Plugins:
https://maven.apache.org/plugins/maven-compiler-plugin/
http://maven.apache.org/surefire/maven-surefire-plugin/
https://mvnrepository.com/artifact/org.testng/testng
https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
