package BuilderDesignPattern;

public class DriverClass {
    public static void main(String[] args) {
        //Creating object using Builder pattern in java
        Cake whiteCake = new Cake.Builder()
                .sugar(1)
                .butter(0.5)
                .eggs(2)
                .flour(1.5)
                .bakingpowder(0.75)
                .milk(0.5)
                .build();

        //Cake is ready to eat :)
        System.out.println(whiteCake);

        //Creating object using Builder pattern in java
        Employee employee = new EmployeeBuilder()
                .firstName("Nizamuddin")
                .lastName("Ahmed")
                .primaryEmail("nizahmed@abc.com")
                .primaryMobileNumber("1234567890")
                .build();

        // Printing employee
        System.out.println(employee);
    }
}
