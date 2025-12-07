package ma.formations.graphql.dtos.customer;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class UpdateCustomerResponse {
    private Long id;
    private String message;
    private String username;
    private String identityRef;
    private String firstname;
    private String lastname;
}
