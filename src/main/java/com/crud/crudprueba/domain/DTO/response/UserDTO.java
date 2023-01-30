package com.crud.crudprueba.domain.DTO.response;
<<<<<<<< HEAD:src/main/java/com/crud/crudprueba/domain/DTO/response/PaymentDTO.java

import com.crud.crudprueba.data.entity.CreditCard;
========

>>>>>>>> 0fed1cf (feat: "Refactorizando codigo"):src/main/java/com/crud/crudprueba/domain/DTO/response/UserDTO.java
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
public class UserDTO {

<<<<<<<< HEAD:src/main/java/com/crud/crudprueba/domain/DTO/response/PaymentDTO.java
    public CreditCard creditCard;
========
    private Integer id;
    private String name;
    private String document;
    private String email;
>>>>>>>> 0fed1cf (feat: "Refactorizando codigo"):src/main/java/com/crud/crudprueba/domain/DTO/response/UserDTO.java


}
