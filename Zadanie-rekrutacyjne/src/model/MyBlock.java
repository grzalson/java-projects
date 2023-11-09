package model;

import repo.Block;

public class MyBlock implements Block {
    private String color;

    //w zależnośći od wymagań, material może być final
    private String material;

    public MyBlock(String color, String material){
        this.color = color;
        this.material = material;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getMaterial() {
        return this.material;
    }

    /*
     *Overriduję metodę toString aby łatwiej wypisać blok
     * */
    @Override
    public String toString() {
        return "Block = {color: " + color + ", material: " + material + "}";
    }
}
