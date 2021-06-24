# hazelcast-demo
Cache layer using hazelcast

## Requirements

* [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/download/download-thanks.html?platform=linux&code=IIC)
* [JDK 1.8](https://openjdk.java.net/install/)
* O.S. Ubuntu 20.04.2 LTS

This project is intended to demonstrate how hazelcast manages to share the cache between applications
on the same machine using UDP. To demonstrate how the cache works, in the ParametersService class, a
Thread.sleep(3000) so the query has a delay and can see the cache functionality.

run the project

```spring-boot:run```

Call the endpoint of parameters

```curl localhost:8080/parameters/123```

Slow result in 3000 millis

Second call

```curl localhost:8080/parameters/123```

Instant due to cache

Raise the application again on another port, in the example, I used the applications on ports 8080 and 8081

```mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=8081```

Call the query now in the second application:

```curl localhost:8081/parameters/123```

You will see that the response will also be instantaneous due to cache sharing with the application on the 8080.

Reference: https://www.youtube.com/watch?v=cN8-4_Eka9A (23/06/2021 21:40)
