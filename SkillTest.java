import static org.junit.Assert.*;
import org.junit.*;

public class SkillTest {
    @Test
    public void testSubtract() {
        assertEquals("Subtracted correctly", 1, Skill.subtract(5, 3));
    }
}
