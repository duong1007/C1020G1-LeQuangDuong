function edit() {
    document.getElementById('sun').style.display = 'block';
}
function close1() {
    document.getElementById('sun').style.display= 'none';
}
let a = document.getElementById('name');
let b = document.getElementById('cmnd');
let c = document.getElementById('birth');
let d = document.getElementById('email');
let e = document.getElementById('add');
let f = document.getElementById('card');
let g = document.getElementById('people');
let h = document.getElementById('rent');
let i = document.getElementById('room');
let k = document.getElementById('level');
let i2 = document.getElementById('room1');
let k2 = document.getElementById('level1');
let f2 = document.getElementById('card1');
let h2 = document.getElementById('rent1');
function pay() {
    if (i2.value == 'Villa') {
        i1 = 500;
    } else if (i2.value == 'House') {
        i1 = 300;
    } else {
        i1 = 100;
    }
    if (k2.value == 'Đà nẵng') {
        k1 = 20;
    } else if (k2.value == 'Huế') {
        k1 = 10;
    } else if (k2.value == 'Quảng Nam'){
        k1 = 5;
    } else {
        k1 = 0;
    }
    if (h2.value > 7) {
        h1 = 20;
    } else if (h2.value < 7 && h2.value >= 5) {
        h1 = 10;
    } else if (h2.value < 5 && h2.value >=2){
        h1 = 5;
    } else {
        h1 = 0;
    }
    if (f2.value == 'Diamond') {
        f1 = 15;
    } else if (f2.value == 'Platinum') {
        f1 = 10;
    } else if (f2.value == 'Gold') {
        f1 = 5;
    } else if (f2.value == 'Silver') {
        f1 = 2;
    } else {
        f1 = 0;
    }
    let pay1 = i1*h2.value - (f1*1 + k1*1 + i1*1);
    document.getElementById('pay1').innerHTML = 'Số tiền phải trả là : ' + pay1 + ' $';
}
function update1() {
    document.getElementById('name1').value= a.value;
}
function update2() {
    document.getElementById('cmnd1').innerHTML= b.value;
}
function update3() {
    document.getElementById('birth1').value= c.value;
}
function update4() {
    document.getElementById('email1').value= d.value;
}
function update5() {
    document.getElementById('add1').value= e.value;
}
function update6() {
    document.getElementById('card1').value= f.value;
}
function update7() {
    document.getElementById('people1').value= g.value;
}
function update8() {
    document.getElementById('rent1').value= h.value ;
}
function update9() {
    document.getElementById('room1').value= i.value;
}
function update10() {
    document.getElementById('level1').value= k.value;
}
