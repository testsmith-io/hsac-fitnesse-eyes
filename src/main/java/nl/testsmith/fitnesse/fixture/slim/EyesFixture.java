package nl.testsmith.fitnesse.fixture.slim;

import com.applitools.eyes.EyesRunner;
import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.TestResultContainer;
import com.applitools.eyes.selenium.ClassicRunner;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.StitchMode;
import com.applitools.eyes.selenium.positioning.ImageRotation;
import nl.hsac.fitnesse.fixture.Environment;
import nl.hsac.fitnesse.fixture.slim.SlimFixture;
import nl.hsac.fitnesse.fixture.slim.SlimFixtureException;

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

    public void eyesOpen(String appName, String testName) {
        eyes.open(Environment.getInstance().getSeleniumHelper().driver(), appName, testName);
    }


    /**
     * Check Element
     */
    public void eyesCheckElement(String place) {
        eyes.checkElement(Environment.getInstance().getSeleniumHelper().getElement(place));
    }

    public void eyesCheckElementAndTagIt(String place, String tag) {
        eyes.checkElement(Environment.getInstance().getSeleniumHelper().getElement(place), tag);
    }

    public void eyesCheckElementAndTagItWithMatchTimeout(String place, String tag, int matchTimeout) {
        eyes.checkElement(Environment.getInstance().getSeleniumHelper().getElement(place), matchTimeout, tag);
    }

    /**
     * Check Window
     */
    public void eyesCheckWindow() {
        eyes.checkWindow();
    }

    public void eyesCheckWindowAndTagIt(String tag) {
        eyes.checkWindow(tag);
    }

    public void eyesCheckWindowFullpageAndTagIt(String tag) {
        eyes.checkWindow(tag, true);
    }

    public void eyesCheckWindowAndTagItWithMatchTimeout(String tag, int matchTimeout) {
        eyes.checkWindow(matchTimeout, tag);
    }

    /**
     * Check Region
     */
    public void eyesCheckRegion(String place) {
        eyes.checkRegion(Environment.getInstance().getSeleniumHelper().getElement(place));
    }

    public void eyesCheckRegionAndDoNotStitchContent(String place) {
        eyes.checkRegion(Environment.getInstance().getSeleniumHelper().getElement(place), false);
    }

    public void eyesCheckRegionAndTagIt(String place, String tag) {
        eyes.checkRegion(Environment.getInstance().getSeleniumHelper().getElement(place), tag);
    }

    public void eyesCheckRegionAndTagItAndDoNotStitchContent(String place, String tag) {
        eyes.checkRegion(Environment.getInstance().getSeleniumHelper().getElement(place), tag, false);
    }

    public void eyesCheckRegionAndTagItWithMatchTimeout(String place, String tag, int matchTimeout) {
        eyes.checkRegion(Environment.getInstance().getSeleniumHelper().getElement(place), matchTimeout, tag);
    }

    public void eyesCheckRegionAndTagItWithMatchTimeoutAndDoNotStitchContent(String place, String tag, int matchTimeout) {
        eyes.checkRegion(Environment.getInstance().getSeleniumHelper().getElement(place), matchTimeout, tag, false);
    }

    /**
     * Getters
     */

    public String eyesGetAgentId() {
        return eyes.getAgentId();
    }

    public String eyesGetApiKey() {
        return eyes.getApiKey();
    }

    public String eyesGetAppName() {
        return eyes.getAppName();
    }

    public String eyesGetBaselineBranchName() {
        return eyes.getBaselineBranchName();
    }

    public String eyesGetBaselineEnvName() {
        return eyes.getBaselineEnvName();
    }

    public String eyesGetBatch() {
        return eyes.getBatch().toString();
    }

    public String eyesGetBranchName() {
        return eyes.getBranchName();
    }

    public String eyesGetConfiguration() {
        return eyes.getConfiguration().toString();
    }

    public String eyesGetDebugScreenshotsPath() {
        return eyes.getDebugScreenshotsPath();
    }

    public String eyesGetDebugScreenshotsPrefix() {
        return eyes.getDebugScreenshotsPrefix();
    }

    public double eyesGetDevicePixelRatio() {
        return eyes.getDevicePixelRatio();
    }

    public boolean eyesGetForceFullPageScreenshot() {
        return eyes.getForceFullPageScreenshot();
    }

    public boolean eyesGetHideCaret() {
        return eyes.getHideCaret();
    }

    public boolean eyesGetHideScrollbars() {
        return eyes.getHideScrollbars();
    }

    public String eyesGetHostApp() {
        return eyes.getHostApp();
    }

    public String eyesGetHostOs() {
        return eyes.getHostOS();
    }

    public boolean eyesGetIgnoreCaret() {
        return eyes.getIgnoreCaret();
    }

    public boolean eyesGetIsDisabled() {
        return eyes.getIsDisabled();
    }

    public boolean eyesGetIsOpen() {
        return eyes.getIsOpen();
    }

    public int eyesGetMatchTimeout() {
        return eyes.getMatchTimeout();
    }

    public String eyesGetParentBranchName() {
        return eyes.getParentBranchName();
    }

    public String eyesGetProxy() {
        try {
            return eyes.getProxy().toString();
        } catch (NullPointerException e) {
            throw new SlimFixtureException(false, "Proxy not set.");
        }
    }

    public int eyesGetRotation() {
        try {
            return eyes.getRotation().getRotation();
        } catch (NullPointerException e) {
            throw new SlimFixtureException(false, "Rotation not set.");
        }
    }

    public boolean eyesGetSaveDebugScreenshots() {
        return eyes.getSaveDebugScreenshots();
    }

    public boolean eyesGetSaveDiffs() {
        return eyes.getSaveDiffs();
    }

    public boolean eyesGetSaveNewTests() {
        return eyes.getSaveNewTests();
    }

    public double eyesGetScaleRatio() {
        return eyes.getScaleRatio();
    }

    public boolean eyesGetScrollToRegion() {
        return eyes.getScrollToRegion();
    }

    public String eyesGetServerUrl() {
        return eyes.getServerUrl().toString();
    }

    public String eyesGetStitchMode() {
        return eyes.getStitchMode().toString();
    }

    public int eyesGetStitchOverlap() {
        return eyes.getStitchOverlap();
    }

    public String eyesGetViewportSize() {
        return eyes.getViewportSize().toString();
    }

    public int eyesGetWaitBeforeScreenshots() {
        return eyes.getWaitBeforeScreenshots();
    }

    public boolean eyesIsSendDom() {
        return eyes.isSendDom();
    }

    /**
     * Setters
     */
    public void eyesSetValueForAgentId(String agentId) {
        eyes.setAgentId(agentId);
    }

    public void eyesSetValueForApiKey(String apiKey) {
        eyes.setApiKey(apiKey);
    }

    public void eyesSetValueForAppName(String appName) {
        eyes.setAppName(appName);
    }

    public void eyesSetValueForBaselineBranchName(String baselineBranchName) {
        eyes.setBranchName(baselineBranchName);
    }

    public void eyesSetValueForBaselineEnvName(String baselineEnvName) {
        eyes.setBaselineEnvName(baselineEnvName);
    }

    //    setBatch()
    public void eyesSetValueForBranchName(String branchName) {
        eyes.setBranchName(branchName);
    }

    //    setConfiguration()
    public void eyesSetValueForDebugScreenshotsPath(String pathToSave) {
        eyes.setDebugScreenshotsPath(pathToSave);
    }

    public void eyesSetValueForDebugScreenshotsPrefix(String prefix) {
        eyes.setDebugScreenshotsPrefix(prefix);
    }

    public void eyesSetValueXForExplicitViewportSize(int width, int height) {
        eyes.setExplicitViewportSize(new RectangleSize(width, height));
    }

    public void eyesSetValueForForceFullPageScreenshot(boolean shouldForce) {
        eyes.setForceFullPageScreenshot(shouldForce);
    }

    public void eyesSetValueForHideCaret(boolean hideCaret) {
        eyes.setHideCaret(hideCaret);
    }

    public void eyesSetValueForHideScrollbars(boolean shouldHide) {
        eyes.setHideScrollbars(shouldHide);

    }

    public void eyesSetValueForHostApp(String hostApp) {
        eyes.setHostApp(hostApp);

    }

    public void eyesSetValueForHostOs(String hostOs) {
        eyes.setHostOS(hostOs);

    }

    public void eyesSetValueForIgnoreCaret(boolean ignoreCaret) {
        eyes.setIgnoreCaret(ignoreCaret);
    }

    public void eyesSetValueForIsDisabled(boolean isDisplayed) {
        eyes.setIsDisabled(isDisplayed);
    }

    public void eyesSetValueForMatchLevel(String level) {
        switch (level.toLowerCase()) {
            case "content":
                eyes.setMatchLevel(MatchLevel.CONTENT);
                break;
            case "exact":
                eyes.setMatchLevel(MatchLevel.EXACT);
                break;
            case "layout":
                eyes.setMatchLevel(MatchLevel.LAYOUT);
                break;
            case "layout2":
                eyes.setMatchLevel(MatchLevel.LAYOUT2);
                break;
            case "none":
                eyes.setMatchLevel(MatchLevel.NONE);
                break;
            default:
                throw new SlimFixtureException(false, "Match level unknown.");
        }
    }


    public void eyesSetValueForMatchTimeout(int ms) {
        eyes.setMatchTimeout(ms);
    }

    public void eyesSetValueForParentBranchName(String branchName) {
        eyes.setParentBranchName(branchName);

    }
