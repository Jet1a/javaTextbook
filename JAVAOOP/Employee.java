package JAVAOOP;

public class Employee {

    //Attribute
    private String id;
    private String name;
    private Double salary;

    //Static Attribue
    static int minSalary=12000;
    
    //Default Constructor (ชื่อคลาสต้องเหมือนกับชื่อคอนตักเตอร์)
    public Employee(){
        System.out.println("Employee!!");
    }
    public Employee(String name,Double salary){
        this.name=name;
        this.salary=salary;
        displayEmployee();
    }
    public Employee(String id,String name,Double salary){
        //ทำแบบนี้เพื่อไม่ต้องไปใช้อันข้างล่าง
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    //Method สำหรับเข้่าถึงแบบprivate
    public void setId(String id){
        //this (class) , super(); เป็นการใช้ parent constructor
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(Double salary){
        this.salary=salary;
    }
    //Display Gather Method 
    public void displayEmployee(){
        System.out.println("ID = "+this.id);
        System.out.println("Name = "+this.name);
        System.out.println("Salary = "+this.salary);
    }
    //แสดงแค่บางส่วน
    public String getName(){
        return this.name;
    }
    public void bonus(){
        System.out.println("Bonus : 10%");
    }
}
