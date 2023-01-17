demok8s

kubectl version
minikube status
docker version

kubectl get nodes
kubectl describe node minikube
minikube ip

kubectl get all --all-namespaces
kubectl get namespaces
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