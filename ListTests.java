import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


class StringCheckerThing implements StringChecker{
    @Override
    public boolean checkString(String s){
        if (s.equals("d")){
            return false;
        }
        return true;
    }
}

public class ListTests {
    @Test 
	public void testFilter() {
        List<String> input1 = Arrays.asList("a","b","c","d");
        StringChecker sc = new StringCheckerThing();
        List<String> expectedOutput = Arrays.asList("a", "b", "c");
        List<String> result = ListExamples.filter(input1, sc);;
        assertEquals(expectedOutput, result);
    }

    @Test 
	public void testMerge() {
    }
}