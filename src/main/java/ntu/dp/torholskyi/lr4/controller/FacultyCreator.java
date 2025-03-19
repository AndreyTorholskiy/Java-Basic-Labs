package ntu.dp.torholskyi.lr4.controller;

import ntu.dp.torholskyi.lr4.model.Department;
import ntu.dp.torholskyi.lr4.model.Faculty;
import ntu.dp.torholskyi.lr4.model.Human;

import java.util.List;

public class FacultyCreator extends AbstractCreator<Department> {
    @Override
    public Faculty create(String name, Human human, List<Department> children) {
        return new Faculty(name, human, children); // Повертаємо об'єкт Faculty
    }
}
