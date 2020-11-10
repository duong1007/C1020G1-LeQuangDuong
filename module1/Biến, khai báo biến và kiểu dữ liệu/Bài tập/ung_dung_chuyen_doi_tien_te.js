let money = document.getElementById("money");
let a = document.getElementById('sun');
let b = document.getElementById('sun2');
let c;
function convert() {
    if (a.value == 'VietNam' && b.value == 'USD') {
        c = money.value / 21000;
    } else if (a.value == 'USD' && b.value == 'VietNam') {
        c = money.value * 21000;
    } else {
        c = money.value;
    }
    document.getElementById('result').innerHTML='result = ' + c;
}