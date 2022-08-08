package org.example;

import org.junit.Assert;
import org.junit.Test;

public class KalkulatorTest {
    @Test
    public void testPerkalian(){
        Kalkulator kalkulator=new Kalkulator(3,6);
        Assert.assertEquals(18,kalkulator.gethasilperkalian());
    }
}
