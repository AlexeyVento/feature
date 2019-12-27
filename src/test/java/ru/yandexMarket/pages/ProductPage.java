package ru.yandexMarket.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;

public class ProductPage {

    private static Logger log = LogManager.getLogger("Товар");

    SelenideElement product;
    SelenideElement maker;
    String makerName;

    static SelenideElement randomElement(List<SelenideElement> list) {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));

    }

    @Step("Проверяем корректное отображение блока Ограничения цены")
    public void blockPriceLimit() {
        $x("//fieldset[@class=\"_38PayafmjD\"]").shouldBe(Condition.visible);
    }

    @Step("Проверяем корректное отображение блока Ограничения цены")
    public void buyOnCredit() {
        $x("//legend[@class=\"hYXlmo2ZWk\"]").shouldBe(Condition.visible);
    }

    @Step("Проверяем корректное отображение чекбокса В продаже")
    public void checkboxOnSale() {
        $x("//fieldset[@data-autotest-id=\"onstock\"]").shouldBe(Condition.visible);
    }

    @Step("Проверяем корректное отображение блока Производитель")
    public void blockMaker() {
        $x("//fieldset[@data-autotest-id=\"7893318\"]").shouldBe(Condition.visible);
    }

    @Step("Проверяем корректное отображение блока Рейтинг магазина")
    public void blockStoreRating() {
        $x("//fieldset[@class=\"_2uSu7TQsMO\"]").shouldBe(Condition.visible);
    }

    @Step("Проверяем корректное отображение блока Способ доставки")
    public void blockDeliveryMethod() {
        $x("//fieldset[@class=\"_2qWuY12N6f\"]").shouldBe(Condition.visible);
    }

    @Step("Проверяем корректное отображение блока Способ оплаты")
    public void blockPaymentMethod() {
        $x("//fieldset[@data-autotest-id=\"payments\"]").shouldBe(Condition.visible);
    }

    @Step("Проверяем корректное отображение блока Магазины")
    public void blockShops() {
        $x("//fieldset[@data-autotest-id=\"fesh\"]").shouldBe(Condition.visible);
    }

    @Step("Проверяем, что у каждого товара присутствует цена")
    public void checkBlocksProductPrice() {
        $x("//div[contains(@class,\"price\")]").shouldBe(Condition.visible);
    }

    @Step("Проверяем, что у каждого товара присутствует кнопка предложений магазинов")
    public void checkBlocksStoreOffer() {
        $x("//div[contains(@class=\"link n-link_theme_blue i-bem link_type_prices link_js_inited\")]").shouldBe(Condition.visible);
    }

    @Step("Проверяем, что у каждого товара присутствуют отзывы")
    public void checkBlocksProductComment() {
        $x("//div[contains(@class=\"n-badge-review__link\")]").shouldBe(Condition.visible);
    }

    @Step("Наводим курсор на произвольный товар")
    public void randomProduct() {
        product = randomElement($$(By.xpath("//div[@class=\"n-snippet-list n-snippet-list_type_vertical metrika b-zone b-spy-init b-spy-events i-bem metrika_js_inited snippet-list_js_inited b-spy-init_js_inited b-zone_js_inited\"]")));
        product.scrollTo().hover();
    }

    @Step("Проверяем корректное отображение кнопки Добавить в избранное")
    public void buttonAddFavorite() {
        $x("//i[@class=\"image image_name_favorite\"]").shouldBe(Condition.visible);
    }

    @Step("Добавляем товар в избранное")
    public void clickButtonFavorite() {
        $x("//a[@class=\"n-product-toolbar__item link link_theme_minor wishlist-control wishlist-control_type_toggle pseudo-checkbox hint b-zone b-spy-events i-bem pseudo-checkbox_js_inited hint_js_inited wishlist-control_js_inited metrika_js_inited link_js_inited _popup2-destructor _popup2-destructor_js_inited b-zone_js_inited b-spy-events_js_inited\"]").click();
    }

    @Step("Проверяем наличие уведомления о добавлении товара в избранное")
    public void notificationAddFavorite() {
        $x("//div[@class=\"popup-informer__content\"]").shouldBe(Condition.visible);
    }

    @Step("Активируем флажок В продаже")
    public void clickCheckboxOnSale() {
        $x("//div[@class=\"LhMupC0dLR\"]").click();
    }


    @Step("Устанавливаем максимальную цену ")
    public void setMaxPrice() throws InterruptedException {
        SelenideElement priceFrom = $x("//input[@id='glpriceto']");
        $x("//input[@id='glpricefrom']").setValue(priceFrom.getAttribute("placeholder")).pressEnter();
        Thread.sleep(5000);

    }

    @Step("Очищаем фильтр до")
    public void setMaxPriceClear() throws InterruptedException {
        $x("//button[@aria-label=\"Очистить поле Цена до\"]").click();
        Thread.sleep(5000);
    }

    @Step("Выбираем произвольного производителя")
    public void selectMaker() {
        try {
            maker = randomElement($$(By.xpath("//legend[text()='Производитель']/..//label")));
            makerName = maker.getText();
            maker.click();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }


}
