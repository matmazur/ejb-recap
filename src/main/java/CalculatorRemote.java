import javax.ejb.Remote;

@Remote
public interface CalculatorRemote {
    public double add(double a, double b);
}