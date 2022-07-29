package com.rashome.rashome.mapper;

import com.rashome.rashome.dto.QueryData;
import com.rashome.rashome.po.Dht11Data;
import java.util.List;

public interface Dht11DataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Dht11Data record);

    Dht11Data selectByPrimaryKey(Long id);

    List<Dht11Data> selectAll();

    List<Dht11Data> selectByRasberryPiID(QueryData queryData);

    List<Dht11Data> selectByRasberryPiIDAndSensorID(QueryData queryData);

    List<Dht11Data> selectByTimestamp(QueryData queryData);

    int updateByPrimaryKey(Dht11Data record);
}