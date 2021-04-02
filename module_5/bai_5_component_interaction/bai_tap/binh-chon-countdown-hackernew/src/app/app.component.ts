import { Component } from '@angular/core';
import {Article} from './model/Article';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'binh-chon-countdown-hackernew';
  countdownMsg = '';
  countdownAliasMsg = '';
  article: Article;
  finishCountdown() {
    this.countdownMsg = 'Finished!';
  }

  endCountdown() {
    this.countdownAliasMsg = 'Ended!';
  }

  onRateChange(value) {
    console.log(value);
  }

  addArticle($event: Article) {
    this.article = $event;
  }
}
