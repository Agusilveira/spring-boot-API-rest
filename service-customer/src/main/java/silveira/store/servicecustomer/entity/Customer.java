package silveira.store.servicecustomer.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.io.Serializable;

@Data
@Entity
@Table(name = "tbl_customers")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "The ID number cannot be empty")
    @Size( min = 8 , max = 8, message = "The size of the ID number is 8")
    @Column(name = "number_id" , unique = true ,length = 8, nullable = false)
    private String numberID;

    @NotEmpty(message = "The name cannot be empty")
    @Column(name="first_name", nullable=false)
    private String firstName;

    @NotEmpty(message = "The last name cannot be empty")
    @Column(name="last_name", nullable=false)
    private String lastName;

    @NotEmpty(message = "The mail cannot be empty")
    @Email(message = "This is not a valid email address")
    @Column(unique=true, nullable=false)
    private String email;

    @Column(name="photo_url")
    private String photoUrl;


    @NotNull(message = "The region cannot be empty")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Region region;

    private String state;
}
