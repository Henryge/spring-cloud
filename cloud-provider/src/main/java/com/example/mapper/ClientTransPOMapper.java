package com.example.mapper;

import com.example.model.ClientTransPO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ClientTransPOMapper {

    ClientTransPO selectByPK(Long pk);

}
