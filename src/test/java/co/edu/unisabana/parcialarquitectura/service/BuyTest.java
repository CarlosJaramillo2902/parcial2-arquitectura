package co.edu.unisabana.parcialarquitectura.service;

import co.edu.unisabana.parcialarquitectura.repository.Database;
import org.junit.jupiter.api.Test;

class BuyTest {

  private co.edu.unisabana.parcialarquitectura.repository.Database Database;
  private final Buy service = new Buy(Database);

  @Test
  public void test() {
    service.makePurchase(2, 3, "Books");
  }

}