/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.app;

import java.util.Scanner;

import cat.institutmvm.metodos.metodos;

/*
Nom: Marko 
Cognoms: Pareja Bailén
INS Manuel Vázquez Montalbán
Data d’edició: 15/feb/2023
Nom del cicle formatiu: DAW
Nom del mòdul: PG
 */
public class main {

    private static final String MSG_1 = "ID Usuario: ";
    private static final String MSG_2 = "\nEdad: ";
    private static final String MSG_3 = "\nTipus de venda: \n" + "0-Venda lliure\n1-Pensionista\n2-Carnet Jove\n3-Soci\n\nVenda: ";
    private static final String MSG_4 = "\nImport de la compra: ";
    private static final String MSG_5 = "\nTelèfon de contacte: ";
    private static final String MSG_6 = "ID\tEdad\tTipus\tImport\tTelefon\tNum. Sorteig";
    private static final String MSG_7 = "A continuació et demanarem les teves dades i les ompliras per teclat";
    private static final String MSG_8 = "Pensio";
    private static final String MSG_9 = "Error";
    private static final String MSG_10 = "Lliure";
    private static final String MSG_11 = "Pensionista";
    private static final String MSG_12 = "Jove";
    private static final String MSG_13 = "Soci";
    private static final String MSG_14 = "Cuants clients vols introduir: ";
    private static final String MSG_15 = "S'han introduit ";
    private static final String MSG_16 = " registres de clients";
    private static final String MSG_17 = "Vols consultar per tipus de client?(si: 1/ no:0)\n";
    private static final String MSG_18 = "\nQuin tipus de client? : ";
    private static final String MSG_19 = "\nDades de clients de tipus ";
    private static final String MSG_20 = "Seguent registre: ";
    private static final String MSG_21 = "\nErrors complerts" + "\nVols introdïr un nou registre? (si: 1/ no:0)\n";
    private static final String MSG_22 = "\nVols veure un resum estadístic de les dades? (si: 1/ no:0)\n";
    private static final String MSG_23 = "Mitjana d’edat: ";
    private static final String MSG_25 = "Número de clients per tipus: ";
    private static final String MSG_26 = "Import total: ";
    private static final String MSG_27 = "Histograma de número de clients per tipus: ";
    private static final String MSG_28 = "No hi han registres per mostrar.";
    private static final String MSG_29 = "Número de clients introduits: ";
    private static final String MSG_30 = "A continuació mostrem les dades:";
    private static final String MSG_31 = "\nVols fer el sorteig? (si: 1/ no:0)\n";
    private static final String MSG_32 = "El numero guanyador es el ";
    private static final String MSG_33 = "Usuari guanyador es el numero ";
    private static final String MSG_34 = "No hi ha guanyador";
    private static final int TLF = 9;
    private static final int MAXID = 999;
    private static final int MINID = 111;
    private static final int MAXSEG = 1;
    private static final int MINSEG = 0;
    private static final int MAXEDAD = 100;
    private static final int MINEDAD = 14;
    private static final int MAXIMP = 1000;
    private static final int MINIMP = 1;
    private static final int MAXTLF = 999999999;
    private static final int MINTLF = 111111111;
    private static final int MAXCCLI = 1;
    private static final int MINCCLI = 0;
    private static final int MAXSOR = 5000;
    private static final int MAXSO = 1;
    private static final int MINSO = 0;
    private static final int MAXINTENTOS = 3;
    private static final int DEFAULT = 3;
    private static final int SEGUIR = 1;
    private static final int PARAR = 0;

