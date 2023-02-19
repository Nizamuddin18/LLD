package BuilderDesignPattern.Director;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Aircraft {
    private String engine;    // engine tyoe
    private double wings;     // wings size
    private double cockpit;   // cockpit size in sq-ft
    private int bathrooms;    // number of bathrooms
}
