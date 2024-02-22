import conversor.conversor; // Asegúrate de que esta ruta de importación es correcta
import org.junit.Test;
import static org.junit.Assert.assertEquals; // Actualizado para JUnit 4

/**
 * Test class for conversor.
 */
public class conversorTest {

    public conversorTest() {
    }

    /**
     * Test of main method, of class conversor.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] argumentos = null;
        conversor.main(argumentos);
        // Test sin aserción ya que solo verifica la ejecución
    }

    /**
     * Test of celsiusAFahrenheit method, of class conversor.
     */
    @Test
    public void testCelsiusAFahrenheit() {
        System.out.println("celsiusAFahrenheit");
        float celsius = 0.0f;
        float expResult = 32.0f;
        float result = conversor.celsiusAFahrenheit(celsius);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of fahrenheitACelsius method, of class conversor.
     */
    @Test
    public void testFahrenheitACelsius() {
        System.out.println("fahrenheitACelsius");
        float fahrenheit = 32.0f; // Cambiado a 32.0f para tener un caso de prueba más representativo
        float expResult = 0.0f; // Cambiado para coincidir con el valor esperado de conversión
        float result = conversor.fahrenheitACelsius(fahrenheit);
        assertEquals(expResult, result, 0.1); // Se permite un pequeño margen de error
    }

}

