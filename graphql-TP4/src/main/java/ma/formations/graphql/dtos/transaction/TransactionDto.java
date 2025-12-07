package ma.formations.graphql.dtos.transaction;

import lombok.*;
import ma.formations.graphql.dtos.bankaccount.BankAccountDto;
import ma.formations.graphql.dtos.user.UserDto;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class TransactionDto {
    private Long id;
    private String createdAt;
    private String transactionType;
    private Double amount;
    private BankAccountDto bankAccount;
    private UserDto user;
}
