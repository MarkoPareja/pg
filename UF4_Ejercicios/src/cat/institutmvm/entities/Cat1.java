/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.entities;

/**
 *
 * @author alumne_1r
 */
public class Cat1 extends Animal{ 

    public Cat1(boolean vertebrats, boolean mamifer, boolean carnivor, String name, int age, String breed, String food) {
        super(vertebrats, mamifer, carnivor, name, age, breed, food);
    }  
    
    @Override
    public int edad() {
        return this.getAge()*4;
    }
    
    //<editor-fold defaultstate="collapsed" desc="behaviours">
    
    public void meow(){
        System.out.println("Meooow!");
    }
    
    public void play(){
        System.out.println(this.getName() + " is playing.");
    }
    
    public void wash(){
        System.out.println(this.getName() + " is washing itself.");
    }
    
    public void eat(){
        System.out.println(this.getName() + " is eating " + this.getFood());
    }
    
    public void hunt(){
        System.out.println(this.getName() + " is hunting.");
    }
//</editor-fold>
    
    public String getFullAnimal(){
       StringBuffer sb = new StringBuffer();
       sb.append(this.isVertebrats());
       sb.append(" ");
       sb.append(this.isMamifer());
       sb.append(" ");
       sb.append(this.isCarnivor());
       sb.append(" ");
       sb.append(this.getName());
       sb.append(" ");
       sb.append(this.edad());
       sb.append(" ");
       sb.append(this.getBreed());
       sb.append(" ");
       sb.append(this.getFood());
       return sb.toString();
    }

    
}
