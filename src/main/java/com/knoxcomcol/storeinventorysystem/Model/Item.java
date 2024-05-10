package com.knoxcomcol.storeinventorysystem.Model;


import jakarta.persistence.*;


@Entity
@Table(name="items",schema="hibernate-orm")
public class Item{
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long itemid;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "description")
    private String description;

    @Column(name = "quantity")
    private long quantity;

    @Column(name = "location")
    private String location;

    public Item(String itemName, String description, long quantity, String location) {
        this.itemName = itemName;
        this.description = description;
        this.quantity = quantity;
        this.location = location;
    }

    public Item(long itemid, String itemName, String description, long quantity, String location) {
        this.itemid = itemid;
        this.itemName = itemName;
        this.description = description;
        this.quantity = quantity;
        this.location = location;
    }

    public long getItemid() {
        return itemid;
    }

    public void setItemid(long itemid) {
        this.itemid = itemid;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
      
     public Item() {
       super();
    }

    
}
