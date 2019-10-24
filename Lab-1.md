### Lab 1

**1. Clone get repo**  
Create a workspace directory (say `workspace`) and execute the following command in this directory to clone the github repo.

```
git clone https://github.com/dinup24/microservice.git
```

The source code will be present in `${workspace}/microservice` directory.

**2. Build the project to create an executable jar**   
The source code is present in `src` folder. Refer `src/main/java/io/vertx/example/HelloWorldEmbedded.java` java class, which contains API logic.  

Execute the following command to build the executable jar
```
./gradlew shadowJar
```

The executable jar will be created in `build/libs/microservice-1.0.0-fat.jar`  

**3. Execute the microservice**  
Run the fat jar created in the previous step
```
java -jar build/libs/microservice-1.0.0-fat.jar
```

**4. Access the microservice**  
Now point your browser at `http://localhost:8080`  
or
```
curl http://localhost:8080
```

You should see the message **Hello World! - version 1**
