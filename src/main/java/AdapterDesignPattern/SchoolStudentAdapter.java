package AdapterDesignPattern;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SchoolStudentAdapter implements Student {
    private SchoolStudent schoolStudent;

    @Override
    public String getFirstName() {
        return this.schoolStudent.getFirstName();
    }

    @Override
    public String getSurName() {
        return this.schoolStudent.getLastName();
    }

    @Override
    public String getEmail() {
        return this.schoolStudent.getEmailAddress();
    }
}
