import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by User on 3/24/2017.
 */
public class GradingStudentsTest {
    @Test
    public void getFinalGrade() throws Exception {

            int[] expected = {75,67,40,33};
            int[] source= {73,67,38,33};
            assertArrayEquals(GradingStudents.getFinalGrade(source), expected);
        }
    }

