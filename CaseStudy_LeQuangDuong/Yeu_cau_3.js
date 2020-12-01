
let i;
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