package model.employee;

public class Programmer extends Employee {
    private Specialization specialization = Specialization.PROGRAMMER;

    @Override
    public Specialization getSpecialization() {
        return specialization;
    }
}
