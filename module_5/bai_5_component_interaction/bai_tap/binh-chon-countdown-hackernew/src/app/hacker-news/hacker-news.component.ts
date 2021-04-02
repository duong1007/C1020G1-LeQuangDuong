import {Component, Input, OnChanges, OnInit, SimpleChanges} from '@angular/core';
import {Article} from '../model/Article';

@Component({
  selector: 'app-hacker-news',
  templateUrl: './hacker-news.component.html',
  styleUrls: ['./hacker-news.component.scss']
})
export class HackerNewsComponent implements OnInit, OnChanges {
  articles = [
    {
      title: 'The Evolution of Async JavaScript: From Callbacks, to Promises, to Async/Await',
      url: 'https://medium.freecodecamp.org/the-evolution-of-async-javascript-from-callbacks-to-promises-to-async-await-e73b047f2f40'
    },
    {
      title: 'Game of Life',
      url: 'https://thefullsnack.com/posts/game-of-life.html'
    },
    {
      title: 'Nguyên tắc thiết kế REST API',
      url: 'https://medium.com/eway/nguyên-tắc-thiết-kế-rest-api-23add16968d7'
    },
    {
      title: 'Why You Only Need to Test with 5 Users',
      url: 'https://www.nngroup.com/articles/why-you-only-need-to-test-with-5-users/'
    },
    {
      title: 'Let’s Build A Web Server. Part 1.',
      url: 'https://ruslanspivak.com/lsbaws-part1/'
    }
  ];
  @Input() article: Article;
  constructor() { }

  ngOnChanges(changes: SimpleChanges) {
    for (const property in changes) {
      if (property === 'article') {
        this.addNewArticle(this.article);
      }
    }
  }

  ngOnInit(): void {
  }

  addNewArticle(art) {
    if (art !== undefined) {
      this.articles.push({
        title: art.title,
        url: art.url
      });
    }
    console.log(art);
  }

}
