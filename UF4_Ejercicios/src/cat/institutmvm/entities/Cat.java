/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.entities;

/**
 *
 * @author alumne_1r
 */
public class Cat {
    private String name, age, breed, food;

    public Cat(String name, String age, String breed, String food) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.food = food;
    }

    //<editor-fold defaultstate="collapsed" desc="getter">

    public String getName() {
        return name;
    }

    public String getAge() {
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

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setFood(String food) {
        this.food = food;
    }  
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="behaviours">
    
    public void meow(){
        System.out.println("Meooow!");
    }
    
    public void play(){
        System.out.println(this.name + " is playing.");
    }
    
    public void wash(){
        System.out.println(this.name + " is washing itself.");
    }
    
    public void eat(){
        System.out.println(this.name + " is eating " + this.food);
    }
    
    public void hunt(){
        System.out.println(this.name + " is hunting.");
    }
//</editor-fold>
    
    public String getFullCat(){
       StringBuffer sb = new StringBuffer();
       sb.append(this.getName());
       sb.append(" ");
       sb.append(this.getAge());
       sb.append(" ");
       sb.append(this.getBreed());
       sb.append(" ");
       sb.append(this.getFood());
       return sb.toString();
    }
    
    
}
