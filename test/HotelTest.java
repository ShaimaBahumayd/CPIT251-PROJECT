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
public class HotelTest {
    
    public HotelTest() {
    }
    
   
    @Test
    public void testCheckHotel() {
        System.out.println("checkHotel");
        Hotel instance = new Hotel(9);
        boolean result = instance.checkHotel();
       assertFalse(result);
    }
    
}
