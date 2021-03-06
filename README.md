# Springboot discovery service with consul

Discovery service is a part of microservices architecture, to run it this is system required:

- VirtualBox
- Docker
- minikube (kubernate platform)

## Configure minikube

start the kubernate platform with this command:

```bash
minikube start -p springboot2-discovery-service-consul
```

The output will show like this:

```bash
โ  ~ minikube start -p springboot2-discovery-service-consul
๐  minikube v1.0.0 on darwin (amd64)
๐คน  Downloading Kubernetes v1.14.0 images in the background ...
๐ฅ  Creating virtualbox VM (CPUs=2, Memory=2048MB, Disk=20000MB) ...
๐ถ  "springboot2-discovery-service-consul" IP address is 192.168.99.111
๐ณ  Configuring Docker as the container runtime ...
๐ณ  Version of container runtime is 18.06.2-ce
โ  Waiting for image downloads to complete ...
โจ  Preparing Kubernetes environment ...
๐  Pulling images required by Kubernetes v1.14.0 ...
๐  Launching Kubernetes v1.14.0 using kubeadm ... 
โ  Waiting for pods: apiserver proxy etcd scheduler controller dns
๐  Configuring cluster permissions ...
๐ค  Verifying component health .....
๐  kubectl is now configured to use "springboot2-discovery-service-consul"
๐  Done! Thank you for using minikube!
```

checking status:

```bash
minikube -p springboot2-discovery-service-consul status
```

dashboard minikube:

```bash
minikube -p springboot2-discovery-service-consul dashboard
```
