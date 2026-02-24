package gr.aueb.cf.eduapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "personal_info")
public class PersonalInfo extends AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String amka;

    @Column(name = "identity_number", unique = true)
    private String identityNumber;

    @Column(name = "place_of_birth")
    private String placeOfBirth;

    @Column(name = "municipality_of_registration")
    private String municipalityOfRegistration;
}
