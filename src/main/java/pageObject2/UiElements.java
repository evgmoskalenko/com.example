package pageObject2;

import org.openqa.selenium.WebElement;

interface UiElements {

    void tap(WebElement element);

    void typeInField(WebElement element, String text);

}
