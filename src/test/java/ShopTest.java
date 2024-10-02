import org.iesvdm.Ejercicios.Ej5.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class ShopTest {
    @Test
    public void CreateObjectsTest(){
        WebUser w = new WebUser ("contraseña", "Jose");
        Customer c = new Customer ( "1", "Calle 1 Bajo A", "6995959499", "carlarami03@gmail.com" );
        Account a = new Account ("1", "Avenida príncipe 2", false);
        Assertions.assertEquals ( w.getId (), "Jose" );
        Assertions.assertEquals ( c.getAdress (), "Calle 1 Bajo A" );
        Assertions.assertEquals ( a.getId (), "1" );
    }
    @Test
    public void ProductShoppingAccountTest(){
        WebUser w = new WebUser ("contraseña", "Jose");
        Account a = new Account ("1", "Avenida príncipe 2", false);
        Product p = new Product ( "1", "Camiseta", "Inditex" );
        ShoppingCart s = new ShoppingCart ( w, a );
        Assertions.assertEquals ( s.getA (), a );
        Assertions.assertEquals ( s.getW (), w );
    }
    @Test
    public void OrderPaymentShoppingCartTest(){
        WebUser w = new WebUser ("contraseña", "Jose");
        Account a = new Account ("1", "Avenida príncipe 2", false);
        ShoppingCart s = new ShoppingCart ( w, a );
        Payment p = new Payment ("1", new BigDecimal( "200.00" ), "compra", s );
        Order o = new Order ( "2", "Avenida Principe 2", new BigDecimal ( "200.00" ), s );
        Assertions.assertEquals ( p.getS (), s );
        Assertions.assertEquals ( o.getS (), s );
    }
}