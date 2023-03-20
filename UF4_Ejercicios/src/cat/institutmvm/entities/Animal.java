/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.entities;

/**
 *
 * @author alumne_1r
 */
public abstract class Animal {
    private boolean vertebrats, mamifer, carnivor; 
    private String name, breed, food;
    private int age;

    public Animal(boolean vertebrats, boolean mamifer, boolean carnivor, String name, int age, String breed, String food) {
        this.vertebrats = vertebrats;
        this.mamifer = mamifer;
        this.carnivor = carnivor;
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.food = food;
    }
    
    public abstract int edad();
    
    
    //<editor-fold defaultstate="collapsed" desc="getter">
    public boolean isVertebrats() {
        return vertebrats;
    }

    public boolean isMamifer() {
        return mamifer;
    }

    public boolean isCarnivor() {
        return carnivor;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getFood() {
        return food;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="setter">
    public void setVertebrats(boolean vertebrats) {
        this.vertebrats = vertebrats;
    }

    public void setMamifer(boolean mamifer) {
        this.mamifer = mamifer;
    }

    public void setCarnivor(boolean carnivor) {
        this.carnivor = carnivor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setFood(String food) {
        this.food = food;
    }
//</editor-fold>

    
    
    
    
}
