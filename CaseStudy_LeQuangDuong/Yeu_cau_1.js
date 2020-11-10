let a = document.getElementById('dis');

function discount() {
    document.getElementById('disc').innerHTML = "Discount " + a.value + '%';
}

function sun() {
    let form = document.forms['start'];
    let a = parseInt(form.room.value);
    let b = parseInt(form.rent.value);
    let c = parseInt(form.cus.value);
    let money = a*b*(1-c/100);
    document.write("Họ và tên: " + form.firstname.value + " " + form.lastname.value);
    document.write('<br>');
    document.write("Số CMND: " + form.cmnd.value );
    document.write('<br>');
    document.write("Ngày Sinh: " + form.dateofbirth.value );
    document.write('<br>');
    document.write("Email: " + form.Email.value );
    document.write('<br>');
    document.write("Address: " + form.address.value );
    document.write('<br>');
    document.write("Số người ở: " + form.yourfamili.value );
    document.write('<br>');
    document.write("Số ngày thuê: " + b );
    document.write('<br>');
    document.write("Loại phòng: " + a + '$/day' );
    document.write('<br>');
    document.write("Giảm giá: " + c + '%');
    document.write('<br>');
    document.write("Đẳng cấp: " + form.class.value );
    document.write('<br>');
    document.write('<b> Số tiền phải trả là: </b>' + money + '$');
}