    public static void main(String[] args) {
        int res = 0, size = 0, numpersona = 0, resum = 0, sorteig = 0, numsorteig = 0;
        int j = 0, consultaclient = 0, seguiment = 0, finalitza = 0, i = 0, t=0, y = 0;
        int lliure = 0, pensio = 0, jove = 0, soci = 0, guanyador = 0;
        double mitjana = 0, total = 0;
        boolean valorCorrecte = false, exit = false;
        boolean l = false, p = false, c = false, s = false;
        Scanner sc = new Scanner(System.in);
        metodos method = new metodos();

        System.out.println(MSG_7);
        do {
            size = method.valorCorrecte(sc, MSG_14);
            if (size <= 0) {
                System.out.println(MSG_9);
            }
        } while (size <= 0);

        int[] arrayId = new int[size];
        int[] arrayEdat = new int[size];
        int[] arrayTipus = new int[size];
        int[] arrayImport = new int[size];
        int[] arrayTelefon = new int[size];
        int[] arrayTlf = new int[size];
        int[] arraySort = new int[size];

        do {
            for (i = 0; i < size; i++) {
                j = 0;
                seguiment = DEFAULT;
                exit = false;
                do {
                    if (j < MAXINTENTOS) {
                        arrayId[i] = method.valorCorrecte(sc, MSG_1);
                        exit = method.valida(arrayId[i], MAXID, MINID, MSG_9);
                    }
                    if (!exit) {
                        j++;
                    }
                    if (j == MAXINTENTOS) {
                        exit = true;
                    }
                } while (!exit);

                if (j == MAXINTENTOS && seguiment == PARAR) {
                    finalitza = 1;
                }

                do {
                    if (j == MAXINTENTOS) {
                        exit = false;
                        seguiment = method.valorCorrecte(sc, MSG_21);
                        exit = method.valida(seguiment, MAXSEG, MINSEG, MSG_9);
                        if (!exit) {
                            j++;
                        }
                        if (j == MAXINTENTOS) {
                            exit = true;
                        }
                    }
                } while (exit != true);

                if (j == MAXINTENTOS && seguiment == PARAR) {
                    finalitza = 1;
                }

                if (seguiment == DEFAULT) {
                    j = 0;
                    exit = false;
                    do {
                        if (j < MAXINTENTOS) {
                            arrayEdat[i] = method.valorCorrecte(sc, MSG_2);
                            exit = method.valida(arrayEdat[i], MAXEDAD, MINEDAD, MSG_9);
                        }
                        if (!exit) {
                            j++;
                        }
                        if (j == MAXINTENTOS) {
                            exit = true;
                        }
                    } while (!exit);

                    if (j == MAXINTENTOS && seguiment == PARAR) {
                        finalitza = 1;
                    }

                    do {
                        if (j == MAXINTENTOS) {
                            exit = false;
                            seguiment = method.valorCorrecte(sc, MSG_21);
                            exit = method.valida(seguiment, MAXSEG, MINSEG, MSG_9);
                            if (!exit) {
                                j++;
                            }
                            if (j == MAXINTENTOS) {
                                exit = true;
                            }
                        }
                    } while (exit != true);

                    if (j == MAXINTENTOS && seguiment == PARAR) {
                        finalitza = 1;
                    }

                    if (seguiment == DEFAULT) {
                        j = 0;
                        exit = false;

                        do {
                            if (j < MAXINTENTOS) {
                                arrayTipus[i] = method.valorCorrecte(sc, MSG_3);
                                switch (arrayTipus[i]) { //Amb el switch case emmagatzarem el resultat de la variable out.

                                    case 0:
                                        System.out.println(MSG_10);
                                        exit = true;
                                        break;
                                    case 1:
                                        System.out.println(MSG_11);
                                        exit = true;
                                        break;
                                    case 2:
                                        System.out.println(MSG_12);
                                        exit = true;
                                        break;
                                    case 3:
                                        System.out.println(MSG_13);
                                        exit = true;
                                        break;
                                    default:
                                        j++;
                                        System.out.println(MSG_9);
                                        break;
                                }
                            }
                            if (!exit) {
                                j++;
                            }
                            if (j == MAXINTENTOS) {
                                exit = true;
                            }
                        } while (!exit);

                        do {
                            if (j == MAXINTENTOS) {
                                exit = false;
                                seguiment = method.valorCorrecte(sc, MSG_21);
                                exit = method.valida(arrayId[i], MAXSEG, MINSEG, MSG_9);
                                if (!exit) {
                                    j++;
                                }
                                if (j == MAXINTENTOS) {
                                    exit = true;
                                }
                            }
                        } while (exit != true);

                        if (j == MAXINTENTOS && seguiment == PARAR) {
                            finalitza = 1;
                        }
                        if (seguiment == DEFAULT) {
                            j = 0;
                            exit = false;
                            do {
                                if (j < MAXINTENTOS) {
                                    arrayImport[i] = method.valorCorrecte(sc, MSG_4);
                                    exit = method.valida(arrayImport[i], MAXIMP, MINIMP, MSG_9);
                                }
                                if (!exit) {
                                    j++;
                                }
                                if (j == MAXINTENTOS) {
                                    exit = true;
                                }
                            } while (!exit);

                            if (j == MAXINTENTOS && seguiment == PARAR) {
                                finalitza = 1;
                            }

                            do {
                                if (j == MAXINTENTOS) {
                                    exit = false;
                                    seguiment = method.valorCorrecte(sc, MSG_21);
                                    exit = method.valida(seguiment, MAXSEG, MINSEG, MSG_9);
                                    if (!exit) {
                                        j++;
                                    }
                                    if (j == 3) {
                                        exit = true;
                                    }
                                }
                            } while (exit != true);

                            if (j == MAXINTENTOS && seguiment == PARAR) {
                                finalitza = 1;
                            }

                            if (seguiment == DEFAULT) {
                                j = 0;
                                exit = false;
                                do {
                                    if (j < MAXINTENTOS) {
                                        arrayTlf[i] = method.valorCorrecte(sc, MSG_5);
                                        arrayTelefon[i] = method.numCount(arrayTlf[i]);
                                        if (arrayTelefon[i] == TLF) {
                                            exit = method.valida(arrayTlf[i], MAXTLF, MINTLF, MSG_9);
                                        }
                                    }
                                    if (!exit) {
                                        j++;
                                    }
                                    if (j == MAXINTENTOS) {
                                        exit = true;
                                    }
                                } while (!exit);

                                if (j == MAXINTENTOS && seguiment == PARAR) {
                                    finalitza = 1;
                                }

                                do {
                                    if (j == MAXINTENTOS) {
                                        exit = false;
                                        seguiment = method.valorCorrecte(sc, MSG_21);
                                        exit = method.valida(seguiment, MAXSEG, MINSEG, MSG_9);
                                        if (!exit) {
                                            j++;
                                        }
                                        if (j == MAXINTENTOS) {
                                            exit = true;
                                        }
                                    }
                                } while (exit != true);
                                if (j == MAXINTENTOS && seguiment == PARAR) {
                                    finalitza = 1;
                                }
                                if (seguiment == SEGUIR) {
                                }
                            }
                        }
                    }
                }
                if (seguiment == SEGUIR || seguiment == PARAR && size >= 1) {
                    System.out.println("\n" + MSG_20);
                } else {
                    exit=false;
                    numpersona++;
                    arraySort[i] = method.random(MAXSOR);
                    if (numpersona < size && finalitza == 0) {
                        System.out.println("\n" + MSG_20);
                    }
                }
                if (j == 3) {
                    if (i != 0 && finalitza == 0) {
                        i--;
                        numpersona--;
                    }
                }
                if (finalitza == 1) {
                    i = 100;
                }
                if (numpersona == size) {
                    finalitza = 1;
                }
            }
        } while (finalitza == 0);
        if (size >= 1) {
            System.out.println("\n" + MSG_30);
            System.out.println("\n" + MSG_6);
            for (i = 0; i < size; i++) {
                if (arrayTlf[i] > MINTLF && arrayTlf[i] < MAXTLF) {
                    System.out.print(arrayId[i] + "\t" + arrayEdat[i] + "\t");
                    switch (arrayTipus[i]) {

                        case 0:
                            System.out.print(MSG_10);
                            lliure++;
                            l = true;
                            break;
                        case 1:
                            System.out.print(MSG_8);
                            pensio++;
                            p = true;
                            break;
                        case 2:
                            System.out.print(MSG_12);
                            jove++;
                            c = true;
                            break;
                        case 3:
                            System.out.print(MSG_13);
                            soci++;
                            s = true;
                            break;
                    }
                    System.out.print("\t" + arrayImport[i] + "\t" + arrayTlf[i] + "\t" + arraySort[i] +"\n");
                }
            }
            System.out.println(MSG_15 + numpersona + MSG_16 + "\n");
            exit = false;
            do {
                consultaclient = method.valorCorrecte(sc, MSG_17);
                exit = method.valida(consultaclient, MAXCCLI, MINCCLI, MSG_9);
            } while (!exit);
            if (consultaclient == 1) {
                exit = false;
                do {
                    consultaclient = method.valorCorrecte(sc, MSG_18);
                    for (i = 0; i < size; i++) {
                        if (arrayTipus[i] != consultaclient) {
                            exit = true;
                        } else {
                            switch (consultaclient) { //Amb el switch case emmagatzarem el resultat de la variable out.

                                case 0:
                                    System.out.println(MSG_19 + MSG_10);
                                    exit = true;
                                    break;
                                case 1:
                                    System.out.println(MSG_19 + MSG_8);
                                    exit = true;
                                    break;
                                case 2:
                                    System.out.println(MSG_19 + MSG_12);
                                    exit = true;
                                    break;
                                case 3:
                                    System.out.println(MSG_19 + MSG_13);
                                    exit = true;
                                    break;
                                default:
                                    j++;
                                    System.out.println(MSG_9);
                                    break;
                            }
                            i = 100;
                        }
                    }
                } while (exit != true);

                i = 0;
                method.bubbleSort(arrayEdat, arrayId, arrayTipus, arrayImport, arrayTlf, i, size);

                for (i = 0; i < size; i++) {
                    if (l == false && p == false && s == false && c == false) {
                        System.out.println(MSG_28);
                        i = 100;
                    }
                }
                for (i = 0; i < size; i++) {
                    if (arrayTipus[i] == consultaclient) {
                        System.out.println(MSG_6);
                        i = 100;
                    }
                }
                for (i = 0; i < size; i++) {
                    if (arrayTipus[i] == consultaclient) {
                        if (arrayTlf[i] > 111111111 && arrayTlf[i] < 999999999) {
                            switch (arrayTipus[i]) {

                                case 0:
                                    System.out.println(arrayId[i] + "\t" + arrayEdat[i] + "\t" + MSG_10 + "\t" + arrayImport[i] + "\t" + arrayTlf[i] + "\t" + arraySort[i]);
                                    break;
                                case 1:
                                    System.out.println(arrayId[i] + "\t" + arrayEdat[i] + "\t" + MSG_8 + "\t" + arrayImport[i] + "\t" + arrayTlf[i] + "\t" + arraySort[i]);
                                    break;
                                case 2:
                                    System.out.println(arrayId[i] + "\t" + arrayEdat[i] + "\t" + MSG_12 + "\t" + arrayImport[i] + "\t" + arrayTlf[i] + "\t" + arraySort[i]);
                                    break;
                                case 3:
                                    System.out.println(arrayId[i] + "\t" + arrayEdat[i] + "\t" + MSG_13 + "\t" + arrayImport[i] + "\t" + arrayTlf[i] + "\t" + arraySort[i]);
                                    break;
                            }
                        }
                    }
                }
            }
            exit = false;
            do {
                resum = method.valorCorrecte(sc, MSG_22);
                exit = method.valida(resum, MAXSO, MINSO, MSG_9);
            } while (exit != true);
            if (resum == 1) {
                System.out.println("\n" + MSG_29 + size + "\n");
                for (i = 0; i < size; i++) {
                    mitjana = mitjana + arrayEdat[i];
                }
                System.out.println(MSG_23 + mitjana / size + " anys" + "\n");
                System.out.println(MSG_25 + "\n");
                if (l == true) {
                    System.out.println("Lliure: " + lliure);
                }
                if (p == true) {
                    System.out.println("Pensio: " + pensio);
                }
                if (c == true) {
                    System.out.println("Jove: " + jove);
                }
                if (s == true) {
                    System.out.println("Soci: " + soci);
                }
                System.out.println("\n" + MSG_27);
                System.out.println("-----------------------------");
                if (lliure != 0) {
                    System.out.print("Lliure: ");
                    for (i = 0; i < lliure; i++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                if (pensio != 0) {
                    System.out.print("Pensio: ");
                    for (i = 0; i < pensio; i++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                if (jove != 0) {
                    System.out.print("Jove: ");
                    for (i = 0; i < jove; i++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                if (soci != 0) {
                    System.out.print("Soci: ");
                    for (i = 0; i < soci; i++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                for (i = 0; i < size; i++) {
                    total = total + arrayImport[i];
                }
                System.out.println("\n" + MSG_26 + total);
            }
            exit = false;
            do {
                    sorteig = method.valorCorrecte(sc, MSG_31);
                    exit = method.valida(sorteig, MAXSO, MINSO, MSG_9);
            } while (exit != true);
            numsorteig = method.random(MAXSOR);
            System.out.println(MSG_32 + numsorteig);
            guanyador = method.binarySearch(arraySort, arrayId, 0, arrayId.length - 1, numsorteig);
            if (guanyador != 0) {
                System.out.println(MSG_33 + guanyador);
            } else {
                System.out.println(MSG_34);
            } 
        }
        if (seguiment == 0 && size == 1) {
            System.out.print("\n" + MSG_22);
        }
    }
}
