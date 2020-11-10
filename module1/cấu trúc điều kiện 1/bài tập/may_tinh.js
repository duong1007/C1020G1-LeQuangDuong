function one() {
    document.getElementById('display').value +=1
}
function two() {
    document.getElementById('display').value+=2;
}
function three() {
    document.getElementById('display').value+=3;
}
function four() {
    document.getElementById('display').value+=4;
}
function five() {
    document.getElementById('display').value+=5;
}
function six() {
    document.getElementById('display').value+=6;
}
function seven() {
    document.getElementById('display').value+=7;
}
function eight() {
    document.getElementById('display').value+=8;
}
function nice() {
    document.getElementById('display').value+=9;
}
function zero() {
    document.getElementById('display').value+=0;
}
function div() {
    document.getElementById('display').value+='/';
}
function mul() {
    document.getElementById('display').value+='*';
}
function tru() {
    document.getElementById('display').value+='-';
}
function cong() {
    document.getElementById('display').value+='+';
}
function cance() {
    document.getElementById('display').value='';
}
function equal() {
    let b = eval(calculator.display.value);
    document.getElementById('display').value= b;
}


