import { Component, OnInit } from '@angular/core';
import { ListClientService } from './list-client.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  title = 'Client-List'
  client: Array<any>
  constructor(
    private list: ListClientService
    ){}

    displayList(){
      this.list.getList().subscribe((res: any) => {
        this.client = res
        console.log(this.client)
      })
    }

    ngOnInit() {
      this.displayList()
    }
}
