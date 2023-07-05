package com.regurus.shomeserver.data.devices;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class LightDevice extends Device {
    protected String deviceType = "Light";
    private List<Capabilities> capabilities = List.of(Capabilities.LIGHT_SWITCH);
}
