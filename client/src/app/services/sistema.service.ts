import { Injectable } from '@angular/core';
import { HttpClient } from'@angular/common/http';
import { Sistema } from '../models/sistema.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SistemaService {

  private serviceUrl = 'http://localhost:8080/blade';

  constructor(private http: HttpClient) { }

  getSistema(sistema: Sistema): Observable<Sistema[]> {
    var url = this.serviceUrl + `/filtro?descricao=${sistema.descricao}&sigla=${sistema.sigla}&email=${sistema.email}&url=${sistema.url}`
    return this.http.get<Sistema[]>(url);
  }

  createSistema(sistema: Sistema): Observable<Sistema> {
    var url = this.serviceUrl + '/sistema';
    let headers = new Headers();
    headers.append('Content-Type','application/json');

    return this.http.post(url , sistema, {headers: headers})
          .subscribe((val) => {
            console.log("POST call successful value returned in body", val);
          },
          response => {
            console.log("POST call in error", response);
        },
        () => {
          console.log("The POST observable is now completed.");
      })
  }
}
