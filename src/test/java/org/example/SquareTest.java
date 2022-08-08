package org.example;
import org.junit.Assert;
import org.junit.Test;

public class SquareTest {
    @Test
    public void luasPersegi(){
        Square square=new Square(5);
        Assert.assertEquals(25,square.getLuas());
    }
    @Test
    public void testluaspersegi(){
        Square square=new Square(3);
        Assert.assertEquals(9,square.getLuas());
    }
}