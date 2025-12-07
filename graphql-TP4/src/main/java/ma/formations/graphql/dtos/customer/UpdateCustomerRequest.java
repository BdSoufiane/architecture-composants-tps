package ma.formations.graphql.dtos.customer;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class UpdateCustomerRequest {
    private String username;
    private String firstname;
    private String lastname;
}
