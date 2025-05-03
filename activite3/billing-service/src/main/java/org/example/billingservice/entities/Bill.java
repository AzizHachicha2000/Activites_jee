import java.beans.Transient;
import java.sql.Date;
import java.util.Collection;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Bill {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date billingDate;
    private Long customerId;
    
    @Transient
    private Customer customer;
    
    @OneToMany(mappedBy = "bill")
    private Collection<ProductItem> productItems;
}