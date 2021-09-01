# Makers Twitter Spring Boot

You can use this seed to get started building a Twitter clone.

It comes set up with:

* The JUnit5 test framework.
* The Spring Boot web framework.
* The PostgreSQL database.
* The JPA ORM
* The Thymeleaf view templating system.

Posting and listing tweets is already implemented and commented.

## Usage

First create the databases:
```shell
; createdb makers-twitter-clone-dev
; createdb makers-twitter-clone-test
```

Then open this directory using IntelliJ. You may need to wait for
the dependencies to install.

Then, in the Gradle sidebar:

* To run the tests: `Twitter -> Tasks -> Verification -> Test`
* To run the server: `Twitter -> Tasks -> Application -> bootRun`

Then, start the server:
```
./gradlew bootRun
```

Then visit: `http://localhost:8080/`


## Features to implement

### To begin

The first two are already set up for you in the seed, including testing.

> As a user  
> So that I can know what website this is  
> I want to see the 'Twitter' heading on the home page

> As a user  
> So that I can let people know what I am doing  
> I want to post a message (tweet) to twitter

> As a user  
> So that I can see what others are saying  
> I want to see all tweets in reverse chronological order

Additional notes:
* You will need to feature test this, and the following features too.
* You don't have to be signed in to see the tweets.

> As a user  
> So that I can better appreciate the context of a twitter  
> I want to see the time at which it was posted

> As a user  
> So that I can post messages on twitter as me  
> I want to sign up for twitter

Additional notes:
* Users sign up with their email, password, name, and a username.
* Tweets should now display the name of the poster and their username.

### To progress

> As a user  
> So that only I can post messages on Twitter as me  
> I want to log in to Twitter

> As a user  
> So that I can avoid others posting messages on Twitter as me  
> I want to log out of Twitter

### To advance

> As a user  
> So that I can have a conversation  
> I want to reply to a tweet from another user

> As a user  
> So that I can clearly read and use the service  
> I want to see a well-designed user interface

Additional notes:
* You may wish to use CSS and Javascript to achieve this.

## Upstream Documentation

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.2/gradle-plugin/reference/html/)
* [Create an `OCI` image](https://docs.spring.io/spring-boot/docs/2.5.2/gradle-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.5.2/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.5.2/reference/htmlsingle/#boot-features-jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
