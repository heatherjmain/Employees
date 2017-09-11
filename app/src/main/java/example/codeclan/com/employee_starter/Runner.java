package example.codeclan.com.employee_starter;

/**
 * Created by user on 22/02/2017.
 */

public class Runner {
    public static void main(String[] args){
        Department department1 = new Department("HR");
        Department department2 = new Department("Marketing");
        Department department3 = new Department("Sales");
        Department department4 = new Department("Admin");
        Department department5 = new Department("Finance");

        department1.save();
        department2.save();
        department3.save();
        department4.save();
        department5.save();


//        Department.deleteAll();

        Department.all();



        Employee employee1 = new Employee("Suzie Smith", department1, 45000);
        Employee employee2 = new Employee("Angela Black", department1, 35000);

        Employee employee3 = new Employee("Jamie Jones", department2, 25000);
        Employee employee4 = new Employee("John Blue", department2, 30000);

        Employee employee5 = new Employee("Sally Yellow", department3, 20000);
        Employee employee6 = new Employee("Yvonne Green", department3, 28000);

        Employee employee7 = new Employee("Bobby Brown", department4, 15000);
        Employee employee8 = new Employee("Barney Pink", department4, 55000);

        Employee employee9 = new Employee("Johnny Purple", department5, 5000);
        Employee employee10 = new Employee("Sammy Ochre", department5, 75000);


        employee1.save();
        employee2.save();
        employee3.save();
        employee4.save();
        employee5.save();
        employee6.save();
        employee7.save();
        employee8.save();
        employee9.save();
        employee10.save();

//        Employee.deleteAll();

        Employee.all();

    }
}
