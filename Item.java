/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e;

/**
 *
 * @author janas
 */
public class Item {
    String id;
    String name;
    String type;
    int price;

    public Item(String id, String name, String type,int price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price=price;
    }
        public Item() {
        this.id = null;
        this.name = null;
        this.type = null;
        this.price=0;
    }
    @Override
    public String toString() {
        return "- " + "id:" + id + ", name:" + name + ", type:" + type + ", price:" + price +" LBP ";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
