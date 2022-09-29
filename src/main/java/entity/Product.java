package entity;




import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;
@Setter
@Getter
@ToString
public class Product {
    private UUID id;
    private String title;
    private int cost;
}
