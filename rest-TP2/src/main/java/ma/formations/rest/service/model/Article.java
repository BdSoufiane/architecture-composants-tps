package ma.formations.rest.service.model;



import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Article implements Serializable {
    private Long id;
    private String description;
    private Double price;
    private Double quantity;
}
