/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.utils;

public class Person {
    private String name, surname;

    public String getName() {
       return name;
    }

    public void setName(String name) {
       this.name = name;
    }

    public String getSurname() {
       return surname;
    }

    public void setSurname(String surname) {
       this.surname = surname;
    }

    public String getFullName(){
       StringBuffer sb = new StringBuffer();
       sb.append(this.getName());
       sb.append(" ");
       sb.append(this.getSurname());
       return sb.toString();
    }
}
