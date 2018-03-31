import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class TemperatureConverterTest {

    @Parameterized.Parameter(0)
    public double parameter;
    @Parameterized.Parameter(1)
    public double result;

    @Parameterized.Parameters(name="{index}:ConvertFtoC({0})={1}")
    public static Collection<Object[]> get1Data(){
        return Arrays.asList(new Object[][]{
                {5,-15},
                {77,25},
        });
    }

    @org.junit.Test
    public void convertFtoC() throws Exception {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double res = temperatureConverter.ConvertFtoC(parameter);
        assertEquals(result,res,0.0);
    }

    @org.junit.Test
    public void convertCtoF() throws Exception {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double res = temperatureConverter.ConvertCtoF(25);
        assertEquals(77,res,0.0);
    }

    @org.junit.Test
    public void convertCtoK() throws Exception {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double res = temperatureConverter.ConvertCtoK(36);
        assertEquals(309.2,res,0.01);
    }

    @org.junit.Test
    public void convertKtoC() throws Exception {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double res = temperatureConverter.ConvertKtoC(309.2);
        assertEquals(36,res,0.01);
    }

    @org.junit.Test
    public void convertFtoK() throws Exception {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double res = temperatureConverter.ConvertFtoK(20);
        assertEquals(266.5,res,0.01);
    }

    @org.junit.Test
    public void convertKtoF() throws Exception {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double res = temperatureConverter.ConvertKtoF(266.5);
        assertEquals(20,res,0.01);
    }

}