package com.orange_yishenggong.humanbeingmodels.mapper;

import com.orange_yishenggong.humanbeingmodels.domain.OdsSocialnetworkModelParameterOriginLog;
import com.orange_yishenggong.humanbeingmodels.domain.OdsSocialnetworkModelParameterOriginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author Orange Meow
 */
public interface OdsSocialnetworkModelParameterOriginLogMapper {
    long countByExample(OdsSocialnetworkModelParameterOriginLogExample example);

    int deleteByExample(OdsSocialnetworkModelParameterOriginLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OdsSocialnetworkModelParameterOriginLog record);

    int insertSelective(OdsSocialnetworkModelParameterOriginLog record);

    List<OdsSocialnetworkModelParameterOriginLog> selectByExample(OdsSocialnetworkModelParameterOriginLogExample example);

    OdsSocialnetworkModelParameterOriginLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OdsSocialnetworkModelParameterOriginLog record, @Param("example") OdsSocialnetworkModelParameterOriginLogExample example);

    int updateByExample(@Param("record") OdsSocialnetworkModelParameterOriginLog record, @Param("example") OdsSocialnetworkModelParameterOriginLogExample example);

    int updateByPrimaryKeySelective(OdsSocialnetworkModelParameterOriginLog record);

    int updateByPrimaryKey(OdsSocialnetworkModelParameterOriginLog record);
}
