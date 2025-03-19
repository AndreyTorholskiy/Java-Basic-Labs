package ntu.dp.torholskyi.lr4.controller;

import ntu.dp.torholskyi.lr4.model.Department;
import ntu.dp.torholskyi.lr4.model.Group;
import ntu.dp.torholskyi.lr4.model.Human;

import java.util.List;

public class DepartmentCreator extends AbstractCreator<Group> {
    @Override
    public Department create(String name, Human human, List<Group> children) {
        return new Department(name, human, children); // Повертаємо об'єкт Department
    }
}
