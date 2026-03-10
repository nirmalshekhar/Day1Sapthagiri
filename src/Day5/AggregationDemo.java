package Day5;
class Department{
    String deptName;
    Department(String deptName){
        this.deptName=deptName;
    }
}
class College{
    String collName;
    Department department;
    College(String collName,Department department){
        this.collName=collName;
        this.department=department;
    }
    void display(){
        System.out.println(collName +" has department "+department.deptName);
    }
}
public class AggregationDemo {
    public static void main(String[] args) {
        Department dept=new Department("CSE");
        College c=new College("Sapthagiri",dept);
        c.display();

    }
}
