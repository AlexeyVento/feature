package ru.yandexMarket.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Condition.visible;



public class MainPage {

    private static Logger log = LogManager.getLogger("Яндекс-маркет");

    @Step("Открываем главную страницу market.yandex.ru")
    public MainPage open() {
        Selenide.open("https://market.yandex.ru/");
        return this;
    }

    @Step("Проверяем корректное отображение строки поиска")
    public void searchString () {
        $x("//input[@id='header-search").shouldBe(Condition.visible);
    }

    @Step("Проверяем корректное отображение верхнего баннера с акциями")
    public void topSharesBanner () {
        $x("//div[@data-zone-name=\"HeadBanner\"]").shouldBe(Condition.visible);
    }

    @Step("Проверяем корректное отображение основного баннера с акциями")
    public void mainSharesBanner () {
        $x("//div[@data-zone-name=\"Banner\"]").shouldBe(Condition.visible);
    }

    @Step("Проверяем корректное отображение блока рекомендуемые товары")
    public void blockRecommendedProducts () {
        $x("//div[@class=\"MjXb8xWfBe\"]").shouldBe(Condition.visible);
    }

    @Step("Проверяем корректное отображение блока Журнал маркета")
    public void blockMarketJournal () {
        $x("div[@class=\"section N9o4gAuSnb _2Q-c7mbjYB qUW8qep9Rv _2n8U4OismH\"]").shouldBe(Condition.visible);
    }

    @Step("Проверяем корректное отображение блока отзывы на лучшие товары")
    public void blockBestProducts () {
        $x("//div[@class=\"_1GSOvmx-M3\"]").shouldBe(Condition.visible);
    }

    @Step("Проверяем корректное отображение блока популярные бренды")
    public void blockPopularBrands () {
        $x("//div[@data-99046d6e]").shouldBe(Condition.visible);
    }

    @Step("Проверяем корректное отображение блока для подписки")
    public void blockSubscribtion () {
        $x("//div[@class=\"_3D6htd1jtQ\"]").shouldBe(Condition.visible);
    }

    @Step("Проверяем корректное отображение блока подвал")
    public void Footer () {
        $x("//div[@class=\"_2q2DD9y4s7\"]").shouldBe(Condition.visible);
    }

    @Step("Проверяем корректное отображение боковых баннеров на подборки")
    public void sideBar () {
        $x("//div[@class=\"_1tecGwJSpe _2kdONMDJ83 _1ijCawrKkG shape-rectangle _3epqZd-HQu\"]").shouldBe(Condition.visible);
        $x("//div[@class=\"_11ZmyTKxMC\"]").shouldBe(Condition.visible);
        $x("//div[@class=\"_26CWZS7U0I _2ibNOHjRbR\"]").shouldBe(Condition.visible);
    }

    int time = 5000;

    @Step("Выбираем сменить регион")
    public void clickChangeRegion() {
        $x("//div[@class=\"link header2-menu__item header2-menu__item_type_region header2-region region-form-opener i-bem n-region-popup-opener region-form-opener_js_inited\"]").waitUntil(visible, time).click();
    }

    @Step("Вводим город")
    public void enterCity(String city) {
        $x("//div[@class=\"input__control\"]").setValue(city).pressEnter().pressEnter();
    }

    @Step("Выбираем определять город автоматически")
    public void clickDetectAutomatically() {
        $x("//a[@class=\"link region-select-form__auto-definition\"]").waitUntil(visible,time).click();
    }

    @Step("Нажимаем: Да, спапсибо")
    public void yesThanks() {
        $x("//div[@class=\"n-region-notification__actions-cell\"]").click();
    }


    @Step("Выбираем меню Все категории")
    public void allCategories() {
        $x("//div[@class=\"n-w-tab n-w-tab_interaction_click-navigation-menu n-w-tab_type_navigation-menu-grouping i-bem n-w-tab_js_inited n-w-tab_interaction-active_no\"]").waitUntil(visible, time).click();
    }

    @Step("Проверяем корректное отображение блока Все категории")
    public void blockAllCategories() {
        $x("//div[@class=\"n-w-tab__content\"]").shouldBe(Condition.visible);
    }

    @Step("Наводим курсор на категорию Бытовая техника")
    public void homeAppliances() {
        $x("(//div//*[text()='Бытовая техника'])").waitUntil(visible, time).hover();
    }

    @Step("Проверяем корректное отображение блока Бытовая техника")
    public void blockHomeAppliances() {
        $x("//div[@class=\"n-w-tabs__content-column\"]").shouldBe(Condition.visible);
    }

    @Step("Выбираем категорию Бытовая техника")
    public void clickHomeAppliances() {
        $x("(//div//*[text()='Бытовая техника'])").waitUntil(visible, time).click();
    }

    @Step("Выбираем категорию Климатическая техника")
    public void clickClimateEquipment() {
        $x("//a[@class=\"link n-w-navigation-menu__node-link b-zone b-spy-events i-bem n-w-navigation-menu__node-link_level_second\"]").waitUntil(visible, time).click();
    }

}
