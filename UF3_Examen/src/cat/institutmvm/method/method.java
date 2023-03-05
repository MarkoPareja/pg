/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.method;

public class method {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*
    public String sufijo(String fileName){
        if (!fileName.endsWith(".txt")) {
            fileName = fileName + ".txt";
        }
        return fileName;
    }
    
    public int valorCorrecte(Scanner sc, String MSG_1) {
        boolean valorCorrecte;
        int num = 0;
        System.out.print(MSG_1);
        valorCorrecte = sc.hasNextInt();
        if (valorCorrecte) {
            num = sc.nextInt();
        }
        else{
            sc.next();
        }
        return num;
    }
    
    public boolean valida(int num1, int MAX, int MIN, String MSG_1) {
        boolean exit;
        if (num1 <= MAX && num1 >= MIN) {
            return exit = true;
        } else {
            System.out.println(MSG_1);
            return exit = false;
        }
    }
    
    public void llegirFileReader(String fileName){
        int i = 0;
        try (FileReader fr = new FileReader("files/" + fileName)) {
            while ((i = fr.read()) != -1){
                System.out.print((char)i);
            }
        } catch (FileNotFoundException fe) {
            System.out .println("An error occurred : ");
            fe.printStackTrace();
        } catch (IOException ioex) {
            System.out .println("An error occurred : ");
            ioex.printStackTrace();
        }
    }
    
    public void escriureFileWriter(String fileName, String textName){
        try{
            FileWriter fw = new FileWriter("files/" + fileName);
            fw.write(textName);
            fw.close();
        } catch (IOException ex) {
            System.out.println("An error occurred : ");
            ex.printStackTrace();
        } finally {
            System.out.println("El fitxer s'ha creat correctament.");
        }
    }
    
    public void llegirBufferedReader(String fileNames){
        String line = "";
        try {
            //File file = new File("files/document.txt");
            BufferedReader reader = new BufferedReader(new FileReader("files/"+fileName));
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred : ");
            e.printStackTrace();
        }
    }
    
    public void escriureAfegirTextBufferedWriter(String fileName, String textName){
        int i = 0;
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("files/" + fileName, true));
            if(i < 1){
                bw.newLine();
            }
            i++;
            bw.write(textName);
            bw.close();
        } catch (IOException ex) {
            System.out.println("An error occurred : ");
            ex.printStackTrace();
        }
    }
    
    public void contarCaracters(String fileName){
        int cont = 0;
        try{      
            File file = new File("files/" + fileName);
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()){
                String datos = sc.nextLine();
                cont += datos.length();
            }
            System.out.println(cont + " caracters");   
        }catch(FileNotFoundException e){
            System.out.println("An error occurred : ");
            e.printStackTrace();
        }
    }
    
    public String printarTabla(String fileName){
        int contadorColumnas = 0;
        String line = "";
        String cvsSplitBy = ",";
        System.out.print("");
        try ( BufferedReader br = new BufferedReader(new FileReader("files/" + fileName))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(cvsSplitBy);
                if (contadorColumnas == 0) {
                    // Imprime la cabecera de la tabla
                    System.out.format("%-20s%-20s%-20s%-20s%-20s\n", data[0], data[1], data[2], data[3], data[4]);
                    // Cambia los números (4) por la cantidad de columnas que tenga tu archivo CSV
                } else {
                    // Imprime los datos de cada fila
                    System.out.format("%-20s%-20s%-20s%-20s%-20s\n", data[0], data[1], data[2], data[3], data[4]);
                }
                contadorColumnas++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileName;
    }
    
    public int contLineas(String fileName){
        int contadorLineas = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("files/"+fileName))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                contadorLineas++;
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }

        return contadorLineas;
    }
    */
    
    /*
    if (file.isFile()){
        System.out.println("\n"La llista d'articles és la seguent:"");
        fileName = method.leerTabla(fileName);
    }
    else{
        System.out.println("Error");
    }
    */
    
    /*
    case "B" :
        System.out.println(MSG_9);
        System.out.print(MSG_10);
        tipusDocument = sc.nextInt();

        if(tipusDocument == 0){
            fileName = "fileProjecte.txt";
        }
        else{
            System.out.print("\n"+MSG_2);
            sc.nextLine();
            fileName = sc.nextLine();
            fileName = method.comprovarExtensio(fileName);
        }

        File file1 = new File("files/" + fileName);

        if (tipusDocument == 1 && !file1.isFile()){
            sb.append(MSG_11 + "\n");
        }
        System.out.println(MSG_4);
        codi = sc.next();
        sb.append(codi + ",");
        System.out.println(MSG_5);
        nom = sc.next();
        sb.append(nom + ",");
        System.out.println(MSG_6);
        tipus = sc.next();
        sb.append(tipus + ",");
        System.out.println(MSG_7);
        quant = sc.next();
        sb.append(quant + ",");
        System.out.println(MSG_8);
        preu = sc.next();
        sb.append(preu);
        if( tipusDocument == 0){
            method.sobreescribirTabla(escriureAfegirTextBufferedWriter)(sb.toString(), fileName);
        }
        else{
            method.escribirTabla(escriureFileWriter)(sb.toString(), fileName);
        }
        sb.setLength(0);
        break;
    */
}
