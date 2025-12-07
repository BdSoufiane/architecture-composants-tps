package ma.formations.graphql.dtos.customer;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class AddCustomerResponse {
    private String message;
    private Long id;
    private String username;
    private String identityRef;
    private String firstname;
    private String lastname;
}
