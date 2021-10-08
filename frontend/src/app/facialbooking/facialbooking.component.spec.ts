import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FacialbookingComponent } from './facialbooking.component';

describe('FacialbookingComponent', () => {
  let component: FacialbookingComponent;
  let fixture: ComponentFixture<FacialbookingComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FacialbookingComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FacialbookingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
