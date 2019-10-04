import java.util.*;

public class HourlyEmployee extends Employee {
    private int workingHour = 0;
    private int wage = 0;

    public void set( Scanner val ){
        //Scanner val = new Scanner(System.in);
        int temp;

        System.out.print("Input Working Hour >>");
        try{
            temp = val.nextInt();
        }
        catch(Exception e){
            temp = 0;
            System.out.println("Wrong input ! set value to 0 !");
        }
        //temp = val.nextInt();
        workingHour = temp;

        System.out.print("Input Wage >>");
        try{
            temp = val.nextInt();
        }
        catch(Exception e){
            temp = 0;
            System.out.println("Wrong input ! set value to 0 !");
        }
        //temp = val.nextInt();
        wage = temp;
    }
    public int getEarnings() {
        int salary;
        double extraPayment;

        if(workingHour <= 40){
            salary = workingHour * wage;
        }
        else {
            extraPayment = (wage * 1.5) * (workingHour - 40);
            salary = wage * 40 + (int)extraPayment;
        }

        return salary;
    }
    public String toString(){
        /*
        StringBuilder info = new StringBuilder();
        info.append("Name = " + getName() + "\r\n");
        info.append("Worker Type = Hourly-Employee\r\n");
        info.append("WorkingHour = " + workingHour + "\r\n");
        info.append("Wage = " + wage + "\r\n");

        String finalInfo = info.toString();
        */
        String info = "Name = ";
        info = info.concat(getName());
        info = info.concat("\r\nWorker Type = Hourly-Employee\r\nWorkingHour = ");
        info = info.concat(workingHour + "\r\nWage = ");
        info = info.concat(wage + "\r\nSalary = ");
        info = info.concat(getEarnings() + "\r\n");

        return info;
    }
}
