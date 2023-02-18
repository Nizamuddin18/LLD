package BuilderDesignPattern;

public interface IEmployeeBuilder {
    IEmployeeBuilder firstName(String firstName);

    IEmployeeBuilder lastName(String lastName);

    IEmployeeBuilder middleName(String middleName);

    IEmployeeBuilder primaryEmail(String primaryEmail);

    IEmployeeBuilder secondaryEmail(String secondaryEmail);

    IEmployeeBuilder primaryMobileNumber(String primaryMobileNumber);

    IEmployeeBuilder secondaryMobileNumber(String secondaryMobileNumber);

    Employee build();
}

