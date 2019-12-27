package ru.testCase;

import ru.yandexMarket.pages.HomeAppliances;
import ru.yandexMarket.pages.MainPage;
import ru.yandexMarket.pages.ProductPage;

import java.io.IOException;

public class Steps {
    MainPage mainPage = new MainPage();
    HomeAppliances homeAppliances = new HomeAppliances();
    ProductPage productPage = new ProductPage();

    @Дано("Открыта главная страница Яндекс-Маркет")
    public void страницаЯндексМаркет() throws IOException {
        mainPage.open();
    }

    @Также("Проверяем корректное отображение строки поиска")
    public void проверяемОтображениеСтрокиПоиска() {
        mainPage.searchString();
    }

    @Также("Проверяем корректное отображение верхнего баннера с акциями")
    public void проверяемОтображениеВерхнегоБаннераСАкциями() {
        mainPage.topSharesBanner();
    }

    @Также("Проверяем корректное отображение основного баннера с акциями")
    public void проверяемОтображениеОсновногоБаннераСАкциями() {
        mainPage.mainSharesBanner();
    }

    @Также("Проверяем корректное отображение блока рекомендуемые товары")
    public void проверяемОтображениеБлокаРекомендуемыхТоваров() {
        mainPage.blockRecommendedProducts();
    }

    @Также("Проверяем корректное отображение блока Журнал маркета")
    public void проверяемОтображениеБлокаЖурналМаркета() {
        mainPage.blockMarketJournal();
    }

    @Также("Проверяем корректное отображение блока отзывы на лучшие товары")
    public void проверяемОтображениеБлокаОтзывыНаЛучшиеТовары() {
        mainPage.blockBestProducts();
    }

    @Также("Проверяем корректное отображение блока популярные бренды")
    public void проверяемЧОтображениеБлокаПопулярныеБренды() {
        mainPage.blockPopularBrands();
    }

    @Также("Проверяем корректное отображение блока для подписки")
    public void проверяемОтображениеБлокаДляПодписки() {
        mainPage.blockSubscribtion();
    }

    @Также("Проверяем корректное отображение блока подвал")
    public void проверяемОтображениеПодвала() {
        mainPage.Footer();
    }

    @Также("Проверяем корректное отображение боковых баннеров на подборки")
    public void проверяемОтображениеБоковыхБаннеров() {
        mainPage.sideBar();
    }

    @Затем("Выбираем сменить регион")
    public void выбираемСменитьРегион() { mainPage.clickChangeRegion(); }

    @И("Вводим город")
    public void воВсплывающемОкнеВводимГород(String city) {
        mainPage.enterCity(city);
    }

    @Затем("Выбираем сменить регион")
    public void выбираемСменитьРегион() {
        mainPage.clickChangeRegion();
    }

    @И("Выбираем определять город автоматически")
    public void выбираемОпределятьАвтоматически() {
        mainPage.clickDetectAutomatically();
    }

    @Также("Нажимаем: Да, спапсибо")
    public void нажимаемДаСпасибо() throws InterruptedException {
        mainPage.yesThanks();
    }

    @Если("Выбираем меню Все категории")
    public void выбираемМенюВсеКатегории() {
        mainPage.allCategories();
    }

    @Тогда("Отображается меню Все категории")
    public void отображаетсяМенюВсеКатегориями() {
        mainPage.blockAllCategories();
    }

    @Если("Наводим курсор на категорию Бытовая техника")
    public void наводимНаКатегориюБытоваяТехника() {
        mainPage.homeAppliances();
    }

    @Тогда("Отображается меню с подкатегориями")
    public void отображаетсяМенюСПодкатегориями() {
        mainPage.blockHomeAppliances();
    }

    @Затем("Выбираем категорию Бытовая техника")
    public void выбираемКатегориюБытоваяТехника() {
        mainPage.clickHomeAppliances();
    }

    @Также("Выбираем категорию второго уровня")
    public void выбираемКатегориюВторогоУровня() {
        mainPage.clickClimateEquipment();
    }

    @Затем("Проверяем корректное отображение блока Популярные категории")
    public void проверяемОтображениеБлокаПопулярныхКатегории() {
        homeAppliances.blockPopularCategories();
    }

