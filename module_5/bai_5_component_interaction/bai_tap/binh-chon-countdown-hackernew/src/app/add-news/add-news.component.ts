import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {Article} from '../model/Article';

@Component({
  selector: 'app-add-news',
  templateUrl: './add-news.component.html',
  styleUrls: ['./add-news.component.scss']
})
export class AddNewsComponent implements OnInit {

  @Output() addNewArticle = new EventEmitter<Article>();

  article: Article = {
    title: '', url: ''
  };

  constructor() { }

  ngOnInit(): void {
  }

  addArticle(newTitle, newURL) {
    this.article.title = newTitle.value;
    this.article.url = newURL.value;
    this.addNewArticle.emit(this.article);
  }
}
