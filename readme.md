Basic Configurations
-----------------------
* Configure JDK, MAVEN, GRADLE, ANT, DOCKER path: [Jenkins Home -> Manage Jenkins -> Global Tool Configuration]


* Configure a Git-Repo:

<img width="1187" alt="Screenshot 2022-07-12 at 12 43 42 AM" src="https://user-images.githubusercontent.com/40859584/178340653-94d6f855-0b58-437e-a9d3-87131afad213.png">

* Configure a build trigger: [Notifies when this job will be triggered]

<img width="1140" alt="Screenshot 2022-07-12 at 12 51 31 AM" src="https://user-images.githubusercontent.com/40859584/178341911-41f25988-51d5-4071-8dc6-d1419c522799.png">

* Configure build action for this job : [What will happen in this job]

<img width="1166" alt="Screenshot 2022-07-12 at 12 52 27 AM" src="https://user-images.githubusercontent.com/40859584/178342079-70eefade-09b0-432f-8d52-46e4a7dc012a.png">



Create a pipeline in Jenkins using this project
-----------------------------------------------
* Development-Job : Define this job and configure this to be triggered as soon as there is a commit to the branch.
* UAT-Job : Define this job and configure this to be triggered once 'Development-Job' is successfully finished.
* Production-Job : Define this job and configure this to be triggered once 'UAT-Job' is successfully finished.
Example:
<img width="1643" alt="Screenshot 2022-07-12 at 12 33 39 AM" src="https://user-images.githubusercontent.com/40859584/178340023-b312b045-1dfc-430b-9994-387538121d7c.png">

**Define the pipeline:**
* Create a new 'Pipeline view' and configure the first job 'Development-Job' as the initial job.
<img width="1653" alt="Screenshot 2022-07-12 at 12 32 24 AM" src="https://user-images.githubusercontent.com/40859584/178339972-fe309d61-68e5-499b-9f95-1335f0d2ae59.png">

* In the 2nd (UAT-Job) and 3rd job (Production-Job), we have already marked the dependency of the other jobs.
* Configure the 'Display Options' in the pipeline view to see the different jobs in the pipeline view.


