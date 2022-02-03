import static org.junit.Assert.*;
import org.junit.*;

public class SkillTest {
    @Test
    public void testSubtract() {
        assertEquals("Subtracted correctly", 2, Skill.subtract(5, 3));
    }
}
