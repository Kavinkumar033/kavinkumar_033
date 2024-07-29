import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  name : string;
  age : number;
  email : string;
  imagepath:string;

  constructor()
  {
    this.name="kavin";
    this.age=33
    this.email="kavinkumar1204.s@gmail.com";
    this.imagepath="https://m.media-amazon.com/images/M/MV5BMDkwZmEyYzktMTI1NS00NDBjLThhZTctMGRjMmIyYjFhNWYyXkEyXkFqcGdeQXVyNzgxMzc3OTc@._V1_.jpg"
  }
  changename()
  {
    this.name="Teddy"
  }
  changeage()
  {
    this.age=22
  }
  changeemail()
  {
    this.email="Teddy@gmail.com"
  }
  changeimage()
  {
    this.imagepath="https://images5.alphacoders.com/131/1317711.jpeg"
  }
}
