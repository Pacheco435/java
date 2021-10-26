import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  titulo = 'Aplicacion Calculadora';

  resultadoPadre: number = 0;

  procesarResultado(resultado: number): void{
    this.resultadoPadre = resultado;
  }

}
