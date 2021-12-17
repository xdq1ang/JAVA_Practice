package src.P8.ployparameter;

public class PloyParameter {
    public static void main(String[] args) {
        NormalWorker normalWorker = new NormalWorker("w1",5000);
        Manager manager = new Manager("xdqiang",500000,5000);
        showEmpAnnal(normalWorker);
        showEmpAnnal(manager);
        testWork(normalWorker);
        testWork(manager);



    }
    public static void showEmpAnnal(Employee e){
        System.out.println(e.getName()+"的年薪是"+e.getAnnual());
    }
    public static void testWork(Employee e){
        if(e instanceof NormalWorker){
            ((NormalWorker) e).work();
        }else if(e instanceof Manager){
            ((Manager)e).manage();
        }else{

        }
    }
}
class Employee{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getAnnual(){
        return salary*12;
    }

    public String getName() {
        return name;
    }
}
class NormalWorker extends Employee{
    public NormalWorker(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("The normal worker is working now...");
    }

    @Override
    public double getAnnual() {
        System.out.println("Calculate the normal worker's salary");
        return super.getAnnual();
    }
}
class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary,double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void manage(){
        System.out.println("The manager is managing now...");
    }

    @Override
    public double getAnnual() {
        System.out.println("Calculate the manager's salary");
        return super.getAnnual()+bonus;
    }
}