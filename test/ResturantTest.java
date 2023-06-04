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
public class ResturantTest {
    
   
    @Test
    public void testCheackDate() {
        System.out.println("cheackDate");
        Resturant rest = new Resturant(15, "NALO", "jeddah", "5", "sea food");
        boolean result = rest.cheackDate();
        assertTrue(result);
        
    }
    
}
