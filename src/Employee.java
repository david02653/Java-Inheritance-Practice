import java.util.*;

abstract public class Employee {
    private String name;

    public void setName(){
        Scanner scan = new Scanner(System.in);
        String str;

        System.out.print("Input the worker's name >>");
        str = scan.nextLine();
        name = str;
        System.out.println("This worker's name is " + name);
    }
    public String getName(){
        return name;
    }

    /*public int classify(){
        if(this instanceof SalariedEmployee){
            return 0;
        }
        else if(this instanceof HourlyEmployee){
            return 1;
        }
        else {
            if(((CommissionEmployee) this).ifbased()){
                return 3;
            }
            else{
                return 2;
            }
        }
    }*/

    public abstract int getEarnings();
    public abstract void set( Scanner tmp );
}
