import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace3() {
    int[] input1 = {7,8,9,10};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{10,9,8,7}, input1);
  }

  @Test
  public void testReversedfour() {
    int[] input1 = {7,8,9,10};
    assertArrayEquals(new int[]{10,9,8,7}, ArrayExamples.reversed(input1));
  }
}
