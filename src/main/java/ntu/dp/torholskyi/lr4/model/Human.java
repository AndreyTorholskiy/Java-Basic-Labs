package ntu.dp.torholskyi.lr4.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Human {
    private String firstName;
    private String lastName;
    private String patronymic;
    private Sex sex;

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + patronymic + " (" + sex + ")";
    }
}
