package Automation;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class FirstTest {
    @Test
    public void test(){
        Configuration.browser= "Chrome";
        Selenide.open("https://redmed.ge/ka/user/register");
        Configuration.browser = "1920x1080";
        $("#userName").setValue("Gvantsa");
        $("#lastName").setValue("Shanava");
        $("#mobileNumber").setValue("579830707");
        $("#email").setValue("gv.shanava@gmail.com");
        $("#terms").click();
        $("#user-registration-button").click();





    }
}
