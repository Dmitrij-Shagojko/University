package repository;

import model.Teacher;
import util.AgeTeacherUtil;

import java.util.ArrayList;

public class TeacherRepository {
    public ArrayList<Teacher> teachers;

    public TeacherRepository() {
        this.teachers = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addTeacherAll(ArrayList<Teacher> listAllTeachers) {
        teachers.addAll(listAllTeachers);
    }

    public void deleteTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    public void setTeacher(int pos, Teacher teacher) {
        teachers.set(pos, teacher);
    }
}
