package ntu.dp.torholskyi.lr4.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Student extends Human {
    public Student(String firstName, String lastName, String patronymic, Sex sex) {
        super(firstName, lastName, patronymic, sex);
    }
}
