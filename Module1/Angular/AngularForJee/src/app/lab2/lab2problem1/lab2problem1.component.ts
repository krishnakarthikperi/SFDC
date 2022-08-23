import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-lab2problem1',
  templateUrl: './lab2problem1.component.html',
  styleUrls: ['./lab2problem1.component.css']
})
export class Lab2problem1Component implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  empId=0;
  empName='';
  empSal=0;
  empDept='';

  empIdUpdate=0;
  empNameUpdate='';
  empSalUpdate=0;
  empDeptUpdate='';
  updateIndex=0;

  employeeDetails=[
    {empId:1001,empName:"Rahul",empSal:9000,empDep:"Java"},
    {empId:1002,empName:"Sachin",empSal:19000,empDep:"OraApps"},
    {empId:1003,empName:"Vikash",empSal:29000,empDep:"BI"},
  ];
  
  addEmpDetails(){
    this.employeeDetails.push({empId:this.empId,empName:this.empName,empSal:this.empSal,empDep:this.empDept})
    alert("Added employee details");
  }
  
  showUpdateDetails(i:number){
    this.empIdUpdate=this.employeeDetails[i].empId;
    this.empNameUpdate=this.employeeDetails[i].empName;
    this.empSalUpdate=this.employeeDetails[i].empSal;
    this.empDeptUpdate=this.employeeDetails[i].empDep;
    this.updateIndex=i;
  }
  updateEmpDetails(i:number){
    this.employeeDetails[i].empId=this.empIdUpdate;
    this.employeeDetails[i].empName=this.empNameUpdate;
    this.employeeDetails[i].empSal=this.empSalUpdate;
    this.employeeDetails[i].empDep=this.empDeptUpdate;
    alert("Employee details updated");
  }

  deleteEmpDetails(i:number){
    this.employeeDetails.splice(i,1);
    alert("Deleted employee details");
  }
}