package com.hrsystem

class Task {

    
String teamName
String numberOfPeople
String sectionName
String department
String timeRequired
String description
String taskCompleted


static constraints = {

teamName blank:false, nullable:false  

numberOfPeople blank:false, nullable:false 

sectionName blank:false, nullable:false 

timeRequired blank:false, nullable:false  

description blank:false, nullable:false 

taskCompleted blank:false, nullable:false 


}



}
