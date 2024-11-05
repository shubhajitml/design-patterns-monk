package com.design.patterns;

import com.design.patterns.BehaviouralPatterns.StrategyPatternBehavioural.CreditCardStrategy;
import com.design.patterns.BehaviouralPatterns.StrategyPatternBehavioural.Item;
import com.design.patterns.BehaviouralPatterns.StrategyPatternBehavioural.ShoppingCart;
import com.design.patterns.BehaviouralPatterns.StrategyPatternBehavioural.UpiStrategy;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {

    @Test
    public void testShoppingCart(){
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("1234", 120);
        Item item2 = new Item("5678", 230);
        cart.addItem(item1);
        cart.addItem(item2);

        cart.pay(new CreditCardStrategy("SDas", "946738242235", "789", "11/29"));
        cart.pay(new UpiStrategy("9678342109@paytm", "Sd", "SBI"));
    }
}
