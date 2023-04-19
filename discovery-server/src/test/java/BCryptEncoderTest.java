import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.junit.Assert.assertTrue;

@Testcontainers
public class BCryptEncoderTest {

    @Test
    public void testBCrypt(){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);
        String result = encoder.encode("password");
        System.out.println("BSTRING: " + result);
        assertTrue(encoder.matches("password", result));
    }
}
