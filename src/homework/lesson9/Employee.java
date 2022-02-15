package homework.lesson9;

public class Employee {

    public String name;
    public String address;
    public int salary;
    public String yearofjoining;

    public Employee(String n, String adr, String yr, int sal) {
        address = adr;
        name = n;
        salary = sal;
        yearofjoining = yr;
    }

    public String getName() {
        String name = null;
        return name;
    }

    public String setName() {
        String name = null;
        return name;
    }

    public String getAddress() {
        String address = null;
        return address;
    }

    public String setAddress() {
        String address = null;
        return address;
    }

    public String getSalary() {
        String Sal = null;
        return Sal;
    }

    public String setSalary() {
        String Sal = null;
        return Sal;
    }

    public String getYearofjoining() {
        String Yr = null;
        return Yr;
    }

    public String setYearofjoining() {
        String Yr = null;
        return Yr;
    }
    

        public static void main(String[] args) {
            Employee[] arr = new Employee[3];
            arr[0] = new Employee("Robert ", " 64C- WallsStreat ", " 1994 ", 500);
            arr[1] = new Employee("Sam ", " 68D- WallsStreat ", " 2000 ", 5040);
            arr[2] = new Employee("Robert ", " 64C- WallsStreat ", " 1994 ", 5980);


            System.out.println("Name" + "    " + "Address" + "  " + "YearOfJoint" + "  " + "Salary");
            System.out.println(arr[0]);
            System.out.println(arr[1]);
            System.out.println(arr[2]);
        }

}
