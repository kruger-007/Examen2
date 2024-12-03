/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import cr.go.ucr.examen1.ComisionVenta;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ComisionVentaTest {
    @Test
    public void testCalculoComisionMinimoValido() {
        ComisionVenta comisionVenta = ComisionVenta.getCurrentInstance();
        double resultado = comisionVenta.calcular(1000.0);
        assertEquals(30.0, resultado, 0.01); // 3% de 1000
    }

    @Test
    public void testCalculoComisionRangoMedioValido() {
        ComisionVenta comisionVenta = ComisionVenta.getCurrentInstance();
        double resultado = comisionVenta.calcular(7000.0);
        assertEquals(840.0, resultado, 0.01); // 12% de 7000
    }

    @Test
    public void testCalculoComisionRangoAltoValido() {
        ComisionVenta comisionVenta = ComisionVenta.getCurrentInstance();
        double resultado = comisionVenta.calcular(25000.0);
        assertEquals(3750.0, resultado, 0.01); // 15% de 25000
    }

    @Test
    public void testCalculoComisionFueraDelRangoSuperior() {
        ComisionVenta comisionVenta = ComisionVenta.getCurrentInstance();
        double resultado = comisionVenta.calcular(150000.0);
        assertEquals(-1.0, resultado, 0.01); // Fuera de rango
    }

    @Test
    public void testCalculoComisionMontoNull() {
        ComisionVenta comisionVenta = ComisionVenta.getCurrentInstance();
        double resultado = comisionVenta.calcular(null);
        assertEquals(-1.0, resultado, 0.01); // Monto null
    }

    @Test
    public void testCalculoComisionMontoMenorAUmbral() {
        ComisionVenta comisionVenta = ComisionVenta.getCurrentInstance();
        double resultado = comisionVenta.calcular(0.1);
        assertEquals(-1.0, resultado, 0.01); // Monto demasiado bajo
    }
}
