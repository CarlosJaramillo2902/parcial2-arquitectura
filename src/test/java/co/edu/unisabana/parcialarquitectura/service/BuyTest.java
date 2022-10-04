package co.edu.unisabana.parcialarquitectura.service;

import co.edu.unisabana.parcialarquitectura.repository.Database;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
class BuyTest {

  @InjectMocks
  private final Buy service = new Buy();

  @Mock
  private Database database;

  @Test
  public void Given_purchase_When_buyercode_equal_vendedorcode_Then_throw_IllegalSaleException() {
    assertThrows(IllegalSaleException.class, () -> {
      service.makePurchase(2, 2, "Books");;
    });
  }

  @Test
  public void Given_purchase_When_save_purchase_Then_return_value_1() {
    int result = database.savePurchase(3, "Books");
    assertEquals(1, result);
  }

  @Test
  public void Given_purchase_When_save_null_purchase_Then_return_value_0() {
    int result = database.savePurchase(0, null);
    assertEquals(0, result);
  }
}