//    setProxy()

    public void eyesSetValueForRotation(int rotation) {
        eyes.setRotation(new ImageRotation(rotation));
    }

    public void eyesSetValueForSaveDebugScreenshots(boolean saveDebugScreenshots) {
        eyes.setSaveDebugScreenshots(saveDebugScreenshots);
    }

    public void eyesSetValueForSaveDiffs(boolean saveDiffs) {
        eyes.setSaveDiffs(saveDiffs);
    }

    public void eyesSetValueForSaveNewTests(boolean saveNewTests) {
        eyes.setSaveNewTests(saveNewTests);
    }

    public void eyesSetValueForScaleRatio(double scaleRation) {
        eyes.setScaleRatio(scaleRation);
    }

    public void eyesSetValueForScrollToRegion(boolean shouldScroll) {
        eyes.setScrollToRegion(shouldScroll);
    }

    public void eyesSetValueForSendDom(boolean isSendDom) {
        eyes.setSendDom(isSendDom);
    }

    public void eyesSetValueForServerUrl(String serverUrl) {
        eyes.setServerUrl(serverUrl);
    }

    public void eyesSetValueForStitchMode(String stitchMode) {
        switch (stitchMode.toLowerCase()) {
            case "css":
                eyes.setStitchMode(StitchMode.CSS);
                break;
            case "scroll":
                eyes.setStitchMode(StitchMode.SCROLL);
                break;
            default:
                throw new SlimFixtureException(false, "Stitch mode unknown.");
        }
    }

    public void eyesSetValueForStitchOverlap(int pixels) {
        eyes.setStitchOverlap(pixels);
    }

    public void eyesSetValueXForViewportSize(int width, int height) {
        try {
            eyes.setViewportSize(Environment.getInstance().getSeleniumHelper().driver(), new RectangleSize(width, height));
        } catch (Exception e) {
            throw new SlimFixtureException(false, e.getMessage());
        }
    }

    public void eyesSetValueForWaitBeforeScreenshots(int waitBeforeScreenshots) {
        eyes.setWaitBeforeScreenshots(waitBeforeScreenshots);
    }

    public void eyesClose() {
        eyes.close();
    }

    public void eyesCloseWithException() {
        eyes.close(true);
    }

    public void eyesCloseAsync() {
        eyes.closeAsync();
    }

    public void eyesAbort() {
        eyes.abort();
    }

    public void eyesAbortAsync() {
        eyes.abortAsync();
    }

    public void eyesAbortIfNotClosed() {
        eyes.abortIfNotClosed();
    }

    public String eyesGetResults() {
        for (TestResultContainer result : runner.getAllTestResults()) {
            System.out.println(result.toString());
        }
        return "";
    }

}
