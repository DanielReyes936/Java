package passwordvalidator;



import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Megha Patel
 * @author Daniel Reyes
 */
public class PasswordValidatorTest {
    
    public PasswordValidatorTest() {
    }

    @Before
    public void setUp() {
    }
    //GOOOD TEST
    
    /**
     * Test of checkLength method, of class PasswordValidator.
     */
    @Test
    public void testCheckLengthGood() {// > 8 characters
        System.out.println("checkLengthGood");
        String pass = "MyPassword@";
        boolean expResult = true;
        boolean result = PasswordValidator.checkLength(pass);
        assertEquals(expResult, result); //assertEquals compares actual result and expected result. if they match it returns true(test passed) otherwise false(test failed)
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    /**
     * Test of checkLength method, of class PasswordValidator.
     */
    @Test
    public void testCheckUppercaseCharsGood() {// > 8 characters
        System.out.println("testCheckUppercaseCharsGood");
        String pass = "Mypassword@";
        boolean expResult = true;
        boolean result = PasswordValidator.checkUppercaseChars(pass);
        assertEquals(expResult, result); //assertEquals compares actual result and expected result. if they match it returns true(test passed) otherwise false(test failed)
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
     /**
     * Test of checkLength method, of class PasswordValidator.
     */
    @Test
    public void testCheckspecialCharsGood() {// > 8 characters
        System.out.println("testCheckspecialCharsGood");
        String pass = "Mypassword@";
        boolean expResult = true;
        boolean result = PasswordValidator.checkspecialChars(pass);
        assertEquals(expResult, result); //assertEquals compares actual result and expected result. if they match it returns true(test passed) otherwise false(test failed)
        // TODO review the generated test code and remove the default call to fail.
        
    } 
    
    //BAD TEST
    
     @Test
    public void testCheckLengthBad() {  //< 8 characters
        System.out.println("checkLengthBad");
        String pass = "pass";
        boolean expResult = false;
        boolean result = PasswordValidator.checkLength(pass);
        assertEquals(expResult, result); //assertEquals compares actual result and expected result. if they match it returns true(test passed) otherwise false(test failed)
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    
      @Test
    public void testCheckUppercaseCharsBad() {  //< 8 characters
        System.out.println("testCheckUppercaseCharsBad");
        String pass = "pass@";
        boolean expResult = false;
        boolean result = PasswordValidator.checkUppercaseChars(pass);
        assertEquals(expResult, result); //assertEquals compares actual result and expected result. if they match it returns true(test passed) otherwise false(test failed)
        // TODO review the generated test code and remove the default call to fail.
        
    }
       @Test
    public void testCheckspecialCharsBad() {  //< 8 characters
        System.out.println("testCheckspecialCharsBad");
        String pass = "Pass";
        boolean expResult = false;
        boolean result = PasswordValidator.checkspecialChars(pass);
        assertEquals(expResult, result); //assertEquals compares actual result and expected result. if they match it returns true(test passed) otherwise false(test failed)
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    //BOUNDARY TEST
     @Test
    public void testCheckLengthBoundary() { // = 8 characters
        System.out.println("checkLengthBoundary");
        String pass = "Password@";
        boolean expResult = true;
        boolean result = PasswordValidator.checkLength(pass);
        assertEquals(expResult, result); //assertEquals compares actual result and expected result. if they match it returns true(test passed) otherwise false(test failed)
        // TODO review the generated test code and remove the default call to fail.
        
    }
      @Test
    public void testCheckUppercaseCharsBoundary() { // = 8 characters
        System.out.println("checkLengthBoundary");
        String pass = "Password@";
        boolean expResult = true;
        boolean result = PasswordValidator.checkUppercaseChars(pass);
        assertEquals(expResult, result); //assertEquals compares actual result and expected result. if they match it returns true(test passed) otherwise false(test failed)
        // TODO review the generated test code and remove the default call to fail.
        
    }
      @Test
    public void testCheckspecialCharsBoundary() { // = 8 characters
        System.out.println("checkLengthBoundary");
        String pass = "Password@";
        boolean expResult = true;
        boolean result = PasswordValidator.checkspecialChars(pass);
        assertEquals(expResult, result); //assertEquals compares actual result and expected result. if they match it returns true(test passed) otherwise false(test failed)
        // TODO review the generated test code and remove the default call to fail.
    }
}

