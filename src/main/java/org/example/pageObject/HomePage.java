package org.example.pageObject;

import dev.failsafe.internal.util.Assert;
import org.example.pageObject.Helper.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends SeleniumHelper {


    By title=By.xpath("//div[@class='title']");
    By buttonByNow=By.xpath("//a[.='BUY NOW']");
    By inputPillow=By.xpath("//input[@class='text-right']");
    By inputName = By.xpath("//td[.='Name']/following-sibling::td/input");
    By inputEmail = By.xpath("//td[.='Email']/following-sibling::td/input");
    By inputPhoneNumber = By.xpath("//td[.='Phone no']/following-sibling::td/input");
    By inputCity = By.xpath("//td[.='City']/following-sibling::td/input");
    By inputAddress = By.xpath("//td[.='Address']/following-sibling::td/textarea");
    By inputPostalCode = By.xpath("//td[.='Postal Code']/following-sibling::td/input");
    By buttonCheckout = By.xpath("//div[@class='cart-checkout']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isDisplayed(){
        String homeTitle = driver.findElement(By.xpath("//div[@class='title']")).getText();
        return driver.findElement(title).isDisplayed();
    }

    public String getTitle(){
        return driver.findElement(title).getText();
    }
    public void clickBuyNow(){
        driver.findElement(buttonByNow).click();
    }
    public void textInputPillow(String pillow, String name, String email, String phoneNumber,
                                String city,String address, String postalCode) {
        setText(inputPillow,pillow);
        setText(inputName, name);
        setText(inputEmail, email);
        setText(inputPhoneNumber, phoneNumber);
        setText(inputCity, city);
        setText(inputAddress, address);
        setText(inputPostalCode, postalCode);
        driver.findElement(buttonCheckout).click();
    }

}

