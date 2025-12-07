package ma.formations.graphql.dtos.transaction;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddWirerTransferRequest {
    private String ribFrom;
    private String ribTo;
    private Double amount;
    private String username;
}

