import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-formulario',
  templateUrl: './formulario.component.html',
  styleUrls: ['./formulario.component.css']
})
export class FormularioComponent{

  operandoA: number = 0;
  operandoB: number = 0;

  @Output() resultadoSuma = new EventEmitter<number>() ;

  sumar(): void{
    const resultado = this.operandoA + this.operandoB;
    this.resultadoSuma.emit(resultado);
}
}
