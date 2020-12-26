package model.employee;

import model.factory.AbstractFactory;
import model.factory.ProgrammerFactory;
import model.factory.ProjectManagerFactory;

public abstract class Employee {
    public abstract Specialization getSpecialization();

    public static AbstractFactory<? extends Employee> getFactory(Specialization specialization) {
        switch (specialization) {
            case PROGRAMMER:
                return new ProgrammerFactory();
            case PROJECT_MANAGER:
                return new ProjectManagerFactory();
            default: throw new IllegalArgumentException("Employee specialization not supported");
        }
    }
}
