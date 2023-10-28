/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_juanlópez;
import java.util.Scanner;
/**
 *
 * @author jjlm1
 */
public class Lab3P1_JuanLópez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ganador = 0;
        double vida1;
        double vida2;
        Scanner leer=new Scanner(System.in);
        System.out.println("1. Sucesiones y más sucesiones");
        System.out.println("2. Pocket Monsters");
        System.out.println("3. Asterisco en Casa");
        System.out.println("");
        System.out.println("Ingrese el ejercicio para entrar");
        int ejer=leer.nextInt();
        while(ejer>0&&ejer<4){
            switch (ejer){
                case 1: 
                    System.out.println("Ingrese diferencia de la secuencia:");
                    int difer=leer.nextInt(),difer1;
                    difer1=difer;
                    System.out.println("Ingrese el numero inicial:");
                    int inicial=leer.nextInt(),inicial1;
                    inicial1=inicial;
                    System.out.println("Ingrese longitud de la serie:");
                    int longitud=leer.nextInt();
                    for (int i=1;i<=longitud;i++){
                        System.out.print(inicial+"");
                        if (i<longitud){
                            System.out.print(", ");
                        }
                            inicial=inicial+difer;
                            difer++;
                        }
                    System.out.println("");
                    System.out.println("¿Qué número de la sucesión quiere ver?");
                    int num=leer.nextInt();
                    for(int j=1;j<num;j++){
                        inicial1=inicial1+difer1;
                            difer1++;
                            if (j==num-1){
                                System.out.print(inicial1+"");
                            }
                    }
                     System.out.println("");
                     break;
                     
                case 2:
                     System.out.println("Estadísticas de los pokemones");
                     System.out.println("Sylveon Vida:280 Ataque:80 Defensa 15%");
                     System.out.println("Gyarados Vida:300 Ataque:50 Defensa 10%");
                     System.out.println("Giratina Vida:300 Ataque:70 Defensa 25%");
                     System.out.println("Dragonite Vida:250 Ataque:75 Defensa 20%");
                     System.out.println("");
                    System.out.println("Ingrese modo de pelea");
                    System.out.println("1.- Hasta la muerte");
                    System.out.println("2.- Por Rondas");
                    int modo=leer.nextInt();
                    switch (modo){
                        case 1:
                        System.out.println("");
                    System.out.println("Ingrese una pelea determinada");
                    System.out.println("1.- Sylveon vrs Dragonite");
                    System.out.println("2.- Gyarados vrs Giratina");
                    System.out.println("3.- Dragonite vrs Giratina");
                    System.out.println("4.- Giratina vrs Sylveon");
                    int pelea =leer.nextInt();
                            
                    switch (pelea){
                        case 1:
                           switch (pelea){
                               case 1:
                                    vida1=280;
                                   double ataque1=80;
                                   double defensa1=0.15;
                                    vida2=250;
                                   double ataque2=75;
                                   double defensa2=0.2;
                                   int ronda=1;
                                   ataque2=ataque2-ataque2*defensa1;
                                   ataque1=ataque1-ataque1*defensa2;
                                   while (vida1>0&&vida2>0){
                                       System.out.println("------------Ronda"+ronda+"-------------");
                                       System.out.println("Vida Pokemon 1:"+vida1);
                                       System.out.println("Vida Pokemon 2:"+vida2);
                                       System.out.println("");
                                       System.out.println("Pokemon 1 ha atacado!");
                                       System.out.println("Pokemon 2 ha atacado!");
                                       vida1=vida1-ataque2;
                                       vida2=vida2-ataque1;
                                       ronda++;
                                       if (vida1<0){
                                           vida1=0;
                                           ganador=2;
                                       }else if (vida2<0){
                                           vida2=0;
                                           ganador=1;
                                   }else if(vida1==vida2){
                                   ganador=3;
                                   }
                                    System.out.println("Vida Pokemon 1:"+vida1);
                                       System.out.println("Vida Pokemon 2:"+vida2);   
                                   }
                                   System.out.println("");
                                   System.out.println("*******Fin de la Batalla********");
                                   switch (ganador){
                                
                                       case 1:
                                           System.out.println("Pokemon 1 Ha sido el ganador!");
                                       break;
                                       case 2:
                                           System.out.println("Pokemon 2 Ha sido el ganador!");
                                       break; 
                                       case 3:
                                           System.out.println("Ninguno de los dos pokemons puede continuar");
                                           break; 
                                           
                                   }
                                   break;
                               case 2: 
                                    vida1=300;
                                    ataque1=50;
                                    defensa1=0.1;
                                    vida2=300;
                                    ataque2=70;
                                    defensa2=0.25;
                                    ronda=1;
                                   ataque2=ataque2-ataque2*defensa1;
                                   ataque1=ataque1-ataque1*defensa2;
                                   while (vida1>0&&vida2>0){
                                       System.out.println("------------Ronda"+ronda+"-------------");
                                       System.out.println("Vida Pokemon 1:"+vida1);
                                       System.out.println("Vida Pokemon 2:"+vida2);
                                       System.out.println("");
                                       System.out.println("Pokemon 1 ha atacado!");
                                       System.out.println("Pokemon 2 ha atacado!");
                                       vida1=vida1-ataque2;
                                       vida2=vida2-ataque1;
                                       ronda++;
                                       if (vida1<0){
                                           vida1=0;
                                           ganador=2;
                                       }else if (vida2<0){
                                           vida2=0;
                                           ganador=1;
                                       
                                   }else if(vida1==vida2){
                                   ganador=3;
                                   }
                                       System.out.println("Vida Pokemon 1:"+vida1);
                                       System.out.println("Vida Pokemon 2:"+vida2); 
                                   }
                                   System.out.println("");
                                   System.out.println("*******Fin de la Batalla********");
                                   switch (ganador){
                                
                                       case 1:
                                           System.out.println("Pokemon 1 Ha sido el ganador!");
                                       break;
                                       case 2:
                                           System.out.println("Pokemon 2 Ha sido el ganador!");
                                       break; 
                                           case 3:
                                           System.out.println("Ninguno de los dos pokemons puede continuar");
                                           break; 
                                   }
                                   break;
                               case 3:  
                                    vida1=250;
                                    ataque1=75;
                                    defensa1=0.2;
                                    vida2=300;
                                    ataque2=70;
                                    defensa2=0.25;
                                    ronda=1;
                                   ataque2=ataque2-ataque2*defensa1;
                                   ataque1=ataque1-ataque1*defensa2;
                                   while (vida1>0&&vida2>0){
                                       System.out.println("------------Ronda"+ronda+"-------------");
                                       System.out.println("Vida Pokemon 1:"+vida1);
                                       System.out.println("Vida Pokemon 2:"+vida2);
                                       System.out.println("");
                                       System.out.println("Pokemon 1 ha atacado!");
                                       System.out.println("Pokemon 2 ha atacado!");
                                       vida1=vida1-ataque2;
                                       vida2=vida2-ataque1;
                                       ronda++;
                                       if (vida1<0){
                                           vida1=0;
                                           ganador=2;
                                       }else if (vida2<0){
                                           vida2=0;
                                           ganador=1;
                                       
                                   }else if(vida1==vida2){
                                   ganador=3;
                                   }
                                       System.out.println("Vida Pokemon 1:"+vida1);
                                       System.out.println("Vida Pokemon 2:"+vida2); 
                                   }
                                   System.out.println("");
                                   System.out.println("*******Fin de la Batalla********");
                                   switch (ganador){
                                
                                       case 1:
                                           System.out.println("Pokemon 1 Ha sido el ganador!");
                                       break;
                                       case 2:
                                           System.out.println("Pokemon 2 Ha sido el ganador!");
                                       break; 
                                       case 3:
                                           System.out.println("Ninguno de los dos pokemons puede continuar");
                                           break; 
                                   }
                                   break;
                               case 4:
                                   vida1=300;
                                    ataque1=70;
                                    defensa1=0.25;
                                    vida2=280;
                                    ataque2=80;
                                    defensa2=0.15;
                                    ronda=1;
                                   ataque2=ataque2-ataque2*defensa1;
                                   ataque1=ataque1-ataque1*defensa2;
                                   while (vida1>0&&vida2>0){
                                       System.out.println("------------Ronda"+ronda+"-------------");
                                       System.out.println("Vida Pokemon 1:"+vida1);
                                       System.out.println("Vida Pokemon 2:"+vida2);
                                       System.out.println("");
                                       System.out.println("Pokemon 1 ha atacado!");
                                       System.out.println("Pokemon 2 ha atacado!");
                                       vida1=vida1-ataque2;
                                       vida2=vida2-ataque1;
                                       ronda++;
                                       if (vida1<0){
                                           vida1=0;
                                           ganador=2;
                                       }else if (vida2<0){
                                           vida2=0;
                                           ganador=1;
                                      
                                   }else if(vida1<0&&vida2<0){
                                   ganador=3;
                                   }
                                       System.out.println("Vida Pokemon 1:"+vida1);
                                       System.out.println("Vida Pokemon 2:"+vida2); 
                                   }
                                   System.out.println("");
                                   System.out.println("*******Fin de la Batalla********");
                                   switch (ganador){
                                
                                       case 1:
                                           System.out.println("Pokemon 1 Ha sido el ganador!");
                                       break;
                                       case 2:
                                           System.out.println("Pokemon 2 Ha sido el ganador!");
                                       break; 
                                       case 3: 
                                           System.out.println("Ninguno de los dos pokemons puede continuar");
                                           break; 
                                   }
                                   System.out.println("");
                                   break;
                                   
                           }
                    }
                    
                    case 2: 
                           System.out.println("Ingrese una pelea determinada ***");
                    System.out.println("1.- Sylveon vrs Dragonite");
                    System.out.println("2.- Gyarados vrs Giratina");
                    System.out.println("3.- Dragonite vrs Giratina");
                    System.out.println("4.- Giratina vrs Sylveon");
                            System.out.println("Ingrese pelea");
                            int lucha=leer.nextInt();
                            System.out.println("");
                            System.out.println("Ingrese cuantas rondas");
                            int rondas=leer.nextInt();
                            int control=1;
                                switch (lucha){
                                    case 1:
                                
                                   vida1=280;
                                   double ataque1=80;
                                   double defensa1=0.15;
                                   vida2=250;
                                   double ataque2=75;
                                   double defensa2=0.2;
                                   int ronda=1;
                                   ataque2=ataque2-ataque2*defensa1;
                                   ataque1=ataque1-ataque1*defensa2;
                                   while (vida1>0&&vida2>0&&control<=rondas&&rondas>0&&rondas<=10){
                                       System.out.println("------------Ronda"+ronda+"-------------");
                                       System.out.println("Vida Pokemon 1:"+vida1);
                                       System.out.println("Vida Pokemon 2:"+vida2);
                                       System.out.println("");
                                       System.out.println("Pokemon 1 ha atacado!");
                                       System.out.println("Pokemon 2 ha atacado!");
                                       vida1=vida1-ataque2;
                                       vida2=vida2-ataque1;
                                       ronda++;
                                       if (vida1<vida2){
                                           ganador=2;
                                       }else if (vida2<vida1){
                                           ganador=1;
                                   }else if(vida1==vida2){
                                   ganador=3;
                                   }
                                    System.out.println("Vida Pokemon 1:"+vida1);
                                       System.out.println("Vida Pokemon 2:"+vida2);   
                                       control++;
                                   }
                                   System.out.println("");
                                   System.out.println("*******Fin de las Rondas********");
                                   switch (ganador){
                                
                                       case 1:
                                           System.out.println("Pokemon 1 Ha sido el ganador!");
                                       break;
                                       case 2:
                                           System.out.println("Pokemon 2 Ha sido el ganador!");
                                       break; 
                                       case 3:
                                           System.out.println("Empate");
                                           break; 
                                           
                                   }
                                   break;
                                    case 2:
                                        vida1=300;
                                    ataque1=50;
                                    defensa1=0.1;
                                    vida2=300;
                                    ataque2=70;
                                    defensa2=0.25;
                                    ronda=1;
                                   ataque2=ataque2-ataque2*defensa1;
                                   ataque1=ataque1-ataque1*defensa2;
                                   while (vida1>0&&vida2>0&&control<=rondas){
                                       System.out.println("------------Ronda"+ronda+"-------------");
                                       System.out.println("Vida Pokemon 1:"+vida1);
                                       System.out.println("Vida Pokemon 2:"+vida2);
                                       System.out.println("");
                                       System.out.println("Pokemon 1 ha atacado!");
                                       System.out.println("Pokemon 2 ha atacado!");
                                       vida1=vida1-ataque2;
                                       vida2=vida2-ataque1;
                                       ronda++;
                                       if (vida1<vida2){
                                           ganador=2;
                                       }else if (vida2<vida1){
                                           ganador=1;
                                   }else if(vida1==vida2){
                                   ganador=3;
                                   }
                                    System.out.println("Vida Pokemon 1:"+vida1);
                                       System.out.println("Vida Pokemon 2:"+vida2);   
                                       control++;
                                   }
                                   System.out.println("");
                                   System.out.println("*******Fin de las Rondas********");
                                   switch (ganador){
                                
                                       case 1:
                                           System.out.println("Pokemon 1 Ha sido el ganador!");
                                       break;
                                       case 2:
                                           System.out.println("Pokemon 2 Ha sido el ganador!");
                                       break; 
                                       case 3:
                                           System.out.println("Empate");
                                           break; 
                                           
                                   }
                                   break;
                                    case 3:
                                        vida1=250;
                                    ataque1=75;
                                    defensa1=0.2;
                                    vida2=300;
                                    ataque2=70;
                                    defensa2=0.25;
                                    ronda=1;
                                   ataque2=ataque2-ataque2*defensa1;
                                   ataque1=ataque1-ataque1*defensa2;
                                   while (vida1>0&&vida2>0&&control<=rondas){
                                       System.out.println("------------Ronda"+ronda+"-------------");
                                       System.out.println("Vida Pokemon 1:"+vida1);
                                       System.out.println("Vida Pokemon 2:"+vida2);
                                       System.out.println("");
                                       System.out.println("Pokemon 1 ha atacado!");
                                       System.out.println("Pokemon 2 ha atacado!");
                                       vida1=vida1-ataque2;
                                       vida2=vida2-ataque1;
                                       ronda++;
                                       if (vida1<vida2){
                                           ganador=2;
                                       }else if (vida2<vida1){
                                           ganador=1;
                                   }else if(vida1==vida2){
                                   ganador=3;
                                   }
                                    System.out.println("Vida Pokemon 1:"+vida1);
                                       System.out.println("Vida Pokemon 2:"+vida2);   
                                       control++;
                                   }
                                   System.out.println("");
                                   System.out.println("*******Fin de las Rondas********");
                                   switch (ganador){
                                
                                       case 1:
                                           System.out.println("Pokemon 1 Ha sido el ganador!");
                                       break;
                                       case 2:
                                           System.out.println("Pokemon 2 Ha sido el ganador!");
                                       break; 
                                       case 3:
                                           System.out.println("Empate");
                                           break; 
                                           
                                   }
                                   break;
                                    case 4: 
                                        vida1=300;
                                    ataque1=70;
                                    defensa1=0.25;
                                    vida2=280;
                                    ataque2=80;
                                    defensa2=0.15;
                                    ronda=1;
                                   ataque2=ataque2-ataque2*defensa1;
                                   ataque1=ataque1-ataque1*defensa2;
                                   while (vida1>0&&vida2>0&&control<=rondas){
                                       System.out.println("------------Ronda"+ronda+"-------------");
                                       System.out.println("Vida Pokemon 1:"+vida1);
                                       System.out.println("Vida Pokemon 2:"+vida2);
                                       System.out.println("");
                                       System.out.println("Pokemon 1 ha atacado!");
                                       System.out.println("Pokemon 2 ha atacado!");
                                       vida1=vida1-ataque2;
                                       vida2=vida2-ataque1;
                                       ronda++;
                                       if (vida1<vida2){
                                           ganador=2;
                                       }else if (vida2<vida1){
                                           ganador=1;
                                   }else if(vida1==vida2){
                                   ganador=3;
                                   }
                                    System.out.println("Vida Pokemon 1:"+vida1);
                                       System.out.println("Vida Pokemon 2:"+vida2);   
                                       control++;
                                   }
                                   System.out.println("");
                                   System.out.println("*******Fin de las Rondas********");
                                   switch (ganador){
                                
                                       case 1:
                                           System.out.println("Pokemon 1 Ha sido el ganador!");
                                       break;
                                       case 2:
                                           System.out.println("Pokemon 2 Ha sido el ganador!");
                                       break; 
                                       case 3:
                                           System.out.println("Empate");
                                           break; 
                                           
                                   }
                                   break;
                                }
                                
                            break;
                           
                    }
                case 3:
                    System.out.println("Ingrese numero impar positivo");
                    num=leer.nextInt();
                    int x=1;
                    int y=1;
                    int columnas =num;
                    int filas = num;
                    while (num<0&&num%2==0){
                        System.out.println("Ingrese numero impar positivo");
                        num=leer.nextInt();
                    }
                        for (int i=1;i<=filas;i++){
                            for (int j=1;j<=columnas;j++){
                            if(i==1||i==num||j==1||j==num){
                                System.out.print("* ");
                            }else if(j==i||j+i==num+1){
                                System.out.print("< ");
                            
                            }else if(j==num/2+1){
                                System.out.print("| ");
                            }else {
                                System.out.print("  ");
                            }
                        }
                            
                            System.out.println("");

                    }
                    
            }
            System.out.println("1. Sucesiones y más sucesiones");
        System.out.println("2. Pocket Monsters");
        System.out.println("3. Asterisco en Casa");
        System.out.println("");
        System.out.println("Ingrese el ejercicio para entrar");
         ejer=leer.nextInt();
        }


            }
        }
    




    
    

