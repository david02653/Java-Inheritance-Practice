import java.util.*;

public class Work1 {
    public static void main(String [] args){
        ArrayList<Employee> workerList = new ArrayList<>();

        //System.out.println("testing file");
        Scanner scan = new Scanner(System.in);
        Scanner tmp = new Scanner(System.in);
        int[] move = new int[1];
        Employee employee = new SalariedEmployee();

        displayFunc();
        //typ = scan.nextInt();
        //System.out.println("your type is = " + typ);

        //move = scan.nextInt();
        selectWorkerType( scan, move );
        while(move[0] != -1){
            switch(move[0]){
                case 0:
                    System.out.println("Adding new Salaried-Employee...");
                    employee = new SalariedEmployee();
                    break;
                case 1:
                    System.out.println("Adding new Hourly-Employee...");
                    employee = new HourlyEmployee();
                    break;
                case 2:
                    System.out.println("Adding new Commission-Employee...");
                    employee = new CommissionEmployee();
                    break;
                case 3:
                    System.out.println("Adding new Base Salaried Commission-Employee...");
                    employee = new BasePlusCommissionEmployee();
                    break;
                default:
                    //System.out.println("Error Input !");
                    System.out.println("end adding process and print all workers information");
            }

            if(move[0] >= 0 || move[0] <= 3){
                employee.setName();
                employee.set(tmp);
                workerList.add(employee);
            }

            if(move[0] > 3 || move[0] <-1){
                break;
            }
            displayFunc();
            selectWorkerType( scan, move );
            //move = scan.nextInt();
        }

        int totalSalary = 0;
        for(Employee ptr: workerList){
            System.out.print("worker [ ");
            System.out.print(ptr.getName());
            System.out.println(" ]");
            //System.out.print("Worker Type = ");
            /*switch(ptr.classify()){
                case 0:
                    //System.out.println("Salaried-Employee");
                    System.out.println(ptr);
                    break;
                case 1:
                    //System.out.println("Hourly-Employee");
                    System.out.println(ptr);
                    break;
                case 2:
                    //System.out.println("Commission-Employee");
                    System.out.println(ptr);
                    break;
                case 3:
                    //System.out.println("Base Salaried Commission-Employee");
                    System.out.println(ptr);
                    break;
                default :
                    System.out.println("ERROR \r\n Unexpected classify occurred !");
            }*/
            System.out.println(ptr);
            totalSalary += ptr.getEarnings();
        }
        System.out.println("You have " + workerList.size() + " workers !");
        System.out.println("Total Salary = " + totalSalary);

    }

    private static void displayFunc(){
        System.out.println("press 0 to add new Salaried-Employee");
        System.out.println("press 1 to add new Hourly-Employee");
        System.out.println("press 2 to add new Commission-Employee");
        System.out.println("press 3 to add new Base Salaried Commission-Employee");
        System.out.println("press -1 to end adding precess and print all information");
        System.out.print("Ready to add a new worker, Input worker type >>");
    }

    private static void selectWorkerType( Scanner scan, int typ[] ){
        try{
            typ[0] = scan.nextInt();
        }
        catch(Exception e){
            typ[0] = 9;
            System.out.println("Wrong input !");
        }
    }
}
