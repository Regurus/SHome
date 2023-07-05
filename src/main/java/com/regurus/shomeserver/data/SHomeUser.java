package com.regurus.shomeserver.data;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class SHomeUser {
    @Id
    private int id;
    private String bla;
}
