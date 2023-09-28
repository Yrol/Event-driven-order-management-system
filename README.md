# Event driven order management system (Skeleton)
A skeleton order management system which consist of 3 microservices.

- Order service (producer)
- Stock service (consumer)
- Email service (consumer)

## Tech Stack
- Spring Boot
- RabbitMQ
- Docker

The RabbitMQ properties such as queues, exchanges and binding keys are all
pre-configured within `docker-compose/rabbitmq/definitions.json` to be initiated when starting the RabbitMQ Docker container.

## Running the services on Docker
This will allow to build and run all the services in Docker.

- RabbitMQ
- Spring boot app

### Prerequisites
- Docker up and running in the background

### Steps
- **Step 1:** The project needs to be built first using the command `mvn install -DskipTests` via intelliJ or in commandline. It should be executed under the root project `Event-driven-order-system` as shown below.<br/>
  ![](https://i.imgur.com/SUOUTH3.png)
- **Step 2:** Execute the following docker command inside `docker-compose` directory in order to bring up the Spring project and the RabbitMQ service.
    ```
    docker-compose up 
    ```
  ![](https://i.imgur.com/DHXxGuM.png)


## Running the project in IntelliJ

### Prerequisites
- Java 11
- Docker up and running in the background (for RabbitMQ)

### Steps
- **Step 1:** Execute the following docker command inside `docker-compose` directory in order to bring up the RabbitMQ servers.
    ```
    docker-compose -f rabbitmq.yml up 
    ```
- **Step 2:** Build and run all 3 microservices in IntelliJ: `order-service`, `stock-service` and `email-service`.

## Sending messages to RabbitMQ via `order-service` microservice

### via POST
Use cURL or Postman to send the following POST request
```agsl
curl --location 'http://localhost:8080/api/v1/orders' \
--header 'Content-Type: application/json' \
--data '{
    "name": "KitKat",
    "qty": 5,
    "price": 42.00
}'
```

## Accessing the RabbitMQ dashboard
The RabbitMQ dashboard can be accessed via port `15672`. Username:`guest`, Password: `guest`
```agsl
http://localhost:15672/
```
![](https://i.imgur.com/rFnWqNY.png)