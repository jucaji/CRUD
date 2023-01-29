package com.crud.crudprueba.response.DTO;

import com.crud.crudprueba.entity.Card;
import com.crud.crudprueba.entity.Cash;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDTO {

    public Card card;

    public Cash cash;

}
