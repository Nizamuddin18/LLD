package BuilderDesignPattern;

import lombok.Getter;

@Getter
public class EmployeeBuilder implements IEmployeeBuilder {
    private String firstName;
    private String middleName;
    private String lastName;
    private String primaryEmail;
    private String secondaryEmail;
    private String primaryMobileNumber;
    private String secondaryMobileNumber;

    public Employee build() {
        return new Employee(this);
    }

    @Override
    public IEmployeeBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public IEmployeeBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public IEmployeeBuilder middleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    @Override
    public IEmployeeBuilder primaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
        return this;
    }

    @Override
    public IEmployeeBuilder secondaryEmail(String secondaryEmail) {
        this.secondaryEmail = secondaryEmail;
        return this;
    }

    @Override
    public IEmployeeBuilder primaryMobileNumber(String primaryMobileNumber) {
        this.primaryMobileNumber = primaryMobileNumber;
        return this;
    }

    @Override
    public IEmployeeBuilder secondaryMobileNumber(String secondaryMobileNumber) {
        this.secondaryMobileNumber = secondaryMobileNumber;
        return this;
    }
}
