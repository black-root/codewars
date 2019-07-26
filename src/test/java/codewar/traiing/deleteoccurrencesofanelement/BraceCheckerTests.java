/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewar.traiing.deleteoccurrencesofanelement;

import static org.junit.Assert.*;
import org.junit.Test;

public class BraceCheckerTests {

    private BraceChecker checker = new BraceChecker();
    /*
     @Test
     public void testValid() {
     assertEquals(true, checker.isValid("()"));
     }
     */

    @Test
    public void testValid2() {
        assertEquals(true, checker.isValid("[{}()]"));
    }
    /* 
     @Test
     public void testValid3() {
     assertEquals(true, checker.isValid("[{}([])]"));
     }

     @Test
     public void testInvalid() {
     assertEquals(false, checker.isValid("}(])"));
     }

     @Test
     public void testInvalid2() {
     assertEquals(false, checker.isValid("[{}([])])"));
     }
     @Test
     public void testInvalid3() {
     assertEquals(false, checker.isValid("[{}([[)]"));
     }*/
}
