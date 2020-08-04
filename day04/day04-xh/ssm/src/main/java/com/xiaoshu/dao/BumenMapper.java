package com.xiaoshu.dao;

import com.xiaoshu.base.dao.BaseMapper;
import com.xiaoshu.entity.Bumen;
import com.xiaoshu.entity.BumenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BumenMapper extends BaseMapper<Bumen> {
    long countByExample(BumenExample example);

    int deleteByExample(BumenExample example);

    List<Bumen> selectByExample(BumenExample example);

    int updateByExampleSelective(@Param("record") Bumen record, @Param("example") BumenExample example);

    int updateByExample(@Param("record") Bumen record, @Param("example") BumenExample example);
}