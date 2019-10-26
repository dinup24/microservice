### Prerequisites for microK8s

#### Pre-Requisites to be executed once Logged into Ubuntu VM to run k8s
```
sudo ufw allow in on cbr0 && sudo ufw allow out on cbr0
sudo ufw default allow routed
microk8s.start
microk8s.enable ingress

microk8s.status
```
If status is not running, then run the command microk8s.inspect
If the status shows that microk8s is running, then you should be able to run the kubectl commands in the image.
An alias "kubectl" has been created for the actual command "microk8s.kubectl" so that you can directly execute the kubectl commands.
