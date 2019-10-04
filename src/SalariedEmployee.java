import java.util.*;

public class SalariedEmployee extends Employee {
    private int weeklySalary = 0;
    private int workingWeek = 0;

    public void set( Scanner val ){
        //Scanner val = new Scanner(System.in);
        int temp;

        System.out.print("Input Weekly Salary >>");
        try{
            temp = val.nextInt();
        }
        catch(Exception e){
            temp = 0;
            System.out.println("Wrong input ! set value to 0 !");
        }
        //temp = val.nextInt();
        weeklySalary = temp;

        System.out.print("Input Working Week >>");
        try{
            temp = val.nextInt();
        }
        catch(Exception e){
            temp = 0;
            System.out.println("Wrong input ! set value to 0 !");
        }
        //temp = val.nextInt();
        workingWeek = temp;
    }
    public int getEarnings(){
        int salary;
        salary = weeklySalary * workingWeek;

        return salary;
    }
    public String toString(){
        String info = "Name = ";
        info = info.concat(getName());
        info = info.concat("\r\nWorker Type = Salaried-Employee\r\nWeeklySalary = ");
        info = info.concat(weeklySalary + "\r\nWorkingWeek = ");
        info = info.concat(workingWeek + "\r\nSalary = ");
        info = info.concat(getEarnings() + "\r\n");

        return info;
    }
}
