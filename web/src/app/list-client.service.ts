import { Injectable } from '@angular/core';
import { HttpClientModule, HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ListClientService {

  constructor(
    private http: HttpClient
  ) { }

  url = `/client`;
  getList(){
    return this.http.get(this.url)
  }
}
