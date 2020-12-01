class Human {
    constructor(name,cmnd,birth,email,address) {
        this.name = name;
        this.cmnd = cmnd;
        this.birth = birth;
        this.email = email;
        this.address = address;
    }
}
class Customer extends Human{
    constructor(name,cmnd,birth,email,address,card,amount,rentday,room,discount) {
        super(name,cmnd,birth,email,address);
        this.card = card;
        this.amount = amount;
        this.rentday = rentday;
        this.room = room;
        this.discount = discount;
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
    getCard() {
        return this.card;
    }
    getEmail() {
        return this.email;
    }
    getAddress() {
        return this.address;
    }
    getAmount() {
        return this.amount;
    }
    getRentday() {
        return this.rentday;
    }
    getRoom() {
        return this.room;
    }
    getDiscount() {
        return this.discount
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
    setCard(card) {
        this.card = card;
    }
    setAmount(amount) {
        this.amount = amount;
    }
    setRentDay(rentday) {
        this.rentday= rentday;
    }
    setRoom(room) {
        this.room = room;
    }
    setDiscount(discount) {
        this.discount = discount
    }
    pay() {
        let money = this.getRentday()*(1-this.getDiscount()/100);
        if (this.getRoom() === 'Villa') {
            money = money*500;
        }
        if (this.getRoom() === 'House') {
            money = money*300;
        }
        if (this.getRoom() === 'Room') {
            money = money*100;
        }
        return money
    }
}

let name = document.getElementById('name');
let cmnd = document.getElementById('cmnd');
let address = document.getElementById('add');
let card = document.getElementById('card');
let amount = document.getElementById('people');
let rentday = document.getElementById('rent');
let room = document.getElementById('room');
let discount = document.getElementById('discount');
let birth = document.getElementById('birth');
let email = document.getElementById('email');
let b = document.getElementById('sun');
let listCustomers = [];
let reset = -1;
let i = 0;
let customer;
function add() {
     customer = new Customer(name.value,cmnd.value,birth.value,email.value,address.value,card.value,amount.value,rentday.value,room.value,discount.value);
    if (reset == -1) {
        listCustomers.push(customer);
        add2();
    } else {
        listCustomers[reset] = customer;
        document.getElementById('duong').value = 'Add';
        update();
        reset = -1;
    }
    document.getElementById('reset').reset();
}
function update() {
    b.innerHTML= '';
    for (i = 0; i < listCustomers.length; i++) {
        let customer = listCustomers[i];
        b.innerHTML += "<tr>" + "<td>" + (i + 1) + "</td>" +
            "<td>" + customer.getName()+ "</td>" +
            "<td>" + customer.getCMND() + "</td>" +
            "<td>" + customer.getEmail() + "</td>" +
            "<td>" + customer.getBirth() + "</td>" +
            "<td>" + customer.getAddress() + "</td>" +
            "<td>" + customer.getCard() + "</td>" +
            "<td>" + customer.getAmount() + "</td>" +
            "<td>" + customer.getRentday() + "</td>" +
            "<td>" + customer.getRoom() + "</td>" +
            "<td>" + customer.getDiscount() + "</td>" +
            "<td>" + "<input type='button' value='Pay' onclick='pay("+(i)+")'>" + "</td>" +
            "<td>" + "<input type='button' value='Edit' onclick='edit("+(i)+")'>" + "</td>" +
            "<td>" + "<input type='button' value='Delete' onclick='deletea("+(i)+")'>" + "</td>" + "</tr>";
    }
}
function add2() {
    b.innerHTML += "<tr>" + "<td>" + (listCustomers.length) + "</td>" +
        "<td>" + customer.getName()+ "</td>" +
        "<td>" + customer.getCMND() + "</td>" +
        "<td>" + customer.getEmail() + "</td>" +
        "<td>" + customer.getBirth() + "</td>" +
        "<td>" + customer.getAddress() + "</td>" +
        "<td>" + customer.getCard() + "</td>" +
        "<td>" + customer.getAmount() + "</td>" +
        "<td>" + customer.getRentday() + "</td>" +
        "<td>" + customer.getRoom() + "</td>" +
        "<td>" + customer.getDiscount() + "</td>" +
        "<td>" + "<input type='button' value='Pay' onclick='pay("+(listCustomers.length - 1)+")'>" + "</td>" +
        "<td>" + "<input type='button' value='Edit' onclick='edit("+(listCustomers.length - 1)+")'>" + "</td>" +
        "<td>" + "<input type='button' value='Delete' onclick='deletea("+(listCustomers.length - 1)+")'>" + "</td>" + "</tr>";
}
function edit(data) {
    reset = data;
    let customer = listCustomers[data];
    name.value = customer.getName();
    cmnd.value = customer.getCMND();
    address.value = customer.getAddress();
    card.value = customer.getCard();
    amount.value = customer.getAmount();
    email.value = customer.getEmail();
    rentday.value = customer.getRentday();
    room.value = customer.getRoom();
    discount.value = customer.getDiscount();
    birth.value = customer.getBirth();
    document.getElementById('duong').value = 'Update';
}
function deletea(datadelete) {
    listCustomers.splice(datadelete,1);
    update();
}
function pay(stt) {
let customer = listCustomers[stt];
    alert(customer.name + ' phải trả ' + customer.pay() + ' đồng')
}
// check
function checkall(id) {
    let a = document.getElementById(id).value;
    let b = a[0].toUpperCase();
    for (i = 1; i < a.length; i++) {
        if (a[i - 1] == ' ' && a[i] == ' ') {
            continue;
        } else if (a[i - 1] == ' ' && a[i] != ' ') {
            b += a[i].toUpperCase();
        } else if (a[i - 1] != '' && a[i] != '') {
            b += a[i].toLowerCase();
        }
    }
    document.getElementById(id).value = b;
}
function checkall2(id) {
    let  a = document.getElementById(id).value;
    if (a < 0 || (Math.floor(a) - a ) != 0) {
        alert('sai định dạng');
        document.getElementById(id).value = '';
    }
}
function Discount() {
checkall('discount')
}
function CheckName() {
    checkall('name');
}
function CheckADD() {
    checkall('add');
}
function CheckID() {
    let a = document.getElementById('cmnd').value;
    for (i = 0; i < a.length; i++) {
        if (a[i] < 0 || Math.floor(a[i]) - a[i] != 0) {
            alert('sai định dạng');
            document.getElementById('cmnd').value = '';
        }
    }
}
function CheckRent() {
    checkall2('rent')
}
function CheckAmount() {
    checkall2('people')
}
function CheckEmail() {
    let a = document.getElementById('email').value;
    let b = a.indexOf("@");
    let c = a.lastIndexOf(".");
    if (b < 3 || c < (b + 3) || (c + 2) >= a.length) {
        alert('gmail phải có dạng abc@abc.abc');
        document.getElementById('email').value = '';
    }
}
function invisible() {

}
let a = true;
function CustomerData() {
    let b = document.getElementById('invisible');
    if (a) {
        b.style.display = 'block';
        a = false
    } else {
        b.style.display = 'none';
        a = true;
    }
}
