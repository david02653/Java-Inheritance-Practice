import java.util.*;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private int baseSalary = 0;

    public void set( Scanner val ){
        //Scanner val = new Scanner(System.in);
        int temp;

        super.set(val);

        System.out.print("Input Base Salary >>");
        try{
            temp = val.nextInt();
        }
        catch(Exception e){
            temp = 0;
            System.out.println("Wrong input ! set value to 0 !");
        }
        //temp = val.nextInt();
        baseSalary = temp;
    }
    public int getEarnings(){
        int salary;
        salary = baseSalary + (int)(getCommissionRate() * getGrossSales());

        return salary;
    }
    public String toString(){
        String info = "Name = ";
        info = info.concat(getName());
        info = info.concat("\r\nWorker Type = Base Salaried Commission-Employee\r\nCommissionRate = ");
        info = info.concat(getCommissionRate() + "\r\nGrossSales = ");
        info = info.concat(getGrossSales() + "\r\nBaseSalary = ");
        info = info.concat(baseSalary + "\r\nSalary = ");
        info = info.concat(getEarnings() + "\r\n");

        return info;
    }
}
