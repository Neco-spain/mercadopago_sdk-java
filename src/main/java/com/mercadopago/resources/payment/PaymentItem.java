package com.mercadopago.resources.payment;

import java.math.BigDecimal;
import lombok.Data;

/** PaymentItem class. */
@Data
public class PaymentItem {
  private String id;

  private String title;

  private String description;

  private String pictureUrl;

  private String categoryId;

  private Integer quantity;

  private BigDecimal unitPrice;
}
