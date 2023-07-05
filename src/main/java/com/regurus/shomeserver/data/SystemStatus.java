package com.regurus.shomeserver.data;

import lombok.Data;

import java.util.List;

@Data
public class SystemStatus {
    private List<DeviceStatus> deviceStatusList;
}
