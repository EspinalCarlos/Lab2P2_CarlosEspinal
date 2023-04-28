
package lab2p2_carlosespinal;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Lab2P2_CarlosEspinal {
    
    static Scanner read = new Scanner(System.in);
    
    public static void menuLogin(){
        System.out.println("""
                           --- Inicio de Sesion ---
                           
                           1. Iniciar Sesion 
                           2. Crear nuevo usuario
                           3. Salir del programa
                           
                           """);
    }
    public static void menuPrincipal(){
        System.out.println("""
                           --- Menu Principal ---
                           
                           1. Crear una pieza de arte 
                           2. Modificar una pieza de arte
                           3. Listar una pieza de arte
                           4. Eliminar una pieza de arte
                           5. Cerrar Sesion
                           
                           """);
        
    }
    public static void menuAdd(){
        System.out.println("""
                           --- Que tipo de pieza de arte desea agregar? ---
                           
                           1. Pinturas
                           2. Esculturas
                           3. Fotografias
                           4. Escritos
                           
                           """);
    }
    public static void menuMod(){
        System.out.println("""
                           --- Que tipo de pieza de arte desea modificar? ---
                           
                           1. Pinturas
                           2. Esculturas
                           3. Fotografias
                           4. Escritos
                           
                           """);
    }
    public static void menuList(){
        System.out.println("""
                           --- Que tipo de pieza de arte desea listar? ---
                           
                           1. Pinturas
                           2. Esculturas
                           3. Fotografias
                           4. Escritos
                           
                           """);
    }
    public static void menuDel(){
        System.out.println("""
                           --- Que tipo de pieza de arte desea eliminar? ---
                           
                           1. Pinturas
                           2. Esculturas
                           3. Fotografias
                           4. Escritos
                           
                           """);
        
    }
    
    public static void modP(){
        System.out.println("""
                           --- Que desea modificar? ---
                           
                           1. Nombre Pintura
                           2. Nombre Autor
                           3. Fecha presentacion
                           4. Fecha Adquisicion
                           5. Estado de exposicion
                           
                           """);
        
    }
    public static void modE(){
        System.out.println("""
                           --- Que desea modificar? ---
                           
                           1. Nombre Escultor
                           2. Material
                           3. Fecha en que se comenzo a esculpir
                           4. Departamento del museo
                           
                           """);
    }
    public static void modFotos(){
        System.out.println("""
                           --- Que desea modificar? ---
                           
                           1. Dimensiones
                           2. Resolucion
                           3. Es a color o no
                           
                           """);
    }
    public static void modEsc(){
        System.out.println("""
                           --- Que desea modificar? ---
                           
                           1. Total palabras
                           2. Epoca de escritura
                           3. Genero Literario
                           4. Autor
                           
                           """);
    }
    
    public static void main(String[] args) {
        int o1 = 0;
        ArrayList<Usuario> registro = new ArrayList();
        ArrayList<Pintura> pinturas = new ArrayList();
        ArrayList<Escultura> esculturas = new ArrayList();
        ArrayList<Fotografia> fotografias = new ArrayList();
        ArrayList<Escritos> escritos = new ArrayList();
        while (o1 != 3) {            
            menuLogin();
            int opclog = read.nextInt();
            
            switch (opclog) {
                case 1:
                    boolean access = false ;
                    boolean adm = false;
                    System.out.println("Ingrese su nombre de usuario: ");
                    read.nextLine();
                    String u = read.nextLine();
                    System.out.println("Ingrese su clave para ingresar: ");
                    String p = read.next();
                    
                    for (Usuario user : registro) {
                        if (user.getUsername().equals(u) && user.getPassword().equals(p)) {
                            access = true;
                            if (user.isAdminVer() == true) {
                                adm = true;
                            }
                        }
                    }
                    
                    if (access == true) {
                        int o2 = 0;
                        while(o2 != 5){
                            menuPrincipal();
                            int opcmm = read.nextInt();
                            switch(opcmm){
                                case 1:
                                    if (adm == true) {
                                        menuAdd();
                                        int opcadd = read.nextInt();
                                        switch(opcadd){
                                            case 1:
                                                System.out.println("Ingrese el nombre de la pintura: ");
                                                read.nextLine();
                                                String nomp = read.nextLine();
                                                System.out.println("Ingrese el nombre del autor: ");
                                                String noma = read.nextLine();
                                                System.out.println("Ingrese la fecha de presentacion");
                                                String f1 = read.nextLine();
                                                String[]f1t = f1.split("/");
                                                Date fecha1 = new Date(Integer.parseInt(f1t[2])-1900, Integer.parseInt(f1t[1])-1, Integer.parseInt(f1t[0]));
                                                System.out.println("Ingrese la fecha de adquisicion: ");
                                                String f2 = read.nextLine();
                                                String[]f2t = f2.split("/");
                                                Date fecha2 = new Date(Integer.parseInt(f2t[2])-1900, Integer.parseInt(f2t[1])-1, Integer.parseInt(f2t[0]));
                                                System.out.println("Esta en exposicion?:[S/N] ");
                                                boolean isexpo = false;
                                                char expo = read.nextLine().charAt(0);
                                                if (expo == 's' || expo == 'S') {
                                                    isexpo = true; 
                                                } else{
                                                    isexpo = false;
                                                }
                                                
                                                pinturas.add(new Pintura(nomp,noma,fecha1,fecha2,isexpo));
                                                
                                                
                                                break;
                                            case 2:
                                                System.out.println("Ingrese el nombre del escultor: ");
                                                read.nextLine();
                                                String nome = read.nextLine();
                                                System.out.println("Ingrese el material principal utilizado para la escultura: ");
                                                String mat = read.nextLine();
                                                System.out.println("Ingrese la fecha en que se comenzo a esculpir: ");
                                                String f3 = read.nextLine();
                                                String[] f3t = f3.split(f3);
                                                Date fechae = new Date(Integer.parseInt(f3t[2])-1900, Integer.parseInt(f3t[1])-1, Integer.parseInt(f3t[0]));
                                                System.out.println("Ingrese el departamento en que se encuentra la escultura: ");
                                                String depart = read.nextLine();
                                                
                                                esculturas.add(new Escultura(nome,mat,fechae,depart));
                                                
                                                break;
                                            case 3:
                                                System.out.println("Ingrese las dimensiones de la fotografi(De esta manera: NNNNcmxNNNNcm)): ");
                                                read.nextLine();
                                                String dim = read.nextLine();
                                                System.out.println("Ingrese la resolucion de la fotografia (NNNNxNNNN): ");
                                                String res = read.nextLine();
                                                System.out.println("Es una fotografia a color? [S/N]: ");
                                                boolean iscol = false;
                                                char col = read.nextLine().charAt(0);
                                                if (col == 's' || col == 'S') {
                                                    iscol = true;
                                                } else{
                                                    iscol = false;
                                                }
                                                
                                                fotografias.add(new Fotografia(dim,res,iscol));
                                                
                                                break;
                                            case 4:
                                                System.out.println("Ingrese el total de palabras del escrito: ");
                                                int totpal = read.nextInt();
                                                System.out.println("Ingrese la epoca en la que fue escrito: ");
                                                read.nextLine();
                                                String ep = read.nextLine();
                                                System.out.println("Ingrese genero literario: ");
                                                String gen = read.nextLine();
                                                System.out.println("Ingrese un autor: ");
                                                String auth = read.nextLine();
                                                
                                                escritos.add(new Escritos(totpal,ep,gen,auth));
                                                
                                                break;
                                        }
                                    } else{
                                        System.out.println("El usuario no tiene derechos ");
                                    }
                                    
                                    break;
                                case 2:
                                   menuMod();
                                   int opcmod = read.nextInt();
                                   switch(opcmod){
                                       case 1:
                                           int cont = 0;
                                           System.out.println("Lista de pinturas");
                                           for (Pintura pintura : pinturas) {
                                               System.out.println(cont+"-\n"+pintura);
                                               cont++;
                                           }
                                           System.out.println("Ingrese la pintura a modificar");
                                           int indmodp = read.nextInt();
                                           System.out.println("");
                                           modP();
                                           int opcmodp = read.nextInt();
                                           switch(opcmodp){
                                               case 1:
                                                   System.out.println("Ingrese el nuevo nombre: ");
                                                   read.nextLine();
                                                   String newnomp = read.nextLine();
                                                   (pinturas.get(indmodp)).setNomPintura(newnomp);
                                                   break;
                                               case 2:
                                                   System.out.println("Ingrese el nuevo nombre del autor ");
                                                   read.nextLine();
                                                   String newnompa = read.nextLine();
                                                   (pinturas.get(indmodp)).setAutor(newnompa);
                                                   break;
                                               case 3:
                                                   System.out.println("Ingrese la nueva fecha de presentacion");
                                                   read.nextLine();
                                                   String f5 = read.nextLine();
                                                   String[] f5t = f5.split("/");
                                                   (pinturas.get(indmodp)).setFpresentation(new Date(Integer.parseInt(f5t[2])-1900, Integer.parseInt(f5t[1])-1, Integer.parseInt(f5t[0])));
                                                   
                                                   
                                                   break;
                                               case 4:
                                                   System.out.println("Ingrese la nueva fecha de adquisicion: ");
                                                   read.nextLine();
                                                   String f6 = read.nextLine();
                                                   String[] f6t = f6.split("/");
                                                   (pinturas.get(indmodp)).setFadquisition(new Date(Integer.parseInt(f6t[2])-1900, Integer.parseInt(f6t[1])-1, Integer.parseInt(f6t[0])));
                                                   
                                                   break;
                                               case 5:
                                                   System.out.println("Esta en exposicion? [S/N]: ");
                                                   read.nextLine();
                                                   char isexpomod = read.nextLine().charAt(0);
                                                   if (isexpomod == 'S' || isexpomod == 's') {
                                                       (pinturas.get(indmodp)).setIsExpuesta(true);
                                                       
                                                   } else{
                                                       (pinturas.get(indmodp)).setIsExpuesta(false);
                                                   }
                                                   break;
                                           }
                                           
                                           break;
                                       case 2:
                                           int cont2 = 0;
                                           System.out.println("Lista de esculturas");
                                           for (Escultura escultura : esculturas) {
                                               System.out.println(cont2 + "- " + escultura);
                                           }
                                           System.out.println("Que desea modificar?: ");
                                           int indmode = read.nextInt();
                                           
                                           modE();
                                           int opcemod = read.nextInt();
                                           
                                           switch(opcemod){
                                               case 1:
                                                   System.out.println("Ingrese el nombre de escultor: ");
                                                   read.nextLine();
                                                   String newnameesc = read.nextLine();
                                                   
                                                   (esculturas.get(indmode)).setEscultor(newnameesc);
                                                   
                                                   break;
                                               case 2:
                                                   System.out.println("Ingrese el material: ");
                                                   read.nextLine();
                                                   String newmat = read.nextLine();
                                                   
                                                   (esculturas.get(indmode)).setMaterial(newmat);
                                                   
                                                   
                                                   
                                                   break;
                                               case 3:
                                                   System.out.println("Ingrese fecha de esculpir: ");
                                                   read.nextLine();
                                                   String f7 = read.nextLine();
                                                   String[] f7t = f7.split("/");
                                                   (esculturas.get(indmode)).setDateEsculpir(new Date(Integer.parseInt(f7t[2])-1900, Integer.parseInt(f7t[1])-1, Integer.parseInt(f7t[0])));
                                                   break;
                                               case 4:
                                                   System.out.println("Ingrese el departamento: ");
                                                   read.nextLine();
                                                   String newdep = read.nextLine();
                                                   
                                                   (esculturas.get(indmode)).setMaterial(newdep);
                                                   
                                                   break;
                                           }
                                           
                                           break;
                                       case 3:
                                           int cont3 = 0;
                                           System.out.println("Lista de Fotografias ");
                                           for (Fotografia fotografia : fotografias) {
                                               System.out.println(cont3+"- "+ fotografia);
                                           }
                                           System.out.println("Ingrese el indice de la foto: ");
                                           int indmodf = read.nextInt();
                                          
                                           
                                           modFotos();
                                           System.out.println("Ingrese lo que desea modificar: ");
                                           int opcfmod = read.nextInt();
                                           read.nextLine();
                                           
                                           switch(opcfmod){
                                               case 1:
                                                   System.out.println("Ingrese la nueva dimension: ");
                                                   String newdim = read.nextLine();
                                                   (fotografias.get(indmodf)).setDimension(newdim);
                                                   break;
                                               case 2:
                                                   System.out.println("Ingrese la nueva resolucion: ");
                                                   String newres = read.nextLine();
                                                   (fotografias.get(indmodf)).setResolucion(newres);
                                                   break;
                                               case 3:
                                                   System.out.println("Ingrese si es a color: [S/N]");
                                                   char newcolf = read.nextLine().charAt(0);
                                                   if(newcolf == 'S' || newcolf == 's'){
                                                        (fotografias.get(indmodf)).setIsBlackWhite(true);
                                                   } else{
                                                       (fotografias.get(indmodf)).setIsBlackWhite(false);
                                                   }
                                                   break;
                                               
                                           }
                                           
                                           break;
                                       case 4:
                                           int cont4 = 0;
                                           System.out.println("Lista de escritos ");
                                           for (Escritos escrito : escritos) {
                                               System.out.println(cont4+"- "+escrito);
                                           }
                                           System.out.println("Ingrese cual desea modificar");
                                           int indesc = read.nextInt();
                                           
                                           modEsc();
                                           System.out.println("Ingrese el que desea mod: ");
                                           int opcesc = read.nextInt();
                                           
                                           switch(opcesc){
                                               case 1:
                                                   System.out.println("Numero de palabras");
                                                   int newtotpal = read.nextInt();
                                                   (escritos.get(indesc)).setTotalPalabras(newtotpal);
                                                   break;
                                               case 2:
                                                   System.out.println("Ingrese la epoca: ");
                                                   read.nextLine();
                                                   String newepoca = read.nextLine();
                                                   (escritos.get(indesc)).setEpoca(newepoca);
                                                   
                                                   break;
                                               case 3:
                                                   System.out.println("Ingrese el genero: ");
                                                   read.nextLine();
                                                   String newgen = read.nextLine();
                                                   (escritos.get(indesc)).setGenero(newgen);
                                                   break;
                                               case 4:
                                                   System.out.println("Ingrese el autor nuevo: ");
                                                   read.nextLine();
                                                   String newautoresc = read.nextLine();
                                                   (escritos.get(indesc)).setAutor(newautoresc);
                                                   break;
                                           }
                                           break;
                                   }
                                    
                                    
                                    break;
                                case 3:
                                    menuList();
                                    int artalist = read.nextInt();
                                    switch (artalist) {
                                        case 1:
                                            for (Pintura pne : pinturas) {
                                                System.out.println(pne);
                                                System.out.println("");
                                            }
                                            break;
                                        case 2:
                                            for (Escultura escultura : esculturas) {
                                                System.out.println(escultura);
                                                System.out.println("");
                                            }
                                            break;
                                        case 3:
                                            for (Fotografia fotografia : fotografias) {
                                                System.out.println(fotografia);
                                                System.out.println("");
                                            }
                                            break;
                                        case 4:
                                            for (Escritos escrito : escritos) {
                                                System.out.println(escrito);
                                                System.out.println("");
                                            }
                                            break;
                                        
                                    }
                                    
                                    break;
                                case 4:
                                    if (adm == true) {
                                        menuDel();
                                        int odel = read.nextInt();
                                        switch (odel) {
                                            case 1:
                                                System.out.println("Ingrese el index de la pintura a eliminar: ");
                                                int indpin = read.nextInt();
                                                pinturas.remove(indpin);
                                                break;
                                            case 2:
                                                System.out.println("Ingrese el index de la escultura a eliminar: ");
                                                int indes = read.nextInt();
                                                esculturas.remove(indes);
                                                break;
                                            case 3:
                                                System.out.println("Ingrese el index de la fotografia a eliminar: ");
                                                int indfot = read.nextInt();
                                                fotografias.remove(indfot);
                                                break;
                                            case 4:
                                                System.out.println("Ingrese el index de la escritura a eliminar: ");
                                                int indesc = read.nextInt();
                                                escritos.remove(indesc);
                                                break;
                                        }
                                    }
                                    break;
                                    
                                case 5:
                                    o2 = 5;
                                    break;
                            }
                        }
                    }
                    
                    
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de usuario deseado: ");
                    read.nextLine();
                    String us = read.nextLine();
                    System.out.println("Ingrese la clave para su cuenta: ");
                    String clave = read.next();
                    System.out.println("Es este usuario parte de la administracion[S/N]: ");
                    char admi = read.next().charAt(0);
                    
                    if (admi == 's' && admi == 'S') {
                        registro.add(new Usuario(us,clave,true));
                    } else{
                        registro.add(new Usuario(us,clave,true));
                    }
                    
                    
                    
                    break;
                case 3:
                    o1 = 3;
                    
                    break;
            }
            
            
        }// fin while del login
        
        
        
        
        
    }
    
}
