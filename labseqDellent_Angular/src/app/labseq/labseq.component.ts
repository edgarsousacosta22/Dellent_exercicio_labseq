import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-labseq',
  templateUrl: './labseq.component.html',
  styleUrls: ['./labseq.component.css']
})
export class LabSeqComponent {
  inputValue!: number;
  result!: number;

  constructor(private http: HttpClient) {}

  calculateSequence() {
    if (this.inputValue >= 0) {
      this.http.get<number>(`http://localhost:8080/labseq/${this.inputValue}`)
        .subscribe(data => {
          this.result = data;
        });
    }else{
      this.result = 0;
    }
  }
}
