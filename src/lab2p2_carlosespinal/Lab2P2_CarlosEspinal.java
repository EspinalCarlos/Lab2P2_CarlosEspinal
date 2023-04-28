
package lab2p2_carlosespinal;

import java.util.ArrayList;
import java.util.Scanner;


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
                           3. Modificar una pieza de arte
                           4. Eliminar una pieza de arte
                           5. Cerrar Sesion
                           
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
                    System.out.println("Ingrese su nombre de usuario: ");
                    read.nextLine();
                    String u = read.nextLine();
                    System.out.println("Ingrese su clave para ingresar: ");
                    String p = read.next();
                    
                    for (Usuario user : registro) {
                        if (user.getUsername().equals(u) && user.getPassword().equals(p)) {
                            access = true;
                        }
                    }
                    
                    if (access == true) {
                        int o2 = 0;
                        while(o2 != 5){
                            menuPrincipal();
                            int opcmm = read.nextInt();
                            switch(opcmm){
                                case 1:
                                    
                                    break;
                                case 2:
                                    
                                    break;
                                case 3:
                                    
                                    break;
                                case 4:
                                    
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
                    char adm = read.next().charAt(0);
                    
                    if (adm == 's' && adm == 'S') {
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
