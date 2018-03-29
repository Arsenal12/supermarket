package com.hrsystem

class Employee {

    
String fullName
String dataOfBirth
String residence
String horlyRate
String employeeID
String dateEmployed
String taxCode
String contract

static constraints = {

fullName blank:false, nullable:false  

dataOfBirth blank:false, nullable:false 

residence blank:false, nullable:false 

horlyRate blank:false, nullable:false 

employeeID blank:false, nullable:false 

dateEmployed blank:false, nullable:false 

taxCode blank:false, nullable:false 

contract blank:false, nullable:false 
}

    
}
