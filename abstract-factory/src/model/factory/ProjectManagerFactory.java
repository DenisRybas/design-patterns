package model.factory;
import model.employee.ProjectManager;

public class ProjectManagerFactory implements AbstractFactory<ProjectManager> {
    @Override
    public ProjectManager create() {
        return new ProjectManager();
    }
}
