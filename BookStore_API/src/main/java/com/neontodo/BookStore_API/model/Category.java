package com.neontodo.BookStore_API.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Categories")
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class Category {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToMany(mappedBy = "categories")
    private List<Book> books;

    @Column(nullable = false, unique = true, updatable = false)
    private UUID uuid;

    @PrePersist
    public void generateUuid() {
        if(uuid == null) {
            uuid = UUID.randomUUID();
        }
    }

}
