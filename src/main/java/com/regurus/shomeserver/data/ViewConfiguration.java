package com.regurus.shomeserver.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class ViewConfiguration {
    @Id
    private long id;
    @OneToOne
    private SHomeUser viewSHomeUser;
}
