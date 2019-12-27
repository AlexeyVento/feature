package ru.yandexMarket.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;

public class HomeAppliances {

    private static Logger log = LogManager.getLogger("Бытовая техника");
    List<SelenideElement> categoriesList;

    @Step("Проверяем корректное отображение блока Популярные категории")
    public void blockPopularCategories() {
        $x("(//div[@class=\"section N9o4gAuSnb ej2vn2CdLz qUW8qep9Rv _2n8U4OismH\"])[1]").shouldBe(Condition.visible);
    }

    @Step("Проверяем корректное отображение блока Популярные товары")
    public void blockPopularProducts() {
        $x("(//div[@data-zone-name=\"ScrollBox\"])[1]").shouldBe(Condition.visible);
    }

    @Step("Проверяем корректное отображение блока Скидки")
    public void blockDiscount() {
        $x("(//div[@data-zone-name=\"ScrollBox\"])[2]").shouldBe(Condition.visible);
    }

    @Step("Проверяем корректное отображение блока Популярные отзывы")
    public void blockPopularComments() {
        $x("//div[@class=\"MjXb8xWfBe\"]").shouldBe(Condition.visible);
    }

    @Step("Проверяем корректное отображение подкатегории блока Популярные отзывы")
    public void blockPopularCommentsSubcategory() {
        $x("//div[@class=\"_47Yo37mG9I\"]").shouldBe(Condition.visible);
    }

    @Step("Выбираем произвольную подкатегорию")
    public void randomCategories() {
        categoriesList = $$(By.xpath("//div[@data-452ecda2=\"true\"]/div"));
        categoriesList.get(1).click();
    }
}

