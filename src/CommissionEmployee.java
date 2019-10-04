import java.util.*;

public class CommissionEmployee extends Employee {
    private double commissionRate = 0;
    private int grossSales = 0;

    public double getCommissionRate(){
        return commissionRate;
    }
    public int getGrossSales(){
        return grossSales;
    }

    public void set( Scanner val ){
        //Scanner val = new Scanner(System.in);
        int temp;
        double dtmp;

        System.out.print("Input Commission Rate >>");
        try{
            dtmp = val.nextDouble();
        }
        catch(Exception e){
            dtmp = 0.00;
            System.out.println("Wrong input ! set value to 0 !");
        }
        //dtmp = val.nextDouble();
        commissionRate = dtmp;

        System.out.print("Input Gross Sales >>");
        try{
            temp = val.nextInt();
        }
        catch(Exception e){
            temp = 0;
            System.out.println("Wrong input ! set value to 0 !");
        }
        //temp = val.nextInt();
        grossSales = temp;
    }
    public int getEarnings(){
        int salary;
        salary = (int)(commissionRate * grossSales);

        return salary;
    }
    public String toString(){
        String info = "Name = ";
        info = info.concat(getName());
        info = info.concat("\r\nWorker Type = Commission-Employee\r\nCommissionRate = ");
        info = info.concat(commissionRate + "\r\nGrossSales = ");
        info = info.concat(grossSales + "\r\nSalary = ");
        info = info.concat(getEarnings() + "\r\n");

        return info;
    }

    /*public boolean ifbased(){
        return this instanceof BasePlusCommissionEmployee;
    }*/
}
