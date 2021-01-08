class Mobile {
    constructor(battery,display,take) {
        this.battery = battery;
        this.display = display;
        this.inbox = [];
        this.outbox = [];
        this.missing = [];
        this.take = take;
    }
    reduction() {
        this.battery--;
        return this.battery;
    }
    charge() {
        this.battery += 20;
        return this.battery;
    }
    checkOnOff() {
        let a = document.getElementById(this.display);
        if (a.disabled) {
            alert('this mobile đang tắt');
        } else {
            alert('this mobile đang bật');
        }
        this.reduction()
    }
    OnOff() {
        let a = document.getElementById(this.display);
        if (a.disabled == false) {
            a.disabled = true;
        } else {
            a.disabled = false;
        }
        return a
    }
    Inbox() {
        if (this.inbox.length > 0) {
            document.getElementById(this.take).value = 'Take('+ this.inbox.length +')';
        }
        this.reduction()
    }
    Outbox(name) {
        let a = document.getElementById(this.display);
        name.inbox.push(a.value);
        this.outbox.push(a.value);
        a.value = '';
        this.reduction()
    }
    savemess() {
        let a = document.getElementById(this.display);
        this.missing.push(a.value);
        a.value = '';
        this.reduction()
    }
    displayinbox(){
        document.getElementById(this.display).value = this.inbox.join(' ');
        this.reduction()
    }
    displayoutbox(){
        document.getElementById(this.display).value = this.outbox.join(' ');
        this.reduction()
    }
    displaymissing(){
        document.getElementById(this.display).value = this.missing.join(' ');
        this.reduction()
    }
    setbattery() {
        this.battery = 100;
        return this.battery
    }
}
let Nokia = new Mobile (100,'display1','Take1');
function check1() {
    Nokia.checkOnOff();
}
function On1() {
    Nokia.OnOff();
}
function charging1() {
    if (Nokia.battery < 100) {
        Nokia.charge();
    } else if (Nokia.battery = 100) {
        alert('Pin đầy');
    } else {
        Nokia.setbattery();
        alert('Pin đầy');
    }
}
function take1() {
    Nokia.Inbox();
}
function send1() {
    Nokia.Outbox(Iphone);
}
function save1() {
    Nokia.savemess();
}
function sent1() {
    Nokia.displayoutbox();
}
function received1() {
    Nokia.displayinbox()
}
function entering1() {
    Nokia.displaymissing();
}
let Iphone = new Mobile (100,'display2','Take2');
function check2() {
    Iphone.checkOnOff();
}
function On2() {
    Iphone.OnOff();

}
function charging2() {
    if (Iphone.battery < 100) {
        Iphone.charge();
    } else if (Nokia.battery = 100) {
        alert('Pin đầy');
    } else {
        Iphone.setbattery();
        alert('Pin đầy');
    }
}
function take2() {
    Iphone.Inbox();
}
function send2() {
    Iphone.Outbox(Nokia);
}
function save2() {
    Iphone.savemess();
}
function sent2() {
    Iphone.displayoutbox();
}
function received2() {
    Iphone.displayinbox()
}
function entering2() {
    Iphone.displaymissing();
}