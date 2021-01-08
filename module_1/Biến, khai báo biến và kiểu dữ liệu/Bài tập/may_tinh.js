let a = document.getElementById('display1');
let b = document.getElementById('display2');
function addition() {
    document.getElementById('result').innerHTML = parseInt(a.value) + parseInt(b.value);
}
function suptraction() {
    document.getElementById('result').innerHTML = a.value - b.value;
}
function mutiphlication() {
    document.getElementById('result').innerHTML = a.value * b.value;
}
function division() {
    if (b.value == 0) {
        alert('Bạn đang chơi đồ rồi bạn ơi');
    } else {
        document.getElementById('result').innerHTML = a.value / b.value;
    }
}