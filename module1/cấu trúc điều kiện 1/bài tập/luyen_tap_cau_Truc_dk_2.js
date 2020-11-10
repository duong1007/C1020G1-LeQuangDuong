function Convert() {
    let c = document.getElementById('doc').value;
    let f = (c * 9) / 5 + 32;
    document.getElementById('con').value= f
}
//bài 2
function Chance() {
    let m = document.getElementById('doc2').value;
    let fl = m * 3.2808;
    if (m < 0) {
        alert('nhập lại');
    } else {
        document.getElementById('con2').value= fl
    }
}
//Bài 3
let a = document.getElementById('doc3');
let b = document.getElementById('doc4');
function Chan() {
    let a1 = a.value * a.value;
    if (a.value < 0) {
        alert('không phải hình vuông');
    } else {
        document.getElementById('con3').innerText= 'diện tích hình vuông là ' + a1;
    }
}
//bài 4
function Chan2() {
    let b1 = b.value * a.value;
    if (a.value < 0 || b.value < 0) {
        alert('không phải hình chữ nhật');
    } else {
        document.getElementById('con4').innerText= 'diện tích hình chữ nhật là ' + b1;
    }
}
//bài 5
function Chan3() {
    let t1 = (b.value * a.value)/ 2;
    if (a.value < 0 || b.value < 0) {
        alert('không phải tam giác');
    } else {
        document.getElementById('con5').innerText= 'diện tích tam giác vuông là ' + t1;
    }
}
//bai 6 (a, b, c, là e, f, g)
let e = document.getElementById('doc6');
let f = document.getElementById('doc7');
let g = document.getElementById('doc8');
let i;
let k;
function calculate1() {
    if (e.value != 0) {
        i ='phương trình bậc 1 có nghiệm là x = ' + (-f.value)/e.value;
    } else {
        i = 'phương trình không tồn tại';
    }
    document.getElementById('con6').innerText = i;
}
//bài 7
function calculate2() {
    let delta = f.value * f.value - 4 * e.value * g.value;
    let n1 = (-f.value + delta)/(2*e.value);
    let n2 = (-f.value - delta)/(2*e.value);
    if (e.value != 0) {
        if (delta > 0 ) {
            k ='phương trình bậc 2 có 2 nghiệm là x1 = ' + n1 + ' và x2 = ' + n2 ;
        } else if (delta == 0) {
            k = 'phương trình bậc 2 có nghiệm kép là x1 = x2 = ' + n1;
        } else {
            k = 'phương trình vô nghiệm';
        }
    } else {
        k = 'phương trình bậc 1 có nghiệm x = ' + (-g.value)/f.value;
    }
    document.getElementById('con7').innerHTML= k;
}
//bài 9
function trig() {
    let triger;
    switch (false) {
        case (e.value > 0):
        case (f.value > 0):
        case (g.value > 0):
        case (e.value*1 + g.value*1 > f.value*1 ):
        case (e.value*1 + f.value*1 > g.value*1 ):
        case (f.value*1 + g.value*1 > e.value*1 ):
            triger= 'không phải tam giác';
            break;
        default:
            triger = 'chính xác';
    }
    document.getElementById('con9').innerHTML = triger;
}
// bài 8
function age() {
    let x = document.getElementById('doc9').value;
    let intx = x - Math.ceil(x);
    let check;
    if (intx == 0) {
        if (x > 0 && x < 120) {
            check = 'chính xác'
        } else if (x <= 0) {
            check = 'chưa sinh ra'
        } else {
            check = 'người âm'
        }
    } else {
        check = 'con gì chứ đ phải con người'
    }
    document.getElementById('con8').innerHTML= check;
}
//bài 10
function electric() {
    let z = document.getElementById('doc10').value;
    let check7;
    if (z <= 0) {
        check7 = 'công tơ điện hỏng';
    } else if (z > 0 && z < 11){
        check7 = (5000*z) + ' vnđ';
    } else if (z > 10 && z < 50) {
        check7 = (7000*z) + ' vnđ';
    } else {
        check7 = (10000*z) + ' vnđ';
    }
    document.getElementById('con10').innerHTML = check7;
}
//bài 11
function tax() {
    let tax = document.getElementById('doc11').value;
    let check2;
    if (tax <= 0) {
        check2 = 'thứ vô dụng';
    } else if (tax > 0 && tax < 5000001){
        check2 = (0.1*tax) + 'vnđ';
    } else if (tax > 5000000 && tax < 10000000) {
        check2 = (0.2*tax) + 'vnđ';
    } else {
        check2 = (0.3*tax) + 'vnđ';
    }
    document.getElementById('con11').innerHTML = check2;
}
//bài 12 tính lãi xuất đơn nha
function bank() {
    let money = document.getElementById('doc12').value;
    let month = document.getElementById('doc13').value;
    let interest;
    switch (false) {
        case (money > 0):
        case (month > 0):
            interest = 'thế bạn có vay tiền không?';
            break;
        default:
            interest = "tổng lãi suất là " + ( Math.pow(1.1,month)*money - money ) + 'vnđ';
    }
    document.getElementById('con12').innerHTML= interest  ;
}