
class Employee extends Human{
    constructor(name,cmnd,birth,email,address,job) {
        super(name,cmnd,birth,email,address);
        this.job = job
    }
    getName() {
        return this.name;
    }
    getCMND() {
        return this.cmnd;
    }
    getBirth() {
        return this.birth;
    }
    getEmail() {
        return this.email;
    }
    getAddress() {
        return this.address;
    }
    getJob() {
        return this.job
    }
    setName(name) {
        this.name = name;
    }
    setCMND(cmnd) {
        this.cmnd = cmnd;
    }
    setBirth(birth) {
        this.birth= birth;
    }
    setEmail(email) {
        this.email = email;
    }
    setAddress(address) {
        this.address = address;
    }
    setJob(job) {
        this.job = job
    }
    getSalary() {
        switch (this.job) {
            case ('Manager'):
                return this.name +' có trợ cấp là ' + 500+'$';
                break;
            case ('Sale'):
                return this.name +' có trợ cấp là ' +300+'$';
                break;
            case('Marketing'):
                return this.name +' có trợ cấp là ' + 200+'$';
                break;
            default:
                alert('sai công việc');
        }
    }
}
function EmployeeData() {
    let a = prompt('1.Add New Customer.\n' +
        '2.Display Information Customer.\n' +
        '3.Edit Information Customer.\n' +
        '4.Delete Customer.\n' +
        '5.Salary of Employees.\n' +
        '6.Exit.\n');
    switch (a*1) {
        case 1:
            addNewEmployee();
            break;
        case 2:
            displayEmployee();
            break;
        case 3:
            editEmployee();
            break;
        case 4:
            deleteEmployee();
            break;
        case 5:
            salaryEmployee();
            break;
        case 6:
            alert('Done');
            break;
        default:
            alert('Nhập lại');
            EmployeeData();
    }
}
let arrListEmployee = [];
let employee;
let print = document.getElementById('task2');
function addNewEmployee() {
    let Name = prompt('Employee Name');
    let Id = prompt('Employee ID');
    let Birth = prompt('Date of Birth');
    let Email = prompt('Email');
    let Address = prompt('Address');
    let Job = prompt('Job');
    employee = new Employee(Name,Id,Birth,Email,Address,Job);
    arrListEmployee.push(employee);
    EmployeeData();
}
function displayEmployee() {
    let e = "<table>" +'<tr>' + '<th>STT</th>' + '<th>Employee Name</th>' + '<th>Employee ID</th>' +
        '<th>Date of Birth</th>' + '<th>Email</th>' + '<th>Address</th>' + "</tr>";
    for ( let i = 0; i < arrListEmployee.length; i++) {
        e += "<tr>" + "<td>" + (arrListEmployee.length) + "</td>" +
            "<td>" + employee.getName()+ "</td>"  +
            "<td>" + employee.getCMND() + "</td>"  +
            "<td>" + employee.getEmail() + "</td>" +
            "<td>" + employee.getBirth() + "</td>"  +
            "<td>" + employee.getAddress() + "</td>" + "</tr>";
    }
    e += "</table>";
    print.innerHTML = e;
}
function editEmployee() {
    let a = prompt('STT');
    if (a > arrListEmployee.length) {
        alert('Nhập lại');
        editEmployee();
    }
    let b = prompt('1.Employee Name.\n' +
        '2.Employee ID.\n' +
        '3.Email.\n' +
        '4.Address.\n' +
        '5.Date of Birth.\n');
    let edited;
    switch (b*1) {
        case 1:
            edited = prompt('nhập chỉnh sửa');
            arrListEmployee[a-1].setName(edited);
            print.innerHTML = '';
            displayEmployee();
            break;
        case 2:
            edited = prompt('nhập chỉnh sửa');
            arrListEmployee[a-1].setCMND(edited);
            print.innerHTML = '';
            displayEmployee();
            break;
        case 3:
            edited = prompt('nhập chỉnh sửa');
            arrListEmployee[a-1].setEmail(edited);
            print.innerHTML = '';
            displayEmployee();
            break;
        case 4:
            edited = prompt('nhập chỉnh sửa');
            arrListEmployee[a-1].setAddress(edited);
            print.innerHTML = '';
            displayEmployee();
            break;
        case 5:
            edited = prompt('nhập chỉnh sửa');
            arrListEmployee[a-1].setBirth(edited);
            print.innerHTML = '';
            displayEmployee();
            break;
        default:
            alert('nhập lại');
            editEmployee();
    }
}
function deleteEmployee() {
    let a = prompt('nhập STT nhân viên');
    if (a > arrListEmployee.length) {
        alert('không có nhân viên này');
        deleteEmployee();
    }
    arrListEmployee.splice((a-1),1);
    print.innerHTML = '';
    displayEmployee();
}
function salaryEmployee() {
let a = prompt('nhập STT nhân viên');
    if (a > arrListEmployee.length) {
        alert('không có nhân viên này');
        salaryEmployee();
    }
    alert(arrListEmployee[a-1].getSalary())
}
