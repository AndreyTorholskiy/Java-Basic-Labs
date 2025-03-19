package ntu.dp.torholskyi.lr4.controller;

import ntu.dp.torholskyi.lr4.model.Group;
import ntu.dp.torholskyi.lr4.model.Human;
import ntu.dp.torholskyi.lr4.model.Student;

import java.util.List;

public class GroupCreator extends AbstractCreator<Student> {
    @Override
    public Group create(String name, Human human, List<Student> children) {
        return new Group(name, human, children); // Повертаємо об'єкт Group
    }
}
