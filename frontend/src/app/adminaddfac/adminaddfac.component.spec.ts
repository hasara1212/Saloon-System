import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminaddfacComponent } from './adminaddfac.component';

describe('AdminaddfacComponent', () => {
  let component: AdminaddfacComponent;
  let fixture: ComponentFixture<AdminaddfacComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminaddfacComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminaddfacComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
