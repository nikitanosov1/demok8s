package com.mediasoft.demok8s.web;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "test")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Foo {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(columnDefinition = "uuid", name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "content", nullable = false)
    private String content;
}