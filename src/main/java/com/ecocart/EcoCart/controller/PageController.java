package com.ecocart.EcoCart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/about")
    public String aboutPage() {
        return "about"; // Loads about.html
    }

    @GetMapping("/contact")
    public String contactPage() {
        return "contact"; // Loads contact.html
    }

    @GetMapping("/shop")
    public String shopPage() {
        return "shop"; // Loads shop.html
    }

    @GetMapping("/sustainability")
    public String sustainabilityPage() {
        return "sustainability"; // Loads sustainability.html
    }

    @GetMapping("/cart")
    public String cartPage() {
        return "cart"; // Loads cart.html
    }

    @GetMapping("/check-out")
    public String checkoutPage() {
        return "check-out"; // Loads check-out.html
    }

    @GetMapping("/order-confirmation")
    public String orderConfirmationPage() {
        return "order-confirmation"; // Loads order-confirmation.html
    }
}
