package ntu.dp.torholskyi.lr3.controller;

import ntu.dp.torholskyi.lr3.model.Human;
import ntu.dp.torholskyi.lr3.model.Sex;

public class StudentCreator extends Human {
    public StudentCreator(String firstName, String lastName, String patronymic, Sex sex) {
        super(firstName, lastName, patronymic, sex);
    }
}
