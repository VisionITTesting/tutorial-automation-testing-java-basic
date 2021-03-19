# tutorial-automation-testing-java-basic
---

### Description:
This repo contains the basics of automation testing and java which will covered as a part of Automation Testing Online Training.

---

#### Tutorials on: 
* Automation Testing Basics 
* Java Basics
* Create Maven Project

---
#### Author:
* Created By: Akash Tyagi. 
* Reach me out at: akashdktyagi@gmail.com

---
#### Required Installations:

* For Selenium with Java Automation, you need below softwares:

* JDK-Java Development Kit: https://www.oracle.com/in/java/technologies/javase-downloads.html
* Eclipse: https://www.eclipse.org/downloads/
* Maven: https://maven.apache.org/download.cgi
    * Download this file: apache-maven-3.6.3-bin.zip
* Step by Step instruction to install maven: https://mkyong.com/maven/how-to-install-maven-in-windows/
* Git: https://git-scm.com/downloads


---

#### Ground Rules

* Target to spend at least 20 hrs per week. Use tools like this to track: https://clockify.me/
* Complete the Workshops and Assignments on time.
* Present your learning in the form demos.
* Do lot of self reading.
* Pre-Reading of the Topic.
* Learn Less, Do more.
* Do not focus on how many topics you have learnt rather focus on the depth of what you are learning.
*

---
#### Tutorials - Slides - Automation Testing Basics, Java Basics, Create Maven Project

>![Image](ss/Slide1.png)

>![Image](ss/Slide2.png)

>![Image](ss/Slide3.png)

>![Image](ss/Slide4.png)

>![Image](ss/Slide5.png)

>![Image](ss/Slide6.png)

>![Image](ss/Slide7.png)

>![Image](ss/Slide8.png)

>![Image](ss/Slide9.png)

>![Image](ss/Slide10.png)

>![Image](ss/Slide11.png)

>![Image](ss/Slide12.png)

>![Image](ss/Slide13.png)

>![Image](ss/Slide14.png)

>![Image](ss/Slide15.png)

>![Image](ss/Slide16.png)

>![Image](ss/Slide17.png)

>![Image](ss/Slide18.png)

>![Image](ss/Slide19.png)

>![Image](ss/Slide20.png)

>![Image](ss/Slide21.png)

>![Image](ss/Slide22.png)

>![Image](ss/Slide23.png)

>![Image](ss/Slide24.png)

>![Image](ss/Slide25.png)

>![Image](ss/Slide26.png)

---
## 2. Create your First Maven Project.
---

* Read this to know basics of Maven: [Click Here](https://maven.apache.org/guides/getting-started/index.html)

* Use below screen shots to create your first maven project.

>![Image](ss/Screenshot%202020-12-18%20at%2010.25.03%20PM.png)

>![Image](ss/Screenshot%202020-12-18%20at%2010.25.58%20PM.png)

* Make sure you check "create a simple project(skip archetype selection)" . See below screen shot
>![Image](ss/Screenshot%202020-12-18%20at%2010.26.19%20PM.png)

####  What is Artifact ID, Group ID and Version and what is the use?
* GroupID + Artifact ID + version = Gives your project a uniq identity
* Also called as signature of the your project
* Group ID usually refers to your company and sub divisions
* Artifact ID refers to your project name
* For example, if you are working for a company lets say "infosys" and lets say you are working in a department whose name is "Center of Excellence or CoE". And assume your are automating an ecommerce application. Then group id and artifact id can be as below:
    * Group ID: ```com.infosys.coe```
    * Artifact ID: ```ECommerceAutomationTestFW```
    * Version: ```3.1.3```
* Full signature of the project on "maven repo" will be: ```com.infosys.coe.ECommerceAutomationTestFW:3.1.3```
* You will then upload your project artifacts and compiled code on online maven repository [ClickHere](https://mvnrepository.com/)
* This is important when some one else wants make use of your project. 
* They can simply refer to your project from online maven repository.
* This is how we use Selenium, Junit, TestNG, Cucumber libraries in our project.

>![Image](ss/Screenshot%202020-12-18%20at%2010.26.52%20PM.png)

>![Image](ss/Screenshot%202020-12-18%20at%2010.29.03%20PM.png)

>![Image](ss/Screenshot%202020-12-18%20at%2010.30.03%20PM.png)

* Add properties tag in xml to include compiler version as ```1.8```
>![Image](ss/Screenshot%202020-12-18%20at%2010.32.48%20PM.png)

* Update the project after every POM.xml change.
>![Image](ss/Screenshot%202020-12-18%20at%2010.34.23%20PM.png)

>![Image](ss/Screenshot%202020-12-18%20at%2010.34.34%20PM.png)

>![Image](ss/Screenshot%202020-12-18%20at%2010.34.48%20PM.png)

* Create the package
>![Image](ss/Screenshot%202020-12-18%20at%2010.35.48%20PM.png)

>![Image](ss/Screenshot%202020-12-18%20at%2010.36.02%20PM.png)

>![Image](ss/Screenshot%202020-12-18%20at%2010.36.22%20PM.png)

>![Image](ss/Screenshot%202020-12-18%20at%2010.36.38%20PM.png)

>![Image](ss/Screenshot%202020-12-18%20at%2010.36.52%20PM.png)

>![Image](ss/Screenshot%202020-12-18%20at%2010.38.19%20PM.png)

* You can run the project in two ways:
    * Using Run as "Java Application". 
        * For this right click on the File which you want to run
    * Run as "Maven Project"
        * For this right click on the Project and go to maven and click on "maven test"
>![Image](ss/Screenshot%202020-12-18%20at%2010.38.46%20PM.png)

* Right click on the project (not file)
>![Image](ss/Screenshot%202020-12-18%20at%2010.39.52%20PM.png)

>![Image](ss/Screenshot%202020-12-18%20at%2010.40.19%20PM.png)

---
### How to Import an existing Maven Project in Eclipse?
* First make sure the project with the same signature is not already imported in eclipse, else it will throw an error

* Click on File->Import
>![Image](ss/Screenshot%202020-12-19%20at%2012.12.35%20AM.png)

* Select Existing Maven project
>![Image](ss/Screenshot%202020-12-19%20at%2012.12.53%20AM.png)

* If the Project is already there in the eclipse with matching artifact id or group id, then pom check box will be greyed out and a message at the top will be displayed.
* Try to delete the previous project if not required or change eclipse workspace, form File-Switch Workspace option
>![Image](ss/Screenshot%202020-12-19%20at%2012.13.20%20AM.png)

* Browse and go to the folder of the proect, select the Root folder of the POM.xml file.
* Select the checkbox of pom.xml file
>![Image](ss/Screenshot%202020-12-19%20at%2012.14.10%20AM.png)

## How to create a New Maven Project Using Idea IntelliJ

* Click on Create new Project
>![Image](ss/Screenshot%202020-12-21%20at%2012.11.40%20PM.png)

* Select Maven from Left Panel
>![Image](ss/Screenshot%202020-12-21%20at%2012.11.57%20PM.png)

* Enter Group name and artifact name/Project name
>![Image](ss/Screenshot%202020-12-21%20at%2012.12.31%20PM.png)

* Project Created
>![Image](ss/Screenshot%202020-12-21%20at%2012.12.46%20PM.png)

[Click here for Code](src/main/java/com/vit/_1_MyFirstCalcProgram)

## Create your First Program - Calculator

[Click here for Code](src/main/java/com/vit/_1_MyFirstCalcProgram)

## Create your Second Program - Enhanced Calculator

[Click here for Code](src/main/java/com/vit/_2_MyAdvancedCalcProgram)
