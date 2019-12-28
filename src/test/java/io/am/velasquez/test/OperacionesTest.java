package io.am.velasquez.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

public class OperacionesTest {

    private Operaciones op;

        @Before
        public void setup() {
            op = new Operaciones();
        }

    @Test
    public void sumaTest(){

        Assert.assertEquals("la suma es igual: ", 11, op.sumar(5,6));
    }

    @Test
    public void podriaHacerRestaTest(){

        Assert.assertEquals("la resta no corresponde al resultado ", 10, op.restar(14, 4));
    }
    @Test
    public void podriaMultiplicarTest(){

        Assert.assertEquals("la multiplicación no corresponde al resultado", 20,op.multiplicar(5, 4));
    }
    @Test
    public void podriaDividir(){

        Assert.assertEquals("la división no corresponde al resultado: ", 10, op.dividir(20,2));
    }
}
