import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class Conversion{
   public static double x,y,z,r;
   public static int i,op;
   public static ConvM c=new ConvM();

   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);

     try{
       for(i=1;i<=2;i++){
        c.menu();

        do{
          System.out.println("Seleccione su opcion");
          op=sc.nextInt();
        }while(op<1 || op>2);

        switch(op){
          case 1:{
           do{
             System.out.println("Digite los dolares");
             x=sc.nextDouble();
             c.setdol(x);
           }while(x<0);
           r=c.ConvDolcor(x);
           System.out.println("El resultado es: "+r);
           break;
          }
          case 2:{
           do{
             System.out.println("Digite los metros");
             y=sc.nextDouble();
             c.setcor(y);
           }while(x<=0);
           r=c.ConvCordol(y);
           System.out.println("El resultado es: "+r);
           break;
          }
      

        }


     }
     }catch(Exception ex){
         x=0.0;
         y=0.0;
         System.out.println(ex.getMessage());
      }
   }

}