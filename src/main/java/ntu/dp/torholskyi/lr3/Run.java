package ntu.dp.torholskyi.lr3;

import ntu.dp.torholskyi.lr3.controller.*;
import ntu.dp.torholskyi.lr3.model.*;

import java.util.List;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.createTypicalUniversity();
    }

    public void createTypicalUniversity() {
        Human universityHead = new Head("Michael", "Anderson", "Smith", Sex.MALE);
        Human facultyHead = new Head("Sophia", "Miller", "Johnson", Sex.FEMALE);
        Human departmentHead = new Head("Christopher", "Brown", "Davis", Sex.MALE);
        Human groupHead = new Head("Daniel", "Wilson", "Thomas", Sex.MALE);

        List<Student> students = List.of(
                new Student("James", "Taylor", "Moore", Sex.MALE),
                new Student("Emily", "Harris", "Clark", Sex.FEMALE)
        );

        Group group = new GroupCreator().create("123m-24-1", groupHead, students);

        Department department = new DepartmentCreator().create("Computer Science", departmentHead, List.of(group));

        Faculty faculty = new FacultyCreator().create("Faculty of Engineering", facultyHead, List.of(department));

        University university = new UniversityCreator().create("NTU Politechic university", universityHead, List.of(faculty));

        System.out.println(university);
    }
}
