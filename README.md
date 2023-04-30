# JOB SEARCH PORTAL
>### Framework Used 
 * ![SpringBoot](https://img.shields.io/badge/SpringBoot-White?style=flat&logoColor=Blue)
>### Language Used
* ![Java](https://img.shields.io/badge/Java-White?style=flat&logoColor=Blue)
>## Data flow
In this project, we have four layers-
* **Controller** - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer. In short, it consists of views i.e., frontend part.
* **Service** -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
* **Repository** - This layer mainatains the h2-database thing on which CRUD operations are performed
* **Model** - This layer consists basically the class level things- the various classes required for the project and these classes consists the attributes to be stored.
>## Data Structure used in my project
This document outlines the steps to create a Job model 
Job model will have-
 * id;
 * title;
 * description;
 * location;
 * salary;

 * companyName;
 * employerName;
  * <Some-Enum> jobType;


>## Project Summary
The above project implements a Job Search portal project in which the endpoints provided are:

Also we have added validation on below ->
* Validation on salary
* First name(first letter should be capital on employe name and company name) 
*  Department(datatype of variable department should be Enum and not string Enum should support department names line ME , ECE , civil , CSE). 

 * id;
 * title;
 * description;
 * location;
 * salary;

 * companyName;
 * employerName;
  * <Some-Enum> jobType;
* Also we have added validation on below ->

* Validation 
* First name(first letter should be capital)
* Job Typet(datatype of variable department should be Enum and not string Enum should support department names line IT,MARKETING, SALES ,HR).
