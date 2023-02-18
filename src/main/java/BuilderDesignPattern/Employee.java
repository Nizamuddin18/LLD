package BuilderDesignPattern;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Employee {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String primaryEmail;
    private final String secondaryEmail;
    private final String primaryMobileNumber;
    private final String secondaryMobileNumber;

    public Employee(EmployeeBuilder employeeBuilder) {
        this.firstName = employeeBuilder.getFirstName();
        this.middleName = employeeBuilder.getMiddleName();
        this.lastName = employeeBuilder.getLastName();
        this.primaryEmail = employeeBuilder.getPrimaryEmail();
        this.secondaryEmail = employeeBuilder.getSecondaryEmail();
        this.primaryMobileNumber = employeeBuilder.getPrimaryMobileNumber();
        this.secondaryMobileNumber = employeeBuilder.getSecondaryMobileNumber();
    }
}
