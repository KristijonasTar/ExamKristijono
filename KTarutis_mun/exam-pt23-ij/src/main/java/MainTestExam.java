import lt.techin.municipality.Municipality;
import lt.techin.municipality.TaxCalculator;
import lt.techin.municipality.TaxRateProvider;
import lt.techin.municipality.test.AbstractMunicipalityTest;
import org.junit.jupiter.api.Test;

public class MainTestExam extends AbstractMunicipalityTest {


    @Override
    public Municipality getMunicipality(TaxCalculator taxCalculator) {
        return new MyMainMunicipality();
    }

    @Override
    public TaxCalculator getTaxCalculator(TaxRateProvider taxRateProvider) {
        return null;
    }



//    @Test



}
