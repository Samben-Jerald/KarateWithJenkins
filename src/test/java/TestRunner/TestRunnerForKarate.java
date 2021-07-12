package TestRunner;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;

public class TestRunnerForKarate {

	@Test
    public void testParallel() {
        Results results = Runner.path("classpath:Feature").tags("@Sample").parallel(5);
        assertTrue(results.getErrorMessages(), results.getFailCount() == 0);
    }
	

}
