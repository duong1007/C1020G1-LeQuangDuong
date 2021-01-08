let a = document.getElementById("display1");
let b = document.getElementById("display2");
let result = 0;
function cal(calculator) {
    if (calculator === "+") {
        result = parseInt(a.value) + parseInt(b.value);
    } else if(calculator ==="-") {
        result = a.value - b.value;
    }
    else if(calculator ==="*") {
        result = a.value * b.value;
    }
    else if(calculator ==="/") {
        if (b.value === "0") {
            result = "bạn chơi đồ rồi bạn ơi";
        } else {
            result = a.value / b.value;
        }
    }
    document.getElementById('result').innerHTML = 'result = ' + result;
}