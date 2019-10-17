package com.kq.sharding.algorithm;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import java.util.Collection;

/**
 * ProvincePreciseShardingAlgorithm
 *
 * @author kq
 * @date 2019-10-17
 */
@Slf4j
public class ProvincePreciseShardingAlgorithm implements PreciseShardingAlgorithm<String> {

    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<String> shardingValue) {

        String value = shardingValue.getValue();

        String database = null;

        if(StringUtils.hasText(value)) {
            if("zj".equalsIgnoreCase(value.trim())) {
                //zj  放第一个库
                database = availableTargetNames.iterator().next();
            }
        } else {

            while(availableTargetNames.iterator().hasNext()) {
                //最后1个库
                database = availableTargetNames.iterator().next();
            }
        }

        log.info("分库 province字段分库  logicTable={} column={} value={} database={}",shardingValue.getLogicTableName(),shardingValue.getColumnName(),value,database);
        return database;
    }
}
