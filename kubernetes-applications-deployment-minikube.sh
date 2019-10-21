#! /bin/bash

# Ingress nginx deploy https://kubernetes.github.io/ingress-nginx/deploy/#prerequisite-generic-deployment-command
kubectl apply -f https://raw.githubusercontent.com/kubernetes/ingress-nginx/master/deploy/static/mandatory.yaml

minikube addons enable ingress

kubectl apply -f ./kubernetes --recursive


