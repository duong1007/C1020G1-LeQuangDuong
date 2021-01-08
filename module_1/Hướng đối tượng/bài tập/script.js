/**
 * Created by nhatnk on 4/26/17.
 */

class Hero {
  constructor(image, top, left, size, speed) {
    this.image = image;
    this.top = top;
    this.left = left;
    this.size = size;
    this.speed = speed;
  }

  getHeroElement (){
    return '<img width="'+ this.size + '"' +
      ' height="'+ this.size + '"' +
      ' src="' + this.image +'"' +
      ' style="top: '+this.top+'px; left:'+this.left+'px;position:absolute;" />';
  }

  moveRight(){
    this.left += this.speed;
    console.log('ok: ' + this.left);
  }
  moveLeft(){
    this.left -= this.speed;
    console.log('ok: ' + this.left);
  }
  moveDown(){
    this.top += this.speed;
    console.log('ok: ' + this.left);
  }
  moveup(){
    this.top -= this.speed;
    console.log('ok: ' + this.left);
  }
}

 let hero = new Hero('e01e378f00cce992b0dd.jpg', 20, 30, 300,100);
let  a = window.innerWidth - hero.size;
let b = window.innerHeight - hero.size;
function start(){
  if(hero.left < a && hero.top <= 20 ){
    hero.moveRight();
  } else if(hero.left >= a && hero.top < b) {
    hero.moveDown();
  } else if (hero.top >= b && hero.left >= 30) {
    hero.moveLeft();
  } else if ( hero.left <= 30) {
    hero.moveup();
  }
  document.getElementById('game').innerHTML = hero.getHeroElement();
  setTimeout(start, 500)
}
start();