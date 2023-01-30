package com.crud.crudprueba.domain.DTO.response;

import com.crud.crudprueba.data.entity.CreditCard;
import com.crud.crudprueba.data.entity.Cash;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentDTO {

    public CreditCard creditCard;

    public Cash cash;

}
