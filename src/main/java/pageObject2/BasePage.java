package pageObject2;

public class BasePage extends DriverHandler {

    protected UiElementsRe uiElementsRe;
    protected WaitRe waitRe;

    public BasePage() {
        uiElementsRe = new UiElementsRe();
        waitRe = new WaitRe();
    }
}
