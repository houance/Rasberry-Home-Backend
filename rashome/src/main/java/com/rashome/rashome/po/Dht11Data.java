package com.rashome.rashome.po;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dht11Data {
    private Long id;

    private Long rasberryPiID;

    private Long sensorID;

    private Float frequency;

    private Long collectTime;

    private Float sensorData;

    private Date createTime;
}