package com.orange_yishenggong.humanbeingmodels.mapper;

import com.orange_yishenggong.humanbeingmodels.domain.OdsSocialnetworkModelRuntimeOriginLog;
import com.orange_yishenggong.humanbeingmodels.domain.OdsSocialnetworkModelRuntimeOriginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OdsSocialnetworkModelRuntimeOriginLogMapper {
    long countByExample(OdsSocialnetworkModelRuntimeOriginLogExample example);

    int deleteByExample(OdsSocialnetworkModelRuntimeOriginLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OdsSocialnetworkModelRuntimeOriginLog record);

    int insertSelective(OdsSocialnetworkModelRuntimeOriginLog record);

    List<OdsSocialnetworkModelRuntimeOriginLog> selectByExample(OdsSocialnetworkModelRuntimeOriginLogExample example);

    OdsSocialnetworkModelRuntimeOriginLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OdsSocialnetworkModelRuntimeOriginLog record, @Param("example") OdsSocialnetworkModelRuntimeOriginLogExample example);

    int updateByExample(@Param("record") OdsSocialnetworkModelRuntimeOriginLog record, @Param("example") OdsSocialnetworkModelRuntimeOriginLogExample example);

    int updateByPrimaryKeySelective(OdsSocialnetworkModelRuntimeOriginLog record);

    int updateByPrimaryKey(OdsSocialnetworkModelRuntimeOriginLog record);
}