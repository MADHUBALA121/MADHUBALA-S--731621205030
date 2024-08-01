import { Component } from '@angular/core';
import { CalculatorService } from './calculator.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'] 
})
/*export class AppComponent {
  name: string;
  age: number;
  email: string;
  imagePath:string;
  fname:string;
   
  constructor() {
    this.name = "MADHU";
    this.age = 21;
    this.email ="smadhubalasmadhu@gmail.com";
    this.imagePath="https://th.bing.com/th/id/R.53449fa87702af80374c45b87080c639?rik=a%2bjmkDp49CIBMQ&riu=http%3a%2f%2fwww.pixelstalk.net%2fwp-content%2fuploads%2f2016%2f08%2fNature-wallpapers-Full-HD-backgroud.jpg&ehk=2CjYMG528OFuEMrzc%2bCNmTfQR9WPzT4GP5fwmHMh54I%3d&risl=&pid=ImgRaw&r=0";
    this.fname="";

  }
  changeName(){
    this.name="bala";
  }
  changeImage(){
    this.imagePath="https://th.bing.com/th/id/R.7dc562da134cbafe62f9069fde21656f?rik=NZYs2sSxhp%2bmWg&riu=http%3a%2f%2fwww.pixelstalk.net%2fwp-content%2fuploads%2f2016%2f04%2fBackgrounds-landscape-nature-wallpaper-HD.jpg&ehk=LWtVxxbhLcOgCzDBtQAQpYDCo5zJxI2ADaMtvosDqjk%3d&risl=&pid=ImgRaw&r=0";
  }
}*/
/*export class AppComponent {
  flag:boolean;
  vehicles:string[];
  selectedVehicle : string;
  myStyle:{};
  myClass:string;


  constructor(){
    this.flag=true;
    this.vehicles=["TwoWheeler","ThreeWheeler","FourWheeler"];
    this.selectedVehicle="";
    this.myStyle= {'width':'40%','border':'2px solid blue','border-radius':'15px'};
    this.myClass="MyClass1";
  }
  changeFlag(){
    this.flag=!this.flag;
  }
  setSelectedItem(vec:string){
    this.selectedVehicle=vec;
  }
  changeStyle(){
    this.myStyle={'width':'40%','border':'2px solid red','border-radius':'25px'};
}*/
export class AppComponent{
  sum:number;
  sub:number;
    constructor(private calc:CalculatorService) {
    this.sum=calc.getAddition(10,20);
    this.sub=calc.getSubtraction(10,20);
}
}