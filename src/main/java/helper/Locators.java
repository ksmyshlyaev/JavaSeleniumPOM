package helper;

public class Locators {

    //helper.Locators for main page
    public static String signInButtonId ="nav-link-accountList";
    public static String departmentsLinkXpath ="//span[contains(text(),\"Departments\")]";
    public static String electronicsLinkText = "Electronics";
    public static String searchBoxId ="twotabsearchtextbox";

    //helper.Locators for registration page
    public static String registrationErrorClassName = "a-list-item";
    public static String registrationEmailId = "ap_email";
    public static String registrationSignInSubmitButtonId = "signInSubmit";
    public static String registrationPasswordId = "ap_password";

    //helper.Locators for electronics page
    public static String cameraAndPhotoLinkText = "CAMERA & PHOTO";

    //helper.Locators for item page
    public static String addToCartComparisonButtonId = "comparison_add_to_cart_button-announce";

    //helper.Locators for pre shopping cart page
    public static String addedToCartTextId = "huc-v2-order-row-items-msg";
    public static String cartButtonId = "hlb-view-cart-announce";

    //helper.Locators for cart page
    public static String itemsBoxGroupCssSelector = ".a-box-group.sc-buy-box-group";
    public static String shoppingCartPlaceholderCssSelector = "#sc-active-cart > div > h1";
    public static String deleteButtonXpath = "//input[@value='Delete']";
    public static String subtotalLabelId = "sc-subtotal-label-activecart";
}
