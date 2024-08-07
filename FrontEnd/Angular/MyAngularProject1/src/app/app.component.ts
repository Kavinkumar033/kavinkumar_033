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
  example : string;
  imagepath:string;
  fname : string;
  sname : string ;
  flag: boolean;
  anime:string[];
  selecteditem:string;
  mystyle:{};
  myclass:string;

  constructor()
  {
    this.name="kavin";
    this.age=33
    this.email="kavinkumar1204.s@gmail.com";
    this.example="Angular Binding Data"
    this.imagepath="https://m.media-amazon.com/images/M/MV5BMDkwZmEyYzktMTI1NS00NDBjLThhZTctMGRjMmIyYjFhNWYyXkEyXkFqcGdeQXVyNzgxMzc3OTc@._V1_.jpg"
    this.fname="";
    this.sname="";
    this.flag=true;
    this.anime=["Luffy","Zoro","Sanji"];
    this.selecteditem="";
    this.mystyle={'background-color' : "gray" , 'border' : '2px solid black','width':'500px'};
    this.myclass="Myclass2";
  }
  changestyle()
  {
    this.mystyle={'background-color' : 'cyan' , 'border' : '2px solid black','width':'500px'}

  }
  selected(show : string)
  {
    this.selecteditem=show;
  }
  change()
  {
    this.flag= ! this.flag;
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
  changeexample()
  {
    this.example="One Way Data Binding"
  }
  changeimage()
  {
    this.imagepath="https://images5.alphacoders.com/131/1317711.jpeg"
  }
}
