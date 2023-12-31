package com.microservices.project.orderservice.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "order_line_items")
public class OrderLineItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_line_items_id")
    private Long id;

    @Column(name="item_name")
    private String itemName;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "quantity")
    private Integer quantity;

    /**
     * @ManyToOne: This annotation is used on the order field to specify a many-to-one relationship between the current entity and the Order entity.
     * It signifies that multiple instances of the current entity can be associated with a single Order entity.
     *
     * @JoinColumn(name = "order_id"): This annotation is used to specify the name of the foreign key column in the database that links the current entity to the Order entity.
     * In this case, it specifies that the foreign key column is named "order_id." This column should exist in the table of the current entity and reference the primary key of the Order entity, establishing the relationship.
     */
    @ManyToOne
    @JoinColumn(name = "order_id") // foreign key
    private Order order;  // Reference to the parent Order


    public OrderLineItems() {

    }

    public OrderLineItems(String itemName, BigDecimal price, Integer quantity, Order order) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.order = order;
    }

    public OrderLineItems(Long id, String itemName, BigDecimal price, Integer quantity, Order order) {
        this.id = id;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "OrderLineItems{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
