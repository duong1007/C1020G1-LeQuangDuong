
let i;
function CheckName() {
    let a = document.getElementById('name').value;
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
}
function CheckADD() {
    let a = document.getElementById('add').value;
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
    document.getElementById('add').value = b;
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
    let  a = document.getElementById('rent').value;
    if (a < 0 || (Math.floor(a) - a ) != 0) {
        alert('sai định dạng');
        document.getElementById('rent').value = '';
    }
}
function CheckAmount() {
    let  a = document.getElementById('people').value;
    if (a < 0 || (Math.floor(a) - a ) != 0) {
        alert('sai định dạng');
        document.getElementById('people').value = '';
    }
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