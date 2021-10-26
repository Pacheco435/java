import { Component } from '@angular/core';
@Component({
  selector: 'app-personas',
  templateUrl: './personas.component.html',
  // tslint:disable-next-line: whitespace
  styleUrls:['./personas.component.css']
})
export class PersonasComponent{
  deshabilitar = false;
  mensaje = '';
  titulo = 'Licenciado';
  // tslint:disable-next-line: typedef
  mostrar = false;

  // tslint:disable-next-line: typedef
  agregarPersona(){
    this.mostrar = true;
    this.mensaje = 'Persona agregada';
  }


}
