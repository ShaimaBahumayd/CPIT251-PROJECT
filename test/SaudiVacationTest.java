/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shaim
 */
public class SaudiVacationTest {
    
    public SaudiVacationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class SaudiVacation.
     */
    @Test
    public void testMain() {
        //System.out.println("main");
        //String[] args = null;
       // SaudiVacation.main(args);
        
        
    }
    @Test
    public void testCheckCityName() {
        
        String cityName= "JEDDAH";
        SaudiVacation r = new SaudiVacation();
        String exCityName= r.checkCityName("JEDDAH");
        assertEquals(cityName, exCityName);
    }


}
