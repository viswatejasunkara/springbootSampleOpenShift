# springbootSampleOpenShift

download local 
https://console.redhat.com/openshift/create/local

code ready container setup
crc setup

crc start

crc stop


# developer sandbox for hosted env
# --------------------------
https://developers.redhat.com/developer-sandbox

# OC setup
# -----------
oc whoami
oc login -u developer

oc project

oc new-project myproject

oc project myproject

oc projects (lists the projects)

oc explain pod

oc create -f pods/pod.yaml

oc get pods

oc rsh <pod name>

oc delete pod <podname>


# OC GRaphical interface
# -----------------------


https://console-openshift-console.apps-crc.testing
developer
developer

# DEPLOYMENT configs
# ---------------------

oc new-app quay.io/practicalopenshift/hello-world --as-deployment-config


oc status

 oc get svc

oc get dc (deployment config)

oc get istag



oc status
	oc delete svc/hello-world
	oc delete dc/hello-world
	
	
# CONNECT TO GIT
# ---------------


oc new-app https://INGCDaaS@dev.azure.com/INGCDaaS/IngOne/_git/P01753-metadata-retrieval-service --as-deployment-config


# Replication controller
# -----------------------


oc get rc



# SERVICES
# ---------


oc explain svc

oc create  -f pods/pod.yaml 
	oc expose --port 8080 pod/hello-world-pod



oc create  -f pods/pod2.yamL
	oc rsh pod/hello-world-pod-2
		 wget -qO- 10.217.5.240:8080

	
![image](https://github.com/viswatejasunkara/springbootSampleOpenShift/assets/45903810/af4eaf70-b764-417b-906d-1fcfcc348e4b)
