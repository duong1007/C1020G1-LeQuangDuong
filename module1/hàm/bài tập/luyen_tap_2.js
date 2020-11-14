// bài 1
function pow(a) {
    alert(a*a);
}
//bài 2
function perimeter(r) {
    if (r > 0) {
        alert(2*r*3.14);
    } else {
        alert('không phải hình tròn')
    }
}
function acreage(r) {
    if (r > 0) {
        alert(r*r*3.14);
    } else {
        alert('không phải hình tròn')
    }
}
//bài 3
function factorial(b) {
    let a = 1;
    if (b > 0 ) {
        for (i = 1; i <= b; i++) {
            a *= i;
        }
    } else {
        a = 'không phải số dương';
    }
    alert(a);
}
// bài 4
function Test(c) {
    let u = '1234567890';
    if (u.includes(c)) {
        alert(true);
    } else {
        alert(false);
    }
}
//bài 5
function Min(a,b,c) {
    let answer;
    if (checkinterger(a) != 'wrong' && checkinterger(b) != 'wrong' && checkinterger(c) != 'wrong') {
        if (a < b && a < c) {
            answer = a;
        } else if(b < c) {
            answer = b;
        } else {
            answer = c;
        }
    } else {
        answer = 'có số không phải số nguyên';
    }

    alert(answer)
}
function checkinterger(d) {
    if (Math.floor(d) - d == 0){
        return d
    } else {
        return 'wrong'
    }
}
// bài 6\
function Check1(a) {
    if (checkinterger(a)*1 > 0) {
        alert(true)
    } else {
        alert(false);
    }
}
// bài 7
function Chance(a,b) {
    document.getElementById('one').value = b;
    document.getElementById('two').value = a;
}
// bài 8
function Run() {
    let b = prompt('nhập số phần tử của mảng');
    let arraya = [];
    for (i = 0; i < b; i++) {
        let c = prompt('nhập phần tử ' + (i + 1));
        arraya.push(c)
    }
    alert(reversebyDuong(arraya));
}
function reversebyDuong(array) {
    let arrayb = [];
    for (i = array.length - 1; i >= 0; i--) {
        arrayb.push(array[i])
    }
    return arrayb;
}
// bài 9
let i;
function launch() {
    let b = prompt('nhập số phần tử của mảng');
    let arraya = [];
    for (i = 0; i < b; i++) {
        let c = prompt('nhập phần tử ' + (i + 1));
        arraya.push(c)
    }
    let d = prompt('nhập 1 ký tự ');
    alert(indexofByDuong(arraya,d));
}
function indexofByDuong(array,a) {
    for (i = 0; i < array.length; i++) {
        if (a == array[i]) {
            return i;
            break
        } else {
            return -1;
        }
    }
}