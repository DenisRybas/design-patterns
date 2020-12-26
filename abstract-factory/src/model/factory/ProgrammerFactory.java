package model.factory;

import model.employee.Employee;
import model.employee.Programmer;

public class ProgrammerFactory implements AbstractFactory<Programmer> {
    @Override
    public Programmer create() {
        return new Programmer();
    }
}
