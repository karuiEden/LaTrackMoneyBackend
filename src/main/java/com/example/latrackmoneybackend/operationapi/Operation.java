package com.example.latrackmoneybackend.operationapi;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDateTime;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;

enum Type{
    earning,
    spending
}

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonInclude(NON_DEFAULT)
@Table(name = "operations")
public class Operation {
    @Id
    @UuidGenerator
    @Column(name = "id", unique = true, updatable = false)
    private String id;
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;
    private int money;
    private Type type;
}
