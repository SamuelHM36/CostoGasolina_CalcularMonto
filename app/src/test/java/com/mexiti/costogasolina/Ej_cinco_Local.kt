package com.mexiti.costogasolina

import org.junit.Test
import java.text.NumberFormat
import org.junit.Assert.assertEquals

class Ej_cinco_Local {

    @Test
    fun calcularMonto40L_22_35(){

        val precio = 22.35
        val cantLitros = 40.0
        val darPropina = false
        val propina = 0.0

        val montoEsperado = NumberFormat.getCurrencyInstance().format(894.0)

        val montoActual = calcularMonto(precio,cantLitros,darPropina,propina)

        assertEquals(montoEsperado,montoActual)



    }
}