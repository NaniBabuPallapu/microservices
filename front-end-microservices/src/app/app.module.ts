import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { OrderServiceComponent } from './order-service/order-service.component';
import { InventoryServiceComponent } from './inventory-service/inventory-service.component';
import { ProductServiceComponent } from './product-service/product-service.component';

@NgModule({
  declarations: [
    AppComponent,
    OrderServiceComponent,
    InventoryServiceComponent,
    ProductServiceComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
