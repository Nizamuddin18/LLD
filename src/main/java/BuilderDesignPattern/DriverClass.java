package BuilderDesignPattern;

import BuilderDesignPattern.Director.Aircraft;
import BuilderDesignPattern.Director.AircraftDirector;
import BuilderDesignPattern.Director.Boeing747Builder;
import BuilderDesignPattern.Director.F16Builder;

public class DriverClass {
    public static void main(String[] args) {
        //Creating object using Builder pattern in java -> static Inner Class
        Cake whiteCake = new Cake.Builder()
                .sugar(1)
                .butter(0.5)
                .eggs(2)
                .flour(1.5)
                .bakingpowder(0.75)
                .milk(0.5)
                .build();

        System.out.println(whiteCake);

        //Creating object using Builder pattern in java -> Interface Method
        Employee employee = new EmployeeBuilder()
                .firstName("Nizamuddin")
                .lastName("Ahmed")
                .primaryEmail("nizahmed@abc.com")
                .primaryMobileNumber("1234567890")
                .build();

        System.out.println(employee);

        //Creating object using Builder pattern in java -> Interface Method with Director
        Aircraft aircraft = new AircraftDirector(new F16Builder()).build();
        System.out.println(aircraft);
    }
}
