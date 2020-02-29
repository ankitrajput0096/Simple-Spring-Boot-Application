# Simple Spring Boot Application
This is a simple spring boot application to understand basic concept under the hood for spring boot.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development purposes. See running for notes on how to run the project on a system.

### Prerequisites

1. Clone the project to your local environment:
    ```
    git clone https://github.com/ankitrajput0096/Simple-Spring-Boot-Application
    ```

2. You need maven installed on your environment:

    #### Mac (homebrew):
    
    ```
    brew install maven
    ```
    #### Ubuntu:
    ```
    sudo apt-get install maven
    ```

### Installing

Once you have maven installed on your environment, install the project dependencies via:

```
mvn install
```

## Running

Run the application from the `Application.java` main method directly,
or from a command line:
```
mvn spring-boot:run
```

Your server should be now running on http://localhost:8080

## testing endpoints with Postman

1. Install Postman (https://www.getpostman.com)
2. Import Postman collection from the `Simple_Spring_boot_application.postman_collection.json` file
3. Enjoy !!

## Built With

* [Spring Boot](https://spring.io/projects/spring-boot) - Spring Boot 2
* [Maven](https://maven.apache.org/) - Dependency Management

## Contributing

If you have any improvement suggestions please create a pull request and I'll review it.


## Authors

* **Ankit Rajput** - *Initial work* - [Github](https://github.com/ankitrajput0096)

## License

This project is licensed under the MIT License

## Acknowledgments

* Big thanks to Pivotal for Spring Boot framework, love it!
