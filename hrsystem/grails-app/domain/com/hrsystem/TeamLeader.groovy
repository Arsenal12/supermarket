package com.hrsystem

class TeamLeader {

    

String fullName
String department
String employeeID
String sectionName
String officePhone
String leaderemail
String password
String toString(){
return fullName
}


static constraints = {

fullName blank:false, nullable:false  

department blank:false, nullable:false 

employeeID blank:false, nullable:false 

sectionName blank:false, nullable:false 

officePhone blank:false, nullable:false 

leaderemail blank:false, nullable:true

password blank:false, nullable:false 
    }

}
