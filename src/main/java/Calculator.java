import javax.ejb.Remote;
import javax.ejb.Stateless;

@Remote
@Stateless
public class Calculator {
    public double add(double a, double b) {
        return a+b;
    }
}