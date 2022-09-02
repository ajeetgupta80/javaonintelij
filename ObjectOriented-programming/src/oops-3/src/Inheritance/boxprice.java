package Inheritance;

// this is for showing multilevel inheritance

public class boxprice extends boxweight{
         double cost;


         boxprice()
         {
             super();
             this.cost= 9009;
         }

         boxprice(double side, double weight,double cost)
         {
             super(side,weight);
             this.cost= cost;
         }

         boxprice(double l , double h, double w, double weight, double cost)
         {
             super(l,h,w,weight);
             this.cost = 89;
         }
}
