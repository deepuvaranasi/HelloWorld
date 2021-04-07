import hello.HelloWorld;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {
 @Test
    public void testMethod(){
        HelloWorld helloWorld=new HelloWorld();
        String result = helloWorld.testMethod("xxx");
        assertEquals("xxx",result);
    }

}