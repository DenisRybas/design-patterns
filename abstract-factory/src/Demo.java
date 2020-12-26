import model.employee.Employee;
import model.employee.Specialization;

public class Demo implements Runnable {
    public static void main(String[] args) {
        Demo app = new Demo();
        app.run();
    }

    @Override
    public void run() {
        Employee programmer = createEmployee(Specialization.PROGRAMMER);
        Employee projectManager = createEmployee(Specialization.PROJECT_MANAGER);
        System.out.println(programmer.getSpecialization());
        System.out.println(projectManager.getSpecialization());
    }

    public Employee createEmployee(Specialization specialization) {
        return Employee.getFactory(specialization).create();
    }
}
