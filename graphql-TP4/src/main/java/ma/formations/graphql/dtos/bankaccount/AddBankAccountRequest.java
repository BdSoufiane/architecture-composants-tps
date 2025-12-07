package ma.formations.graphql.dtos.bankaccount;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class AddBankAccountRequest {
    private String rib;
    private Double amount;
    private String customerIdentityRef;
}
