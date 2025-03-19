package ntu.dp.torholskyi.lr4.controller;

import ntu.dp.torholskyi.lr4.model.Human;
import ntu.dp.torholskyi.lr4.model.Sex;

public class StudentCreator extends Human {
    public StudentCreator(String firstName, String lastName, String patronymic, Sex sex) {
        super(firstName, lastName, patronymic, sex);
    }
}
