import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class WielomianTest{
    public WielomianTest(){

    }

    @Test
    public void testKonstruktorpojedynczy(){
        Wielomian tmp = new Wielomian(4.0);
        assertEquals(tmp.toString(), "4.0x^2");
    }

    @Test
    public void testKonstruktorpodwojny(){
        Wielomian tmp = new Wielomian(4.0, 3.0);
        assertEquals(tmp.toString(), "4.0x^2 + 3.0x");

    }

    @Test
    public void testKonstruktorpotrojny(){
        Wielomian tmp = new Wielomian(4.0, 3.0, 5.0);
        assertEquals(tmp.toString(), "4.0x^2 + 3.0x + 5.0");

    }

    @Test
    public void testsetABC1(){
        Wielomian tmp1 = new Wielomian(4.0);
        tmp1.setABC(4.0, 5.0, 6.0);
        assertEquals(tmp1.toString(), "4.0x^2 + 5.0x + 6.0");
    }

    @Test
    public void testsetABC2(){
        Wielomian tmp2 = new Wielomian(8.0);
        tmp2.setABC(3.0, 7.0, 2.0);
        assertEquals(tmp2.toString(), "3.0x^2 + 7.0x + 2.0");
    }

    @Test
    public void testgetAtX1(){
        Wielomian tmp1 = new Wielomian(4.0);
        tmp1.setABC(4.0, 5.0, 6.0);
        assertEquals(tmp1.getAtX(1.0), 15.0);
    }

    @Test
    public void testgetAtX2(){
        Wielomian tmp1 = new Wielomian(4.0);
        tmp1.setABC(2.0, 1.0, 3.0);
        assertEquals(tmp1.getAtX(2.0), 13.0);
    }
    @Test
    public void testintegral1(){
        Wielomian tmp1 = new Wielomian(4.0);
        tmp1.setABC(2.0, 1.0, 3.0);
        assertEquals(tmp1.integral(5.0, 3.0), 79.33333333333333);
    }

    @Test
    public void testintegral2(){
        Wielomian tmp1 = new Wielomian(4.0);
        tmp1.setABC(3.0, -1.0, -3.0);
        assertEquals(tmp1.integral(20.0, 5.0), 7642.5);
    }


    @Test
    public void testintegral3(){
        Wielomian tmp1 = new Wielomian(4.0);
        tmp1.setABC(3.5, -1.5, -3.5);
        assertEquals(tmp1.integral(5.0, -5.0), 256.667, 0.001);
    }

     @Test
    public void testintegral4(){
        Wielomian tmp1 = new Wielomian(4.0);
        tmp1.setABC(10.2, -12.0, 0.5);
        assertEquals(tmp1.integral(7.0, -5.0), 1453.2, 0.01);
    }








}