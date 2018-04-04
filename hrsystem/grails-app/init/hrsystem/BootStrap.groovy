package com.hrsystem

class BootStrap {

    def init = { servletContext ->

def Dave = new Manager(
fullName: 'Steve Crossbar',
userName:'scross',
password:'secret2018',
managerEmail: 'scross@email.com',
office: 'B1-900',
department:'Grocery,Electronics,Clothing'
).save()

def Chris = new Manager(
fullName: 'Steve Crossbar',
userName:'scross',
password:'secret2018',
managerEmail: 'scross@email.com',
office: 'B1-900',
department:'Grocery,Electronics,Clothing'
).save()

def Rob = new TeamLeader(
fullName: 'Sarah Macdonald',
department:'Grocery,Electronics,Clothing',
employeeID:'TL1111',
sectionName: 'Bakery,Butcher',
officePhone: '01111777',
leaderemail:'smac@email.com',
password: 'secret2017'

).save()   

def Khan = new TeamLeader(
fullName: 'Sarah Macdonald',
department:'Grocery,Electronics,Clothing',
employeeID:'TL1111',
sectionName: 'Bakery,Butcher',
officePhone: '01111777',
leaderemail:'smac@email.com',
password: 'secret2017'
).save() 

def Waqas = new Employee(
fullName: 'Tom Rivers',
dataOfBirth:'05/05/1999',
residence:'Sheffield,Barnsley,Doncaster',
horlyRate: '7.50',
employeeID: 'E25555',
dateEmployed:'26/02/2018',
taxCode: 'Tx345',
contract: 'Full-time, Part-time'
).save() 

def Hussain = new Employee(
fullName: 'Tom Rivers',
dataOfBirth:'05/05/1999',
residence:'Sheffield,Barnsley,Doncaster',
horlyRate: '7.50',
employeeID: 'E25555',
dateEmployed:'26/02/2018',
taxCode: 'Tx345',
contract: 'Full-time, Part-time'
).save()     

def Kesar = new Team(
teamName: 'Team Loading',
numberOfEmployee:'10,20',
sectionName:'Bakery,Butcher',
description: 'Loading and unloading deliveries',
teamleader: Rob
).save() 

def Atiq = new Team(
teamName: 'Team Loading',
numberOfEmployee:'10,20',
sectionName:'Bakery,Butcher',
description: 'Loading and unloading deliveries'
).save()

def Shahid = new Task(
teamName: 'Replenishing',
numberOfPeople:'2,4',
sectionName:'Bakery,G',
department: 'Grocery,Electronics,Clothing',
timeRequired: '1hour,2hours',
description:'Replenishing shelves',
taskCompleted: 'true or false, yes or no'
).save()

def steve = new Task(
teamName: 'Replenishing',
numberOfPeople:'2,4',
sectionName:'Bakery,G',
department: 'Grocery,Electronics,Clothing',
timeRequired: '1hour,2hours',
description:'Replenishing shelves',
taskCompleted: 'true or false, yes or no'
).save()

def Sam = new Shift(
timeOfDay: 'Morning,Afternoon,Evening',
dayOfWeek:'Monday,Tuesday',
numberOfHours:'4,6,8',
startingTime: '6:00am.12:00am,6:00pm'
).save()

def zak = new Shift(
timeOfDay: 'Morning,Afternoon,Evening',
dayOfWeek:'Monday,Tuesday',
numberOfHours:'4,6,8',
startingTime: '6:00am.12:00am,6:00pm'
).save()


    }
}
