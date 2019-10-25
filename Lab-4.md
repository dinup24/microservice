### Lab 4

**1. Ensure you are able connect to Kuberentes cluster**  
Execute the following command to get the list of pods
```
kubectl get pods
```
You should see the message **No resources found.**  

**2. Deploy the microservice in kuberentes cluster**  
The deployment configuration is in `kubernetes/ms-deployment.yaml`
Excute the following command to apply the deployment configuration (ie., to deploy the microservice)
```
kubectl apply -f kubernetes/ms-deployment.yaml
```

**3. Expose the microservice deployment using a service**  
The service configuration is in `kuberentes/ms-svc.yaml`
Excute the following command to apply the service configuration.
```
kubectl apply -f kubernetes/ms-svc.yaml
```

**4. Expose the microservice outside the cluster**  
This is performed to make the microservice accessible from outside the cluster.
**TODO**  

**5. Access the microservice**  
Now point your browser at `http://localhost:8080`  
or
```
curl http://localhost:8080
```

You should see the message **Hello World! - version 1**
