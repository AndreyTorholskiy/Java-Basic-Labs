package ntu.dp.torholskyi.lr4.controller;

import ntu.dp.torholskyi.lr4.model.Faculty;
import ntu.dp.torholskyi.lr4.model.Human;
import ntu.dp.torholskyi.lr4.model.University;

import java.util.List;

public class UniversityCreator extends AbstractCreator<Faculty> {
    @Override
    public University create(String name, Human human, List<Faculty> children) {
        return new University(name, human, children); // Повертаємо об'єкт University
    }
}
