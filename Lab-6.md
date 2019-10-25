### Lab 6

**1. Deploy the newer version of the microservice**  
Update `kubernetes/ms-deployment.yaml` with version 2  
- name `ms-deployment-v1` to `ms-deployment-v2`  
- label `version: v1` to `version: v2`  
- image `microservice:1.0.0` to `microservice:2.0.0`  

Execute the following command to deploy the version 2
```
kubectl apply -f kubernetes/ms-deployment.yaml
```

**2. Scale up the old deployment**  
Increase the replicas of microservice version 1 to 4 by running the following command
```
kubectl scale deployment/ms-deployment-v1 --replicas=4
```

**3. Access the microservice to see how the traffic is split between v1 and v2**  
Make multiple requests in a for loop
```
for ((i=1;i<=10;i++)); do   curl -kL http://127.0.0.1/api/greetings; echo; done
```
Now you should see that the traffic is being splitted in 4:1 ratio.
