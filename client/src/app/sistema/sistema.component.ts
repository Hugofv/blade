import {Component, OnInit } from '@angular/core';
import { SistemaService } from '../services/sistema.service';
import { FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'sistema',
  templateUrl: './sistema.component.html',
  styleUrls: ['./sistema.component.css']
})


export class SistemaComponent implements OnInit {
  displayedColumns = ['descricao', 'sigla', 'email', 'url'];
  descricao = new FormControl('', [Validators.required]);
  sigla = new FormControl('', [Validators.required]);
  email = new FormControl('', [Validators.required, Validators.email]);
  dataSource: [];

  constructor(private sistemaService: SistemaService) {}

  getSistema() {
    this.dataSource = this.sistemaService.getSistema(
      {
        descricao: this.descricao.value,
        sigla: this.sigla.value,
        email: this.email.value
      }
    );
  }

  clearForm() {
    this.descricao.reset();
    this.sigla.reset();
    this.email.reset();
    this.dataSource = [];
  }

  ngOnInit() {
  }
}
