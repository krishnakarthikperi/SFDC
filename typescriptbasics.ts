//primitive types
/*let age:number|string=14;
age='12';
let username:string;
username = 'Max';
var isInstructor:boolean;
isInstructor = true;
console.log(age);
console.log(username);
console.log(isInstructor);
*/
/*let hobbies:string[];
hobbies = ['sports','cooking']
let person:any;
person={
    name:'john',age:32
}
let person=person[];
*/
//class
/*class Employee{
    // firstName:string;
    // lastName:string;
    // age:number;
    // courses:string[];
    constructor(public firstName:string,public lastName:string,public age:number,public courses:string[]){}
    add(courseName:string){
        this.courses.push(courseName)
    }
    listCourses(){
        return this.courses;
    }
}
const emp=new Employee('Max','Jonas',32,['Angular']);
emp.add('Bootstrap');
console.log(emp);
console.log(emp.listCourses());
*/
//interface
interface Human{
    firstName:string;
    age:number;
    greet:()=>void
}
let john:Human;
john={
    firstName:'John',
    age:32,
    greet(){
        console.log('Hello');
    }
}
console.log(john);
console.log(john.greet());
class Instructor implements Human{
    firstName: string;
    age:number;
    greet(){
        console.log('Hello!!!!!!!!!!!');
    }
}