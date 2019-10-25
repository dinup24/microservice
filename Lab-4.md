### Lab 4

**1. Ensure you are able connect to Kubernetes cluster**  
Execute the following command to get the list of pods
```
kubectl get pods
```
You should see the message **No resources found.**  

**2. Deploy the microservice in kubernetes cluster**  
The deployment configuration is in `kubernetes/ms-deployment.yaml`. Replace `${docker-id}` with your docker hub id.
Excute the following command to apply the deployment configuration (ie., to deploy the microservice)
```
kubectl apply -f kubernetes/ms-deployment.yaml
```
To check the status of deployment: `sudo kubectl get deployment`  
To check the status of pods: `sudo kubectl get pods`

**3. Expose the microservice deployment using a service**  
The service configuration is in `kuberentes/ms-svc.yaml`
Excute the following command to apply the service configuration.
```
kubectl apply -f kubernetes/ms-svc.yaml
```
To see the list of service: `sudo kubectl get svc`

**4. Expose the microservice outside the cluster**  
Expose to the microservice outside the cluster over ingress controller. Execute the following command to create the ingress rule.
```
kubectl apply -f kubernetes/ingress.yaml
```

**5. Access the microservice**  
Now point your browser at `http://localhost:8080/api/greetings`  
or
```
curl http://localhost:8080/api/greetings
```

You should see the message **Hello World! - version 1**
