demok8s

Сборка имейджа:
1. gradle build
2. docker build .
3. docker images
4. docker tag <image_id> gurok/demok8s (можно сразу было "docker build -t gurok/demok8s .")
5. docker login -u <user> -p <password>
6. docker push gurok/demok8s


kubectl version
minikube status
docker version

kubectl get nodes
kubectl describe node minikube
minikube ip

kubectl get all --all-namespaces
kubectl get namespaces
kubectl create namespace
kubectl get svc
kubectl describe service <svc_name>

kubectl get pods
kubectl apply -f ./deployment/mypod.yaml
kubectl logs -f <pod_name>
kubectl logs -f -n <namespace> <pod_name> 
kubectl port-forward <pod_name> 8001:8080
kubectl port-forward -n <namespace> <pod_name> 8001:8080
kubectl delete pod <pod_name>
kubectl delete pod -n <namespace> <pod_name>

helm install <release_name> ./deployment/helm
helm upgrade <release_name> ./deployment/helm
helm list
helm uninstall <release_name>

helm install kafka ./deployment/kafka
helm intall myhelm ./deployment/helm
helm uninstall myhelm
