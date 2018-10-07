import { Component, OnInit } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { SistemaService } from '../../services/sistema.service';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {
  descricao = new FormControl('', [Validators.required]);
  sigla = new FormControl('', [Validators.required]);
  email = new FormControl('', [Validators.required, Validators.email]);
  url = new FormControl('', [Validators.required]);

  constructor(private sistemaService: SistemaService) { }

  ngOnInit() {  }

  onSave() {
    this.sistemaService.createSistema({
      descricao: this.descricao.value,
      sigla: this.sigla.value,
      email: this.email.value,
      url: this.url.value
    })
  }

  clearForm() {
    this.descricao.reset();
    this.sigla.reset();
    this.email.reset();
    this.url.reset();
  }
}