    @Также("Проверяем корректное отображение блока Популярные товары")
    public void проверяемОтображениеБлокаПопулярныхТоваров() {
        homeAppliances.blockPopularProducts();
    }

    @Также("Проверяем корректное отображение блока Скидки")
    public void проверяемОтображениеБлокаСкидки() {
        homeAppliances.blockDiscount();
    }

    @Также("Проверяем корректное отображение блока Популярные отзывы")
    public void проверяемОтображениеБлокаПопулярныеОтзывы() { homeAppliances.blockPopularComments(); }

    @Также("Проверяем корректное отображение подкатегории блока Популярные отзывы")
    public void проверяемОтображениеПодкатегорииБлокаПопулярныеОтзывы() {
        homeAppliances.blockPopularCommentsSubcategory();
    }

    @Затем("Выбираем произвольную подкатегорию")
    public void выбираемПроизвольнуюПодкатегорию() {
        homeAppliances.randomCategories();
    }

    @Тогда("Проверяем корректное отображение блока Ограничения цены")
    public void проверяемЧОтображениеБлокаОграничениеЦены() {
        productPage.blockPriceLimit();
    }

    @Также("Проверяем корректное отображение чекбокса В продаже")
    public void проверяемОтображениеЧекбоксаВПродаже() {
        productPage.checkboxOnSale();
    }

    @Также("Проверяем корректное отображение блока Производитель")
    public void проверяемОтображениеПроизводителеи() {
        productPage.blockMaker();
    }

    @Также("Проверяем корректное отображение блока Рейтинг магазина")
    public void проверяемОтображениеБлокаРейтингМагазина() {
        productPage.blockStoreRating();
    }

    @Также("Проверяем корректное отображение блока Способ доставки")
    public void проверяемОтображениеБлокаСпособДоставки() {
        productPage.blockDeliveryMethod();
    }

    @Также("Проверяем корректное отображение блока Способ оплаты")
    public void проверяемОтображениеБлокаСпособОплаты() {
        productPage.blockPaymentMethod();
    }

    @Также("Проверяем корректное отображение блока Магазины")
    public void проверяемОтображениеБлокаМагазины() {
        productPage.blockShops();
    }

    @Также("Проверяем, что у каждого товара присутствует цена")
    public void уКаждогоТовараПрисутствуетЦена() {
        productPage.checkBlocksProductPrice();
    }

    @Также("Проверяем, что у каждого товара присутствует кнопка предложений магазинов")
    public void уКаждогоТовараПрисутствуетПредложенияМагазинов() {
        productPage.checkBlocksStoreOffer();
    }

    @Также("Проверяем, что у каждого товара присутствуют отзывы")
    public void уКаждогоТовараПрисутствуетОтзыв() {
        productPage.checkBlocksProductComment();
    }

    @Если("Наводим курсор на произвольный товар")
    public void паводимКурсорНаТовар() {
        productPage.randomProduct();
    }

    @То("Появится кнопка Добавить в избранное")
    public void появляетсяКнопкаДобавитьВИзбранное() {
        productPage.buttonAddFavorite();
    }

    @Если("Добавляем товар в избранное")
    public void добавляемТоварВИзбранное() {
        productPage.clickButtonFavorite();
    }

    @То("Появится уведомление о добавлении товара в избранное")
    public void появитсяУведомление() {
        productPage.notificationAddFavorite();
    }

    @Также("Активируем флажок В продаже")
    public void активируемФлажок() throws InterruptedException {
        productPage.clickCheckboxOnSale();

    @Также("В поле Цена от устанавливаем максимальную цену поля до")
    public void вБлокеЦенаВПолеОтУстанавливаемМаксимальнуюЦенуПоляДо() throws InterruptedException {
        productPage.setMaxPrice();
    }

    @И("Очищаем данное поле")
    public void очищаемПолеОт() throws InterruptedException {
        productPage.setMaxPriceClear();
    }

    @Также("Выбираем произвольного производителя")
    public void выбираемПроизвольногоПроизводителя() { productPage.selectMaker(); }

}
