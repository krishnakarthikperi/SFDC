import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-databinding',
  templateUrl: './databinding.component.html',
  styleUrls: ['./databinding.component.css']
})
export class DatabindingComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  //OneWay Data binding -- String Interpolation
  serverId:number=10;
  serverStatus:string='online'
  getServerStatus()
  {
    return this.serverStatus
  }
  server={
    id:20,
    status:'online'
  }
  servers=[11,12,13,14,15]
  serverUlr=window.location.href;
  //One way Data Binding - Propoerty binding & Event Binding
  disableBox=false
  enableBox()
  {
    this.disableBox=false
  }
  //Combine data binding
  serverCreationStatus='No server was created'
  serverName:string='Test Server';
  onCreateServer()
  {
    this.serverCreationStatus='server was created name is:'+this.serverName
  }
  onUpdateServerName(event:Event)
  {
    this.serverName=(<HTMLInputElement>event.target).value;
  }
}
