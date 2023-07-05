package com.regurus.shomeserver.data.devices;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public abstract class Device {
    public enum Status{
        ON,
        OFF
    }
    public enum Capabilities{
        LIGHT_SWITCH,
        LIGHT_INTENSITY
    }
    @Id
    private String identifier;
    protected String deviceType;
    private Status status;
}
