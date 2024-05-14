import java.util.Date;

class Person {
    private String name;
    private String address;
    private String Telephone;
    private String email;

    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.Telephone = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person: " + name;
    }
}

class Student extends Person {
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";
    private String classStatus;

    public Student(String name, String address, String phoneNumber, String email, String classStatus) {
        super(name, address, phoneNumber, email);
        this.classStatus = classStatus;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
}

class Employee extends Person {
    private String office;
    private double salary;
    private Date dateHired;

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary, Date dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }
}

class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, Date dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty: " + super.toString();
    }
}

class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, Date dateHired, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff: " + super.toString();
    }
}

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("Abdi shakuur", "Deyniile", "617973661", "Abdi-shakuur147@gmail.com");
        Student student = new Student("Ahmed", "hodan", "615532170", "ahmed121@gmail.com", Student.JUNIOR);
        Employee employee = new Employee("Bashiir", "yaaqshiid", "615559099", "Bashiir143@gmail.com", "Office 101", 50000, new Date());
        Faculty faculty = new Faculty("Carol Williams", "101 Pine St", "555-1112", "carol@example.com", "Office 202", 75000, new Date(), "9am-5pm", "Professor");
        Staff staff = new Staff("David Brown", "222 Cedar St", "555-1314", "david@example.com", "Office 303", 40000, new Date(), "Manager");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
