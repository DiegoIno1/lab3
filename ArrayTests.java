import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    int[] input2 = { 3, 5, 0 };
    int[] expectedOutput = {0, 5, 3};
    ArrayExamples.reverseInPlace(input1);
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 3 }, input1);
    assertArrayEquals(expectedOutput, input2);
	}

 

  @Test
  public void testReversed() {
    int[] input1 = { };
    int[] input2 = { 3, 5, 0 };
    int[] expectedOutput = {0, 5, 3};
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(expectedOutput, ArrayExamples.reversed(input2));
  }

}
