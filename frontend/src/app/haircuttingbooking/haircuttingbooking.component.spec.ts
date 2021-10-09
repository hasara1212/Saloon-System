import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HaircuttingbookingComponent } from './haircuttingbooking.component';

describe('HaircuttingbookingComponent', () => {
  let component: HaircuttingbookingComponent;
  let fixture: ComponentFixture<HaircuttingbookingComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HaircuttingbookingComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(HaircuttingbookingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
