import org.junit.Test;
import static org.junit.Assert.*;

public class ConcessionariaTest {
    @Test
    public void testConstruirVeiculos() {
        Veiculo suv = new SUV();
        Veiculo hatch = new Hatch();
        Veiculo sedan = new Sedan();

        Montadora ford = new Ford(suv);
        Montadora chevrolet = new Chevrolet(hatch);
        Montadora volkswagen = new Volkswagen(sedan);

        ford.montar();
        chevrolet.montar();
        volkswagen.montar();
    }
}