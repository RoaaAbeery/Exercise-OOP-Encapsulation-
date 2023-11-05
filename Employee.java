public class Employee {
    private String id;
    private String name;
    private double salary;

    public Employee(String id, String name, Double salary) {

        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setId(String id){
        this.id=id;

    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public double getAnnualSalary(){
             salary=salary*12;
        return salary;
    }
    public double raisedSalary(int percent){
           salary =salary * percent/100;

        return salary;
    }
    public void toString1(){
        System.out.println("Employee Name : "+getName());
        System.out.println("Employee ID  :"+getId());
        System.out.println("Annual Salary  :"+getAnnualSalary());
        System.out.println("raised Salary  :"+raisedSalary(10));

    }

}
