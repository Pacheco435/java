import { Injectable } from "@angular/core";
import {HttpClient, HttpResponse} from '@angular/common/http';
import { Persona } from "./persona.model";

@Injectable()
export class DataService {

  constructor(private httpClient: HttpClient) {}

  urlBase = 'http://localhost:8080/1-personas-backend-java/webservice/personas';

  cargarPersonas(){
    return this.httpClient.get(this.urlBase);
  }

agregarPersona(persona: Persona){
  return this.httpClient.post(this.urlBase, persona)
}

 modificarPersona(idPersona: number, persona: Persona){
  let url: string;
  url = this.urlBase + '/' + idPersona;
  this.httpClient.put(url, persona)
    .subscribe(
      (response) => {
        console.log('resultado modificado persona:' + response);
      },
      (error) => console.log('Error en modificar persona:' + console.error)
      );
    }

    eliminarPersona(idPersona: number){
      let url : string;
      url = this.urlBase + '/' + idPersona;
      this.httpClient.delete(url)
      .subscribe(
        (response) => {
          console.log('resultado de eliminar  persona:' + response);
        },
        (error) => console.log('Error en eliminar persona:' + console.error)
        );
    }
  }


