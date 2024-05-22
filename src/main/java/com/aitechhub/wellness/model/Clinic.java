package com.aitechhub.wellness.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

//add lombok annotations

@Entity
@Table(name = "clinic")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Clinic {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clinic_generator")
    @SequenceGenerator(name="clinic_generator", sequenceName = "clinic_seq", allocationSize=1)
    private Long id;

    private String name;
    private String description;
    private String location;

    @CreationTimestamp
    private LocalDateTime dateCreated;
    @UpdateTimestamp
    private LocalDateTime dateUpdated;


}
