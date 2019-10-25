### Lab 3  

**1. Start the microservice using the docker image**  
Execute the following command to start the docker container
```
sudo docker run -it -p 8080:8080 ${docker-id}/microservice:1.0.0
```

Use `-d` option to run the container in background.  
To see the list of running containers `docker ps`

**2. Access the microservice**  
Now point your browser at `http://localhost:8080/api/greetings`  
or
```
curl http://localhost:8080/api/greetings
```

You should see the message **Hello World! - version 1**

**3. Stop the microservice**  
Exceute the following command to stop the container
```
sudo docker stop ${container-id}
```
