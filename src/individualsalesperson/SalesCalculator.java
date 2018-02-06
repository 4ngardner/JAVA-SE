package individualsalesperson;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Nicol
 */
public class SalesCalculator {
    private final double fixedSalary = 30000d;
     private double minimumSales = 320000d;
    private double commission;
    private double annualCompensation;
    private final double commissionRate = .08d;
      private final double accelFactor = 0.1d;
    private double salesTarget = 400000d;
    private double sales;
    private String userID;
    
    double compensation = 0d;
   
    private DecimalFormat dollar;
    private DecimalFormat total;
    private DecimalFormat annual;
    
   
    public void askUser()
    {
         Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
       
        
        try{
            
           System.out.print("\nEnter UserID:");
           userID = input.next();
        }
        
        catch (Exception e)
            
            
        {
          System.out.println("Invalid data type entered.");
            System.exit(0);  
        }
        try
        {
            
            System.out.print("Enter Sale Amount:");
            
             sales = in.nextDouble();
          
        }
        catch (Exception e)
        {
            System.out.println("Invalid data type entered.");
            System.exit(0);
        }
       
       
    }
    
        public double calculate(){
                 if(sales < this.minimumSales){
         annualCompensation = compensation + fixedSalary;
         
        }else if (sales >  this.minimumSales && sales < this.salesTarget){
          commission = sales * commissionRate;
          annualCompensation = fixedSalary + commission;
        } else{
            commission = sales * accelFactor;
          annualCompensation = fixedSalary + commission;
         }  
        return annualCompensation;
        }

          public void printSum() 
          {
        dollar = new DecimalFormat("$ ###,###.##");
        System.out.println("UserID:" + userID);
        System.out.println("The total annual compensation is:  " 
                + dollar.format(this.annualCompensation));
        }
          public void cal2()
               
          {
              double endSales = sales * 1.5;
             annual = new DecimalFormat("$###,###.##");
              total = new DecimalFormat("$###,###.##");
              
             System.out.println("=====================================================================================");     
             System.out.println("\t\t\t   Potential Compensation  \n\t Annual Sales" + "\t\t\t\t\t" + "Annual Compensation" );
             
             do{
                  System.out.print("\t " + total.format(sales));
                  System.out.println("\t\t\t\t\t" + annual.format(annualCompensation));
                  sales = sales + 5000d;
                  calculate();
               }while (sales <= endSales);
          }
}//END OF: class SalesCalculator

/**
 * *************************************************************************
 * REFERENCES: 
 * Boyarsky, Jeanne, Scott Selikoff. OCA: Oracle Certified Associate Java SE 8 Programmer I Study Guide: Exam 1Z0-808. Sybex, 2014-12-22. 
**************************************************************************
 */
// 

            
               
            
          
     
          
          
     
    


 