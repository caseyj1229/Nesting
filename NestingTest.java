import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NestingTest {
    @Test
    void solution() {
        String S1 = "(()(())())";
        assertEquals(1,Nesting.solution(S1));

        String S2 = "((()))))))))))))))";
        assertEquals(0,Nesting.solution(S2));

        String S3 = "(U)";
        assertEquals(1,Nesting.solution(S3));
    }
}