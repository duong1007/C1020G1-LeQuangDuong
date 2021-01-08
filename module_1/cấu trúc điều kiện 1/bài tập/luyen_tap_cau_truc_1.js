function kt() {
    let a = document.getElementById('numberA').value;
    let b = document.getElementById('numberB').value;
    let check1;
    if (b == 0){
        check1 = 'không thể chia cho 0'
    } else if (a % b !=0) {
        check1 = 'a không chia hêt cho b';
    } else {
        check1 = 'a chia hết cho b';
    }
    document.getElementById('conf').innerText = check1;
}
// bài 2
function kq() {
    let t = document.getElementById('age').value;
    let check2;
    if (t < 15) {
        check2='bạn chưa đủ tuổi chơi đồ';
    } else {
        check2='ok';
    }
    document.getElementById('confi').innerHTML= check2;
}
//bài 3
function kl() {
    let d = document.getElementById('int').value;
    let check3;
    if (d == 0) {
        check3='số 0 mà đmm';
    } else if (d < 0) {
        check3='số này nhỏ hơn 0';
    } else {
        check3='số này lớn hơn 0';
    }
    document.getElementById('confir').innerHTML= check3;
}
//bài 4
function kb() {
    let e = document.getElementById('int1').value;
    let f = document.getElementById('int2').value;
    let g = document.getElementById('int3').value;
    let check4;
    if (e >= f && e >= g) {
        check4 = e + ' max';
    } else if (f >= g ) {
        check4 = f + ' max';
    } else {
        check4 = g + ' max';
    }
    document.getElementById('confirm').innerHTML= check4;
}
//bài 5
function km() {
    let h = document.getElementById('point1').value;
    let i = document.getElementById('point2').value;
    let k = document.getElementById('point3').value;
    let check5;
    switch (true) {
        case (h < 0):
        case (i < 0):
        case (k < 0):
        case (h > 10):
        case (i > 10):
        case (k > 10):
            check5 = 'nhập thang điểm 10';
            break;
        default:
            let tb = (h * 1 + 2 * i + 4 * k) / 7;
            if (tb >= 8.5) {
                check5 = 'thằng này giỏi';
            } else if (tb >= 6.5) {
                check5 = 'thằng này khá giỏi';
            } else if (tb >= 5) {
                check5 = 'thằng này khá';
            } else {
                check5 = 'học lại';
            }
    }
    document.getElementById('ans').innerHTML = check5
}
//bài 6
function ka() {
    let l = document.getElementById('pay').value;
    let check6;
    if (l <= 0) {
        check6 = 'Sập Tiệm';
    } else if ( l < 101){
        check6 = (100000*l*0.07) + 'vnđ';
    } else if (l > 100 && l < 501) {
        check6 = (100000*l*0.1) + 'vnđ';
    } else {
        check6 = 'Đ*o có chuyện đấy đâu';
    }
    document.getElementById('answ').innerHTML = check6;
}
//bài 7
function kc() {
    let n = document.getElementById('payphone').value;
    let m = Math.ceil(n);
    let check7;
    if (m <= 0) {
        check7 = 'vứt m* điện thoại đi';
    } else if (m > 0 && m < 101){
        check7 = (500*n) + 'vnđ';
    } else if (m > 100 && m < 501) {
        check7 = (1000*n) + 'vnđ';
    } else {
        check7 = 'Buôn ít thôi';
    }
    document.getElementById('answer').innerHTML = check7;
}