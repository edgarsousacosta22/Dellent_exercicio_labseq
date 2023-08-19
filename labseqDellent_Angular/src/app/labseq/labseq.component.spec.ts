import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LabseqComponent } from './labseq.component';

describe('LabseqComponent', () => {
  let component: LabseqComponent;
  let fixture: ComponentFixture<LabseqComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [LabseqComponent]
    });
    fixture = TestBed.createComponent(LabseqComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
