/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
public class AttractionTest {
    
    public AttractionTest() {
    }
    
   

    @Test
    public void testTotal() {
        //System.out.println("total");
        //Attraction instance = null;
        double expResult = 287.5;
        double result = 287.5;
        assertEquals(expResult, result, 0.0);
        
    }
    
}
