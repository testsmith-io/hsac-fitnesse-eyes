package nl.testsmith.fitnesse.fixture.slim;

import com.applitools.eyes.EyesRunner;
import com.applitools.eyes.selenium.ClassicRunner;
import com.applitools.eyes.selenium.Eyes;
import nl.hsac.fitnesse.fixture.Environment;
import nl.hsac.fitnesse.fixture.slim.SlimFixture;


/**
 * Fixture to integrate Applitools Eyes
 */
public class EyesFixture extends SlimFixture {

    private Eyes eyes;
    private EyesRunner runner;

    /**
     * Creates new fixture instance with "imaps" protocol.
     */
    public EyesFixture() {
        // Initialize the Runner for your test.
        runner = new ClassicRunner();

        // Initialize the eyes SDK
        eyes = new Eyes(runner);

    }

    public void eyesApiKey(String apiKey) {
        eyes.setApiKey(apiKey);
    }

    public void eyesOpen(String appName, String testName) {
        eyes.open(Environment.getInstance().getSeleniumHelper().driver(), appName, testName);
    }


    public void eyesCheckWindow(String tag) {
        eyes.checkWindow(tag);
    }

    public void eyesClose() {
        eyes.close();
    }

    public void eyesCloseAsync() {
        eyes.closeAsync();
    }

    public void eyesAbortIfNotClosed() {
        eyes.abortIfNotClosed();
    }

    public String eyesgetResults() {
        return runner.getAllTestResults().toString();
    }

}
