package com.crud.crudprueba.domain.DTO.response;

<<<<<<<< HEAD:src/main/java/com/crud/crudprueba/domain/DTO/response/AccountDTO.java
========
import com.crud.crudprueba.domain.models.CreditCard;
import com.crud.crudprueba.domain.models.Cash;
>>>>>>>> 0fed1cf (feat: "Refactorizando codigo"):src/main/java/com/crud/crudprueba/domain/DTO/response/PaymentDTO.java
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

    private Integer id;
    private Integer numberCard;
    private Integer cvv;
    private String date;

}
