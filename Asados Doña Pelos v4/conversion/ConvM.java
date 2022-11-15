public class ConvM{
   double cor,dol;

   public ConvM(){}

   public ConvM(double cor, double dol){
     this.cor=cor; this.dol=dol;
   }

   public void setcor(double cor){this.cor=cor;}

   public double getcor(){return cor;}

   public void setdol(double dol){this.dol=dol;}

   public double getdol(){return dol;}



   public double ConvDolcor(double dol){return getdol()*36.13;}
 
   public double ConvCordol(double cor){return getcor()/36.13;}


   public void menu(){
    System.out.println("1.- Dolar a cordoba");
    System.out.println("2.- Cordoba a dolar");
   }


}

