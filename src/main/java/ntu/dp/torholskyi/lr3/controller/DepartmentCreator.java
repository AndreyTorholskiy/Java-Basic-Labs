package ntu.dp.torholskyi.lr3.controller;

import ntu.dp.torholskyi.lr3.model.Department;
import ntu.dp.torholskyi.lr3.model.Group;
import ntu.dp.torholskyi.lr3.model.Human;

import java.util.List;

public class DepartmentCreator extends AbstractCreator<Group> {
    @Override
    public Department create(String name, Human human, List<Group> children) {
        return new Department(name, human, children); // Повертаємо об'єкт Department
    }
}
