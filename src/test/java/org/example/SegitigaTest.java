package org.example;

import org.junit.Assert;
import org.junit.Test;

public class SegitigaTest {

    @Test
    public void luassegitiga(){
        Segitiga segitiga=new Segitiga(10,8);
        double luas=segitiga.getluas();
        double expexted=40;
        Assert.assertEquals(expexted,luas,0);



    }
}
