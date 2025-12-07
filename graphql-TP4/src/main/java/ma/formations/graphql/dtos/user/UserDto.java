package ma.formations.graphql.dtos.user;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserDto {
    protected String username;
    protected String firstname;
    protected String lastname;
}

