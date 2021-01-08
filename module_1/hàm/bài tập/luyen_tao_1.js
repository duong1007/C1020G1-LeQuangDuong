//bai 1
function alertMessage(string) {
    alert(string);
}
//bai 2
function plusOne(number) {
    document.getElementById('plus').value = number*1 + 1;
}
// bài 3
let a;
function Check(number1,number2) {
    if (number1 > number2) {
        alert(number2 + ' nhỏ hơn ' + number1);
    } else {
        alert(number1*1 + number2*1);
    }
}
// bài 4
let result;
function Test() {
    function addNumbers() {
        let firstNum = 4;
        let secondNum = 8;
        let result = firstNum + secondNum;
        return result;
    }
    result = 0;
    alert(result + ' trước');
    result = addNumbers();
    alert(result + ' sau')
}
//bài 5
let famous = ['Polaris', 'Aldebaran', 'Deneb', 'Vega', 'Altair', 'Dubhe','Regulus', 'Dương'];
let star = ['Ursa Minor', 'Tarurus', 'Cygnus', 'Lyra', 'Aquila', 'Ursa Major','Leo', 'Cancer'];
let input;
function convert(string) {
    let i = famous.indexOf(string);
    if (i != -1) {
        return star[i];
    } else {
        return 'không có người này'
    }
}
function Search() {
    input = prompt('nhập tên người nổi tiếng');
    let input2 = input[0].toUpperCase();
    for (let i = 1; i < input.length; i++ ) {

        input2 += input[i].toLowerCase();
    }
    alert(convert(input2));
}