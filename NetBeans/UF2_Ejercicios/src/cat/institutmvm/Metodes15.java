/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class Metodes15 {
    private static final String MSG_1 = "Es pot rentar a maquina ? (si = true / no = false)";
    private static final String MSG_2 = "Es roba delicada y vols fer un rentat rapid ? (si = true / no = false)";
    private static final String MSG_4 = "Es llana ? (si = true / no = false)";
    private static final String MSG_5 = "Es roba blanca ? (si = true / no = false)";
    
    public static void main(String[] args){
        boolean resposta;
        int revolucions = 0, tempsRentat = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println(MSG_1);
        resposta = sc.nextBoolean();
        
        if(resposta == true){
            System.out.println(MSG_2);
            resposta = sc.nextBoolean();
            if(resposta == true){
                System.out.println(MSG_4);
                resposta = sc.nextBoolean();
                if(resposta == true){
                    revolucions = 400;
                }
                else{
                    revolucions = 600;
                }
            }
            else{
                System.out.println(MSG_5);
                resposta = sc.nextBoolean();
                if(resposta == true){
                    revolucions = 1200;
                }
                else{
                    revolucions = 1000;
                }
            }
            if(revolucions < 600){
                tempsRentat = 45;
            }
            else{
                if(revolucions < 1000){
                    tempsRentat = 60;
                }
                else{
                    tempsRentat = 90;
                }
            }
            System.out.println("Tens que posar " + revolucions + " revolucions y " + tempsRentat + " minuts");
        }
        else{
            System.out.println("Mira les indicacions de l'etiqueta.");
        }
    }
}
