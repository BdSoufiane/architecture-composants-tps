package ma.formations.graphql.dtos.transaction;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddWirerTransferResponse {
    private String message;
    private TransactionDto transactionFrom;
    private TransactionDto transactionTo;
}
