package model.employee;

public class ProjectManager extends Employee {
    private Specialization specialization = Specialization.PROJECT_MANAGER;

    @Override
    public Specialization getSpecialization() {
        return specialization;
    }
}
