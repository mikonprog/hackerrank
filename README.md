# Interview Assignment 

Simple banking money transaction application

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for testing purposes

### Prerequisites

What things you need to install the software and how to install them

```
MySql 5.7 or higher
```

### Installing

Download or Clone project from GitHub 

Open preferably on an IDEA.

```
Give the example
```
There are two predefined accounts stored in a local database when starting the application :

```
| account_id    | account_number | balance | 
| ------------- | -------------  |-------- |
|       1       |    18395627    |  25000  | 
|       2       |    13902143    |  12000  |
```

Use this data as input to test the application through the exposed APIs.

## Running the application

Run Spring Boot Application and go to :

```
http://localhost:8080/swagger-ui.html
```

On the Transaction Controller there are three endpoints:

* Credit money from one account to another
* Retreive transactions history for and account
* Retreive all transactions peerformed

Use the predefined accounts' information to test the APIs

### End to end tests

Integration tests cover the basic cases of success and failure of the above functionality

