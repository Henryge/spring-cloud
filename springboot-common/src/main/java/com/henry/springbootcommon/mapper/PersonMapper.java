package com.shie.idveri.mapper;

import com.shie.idveri.model.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PersonMapper {

    @Select("select id id, name name, create_time createTime from t_person")
    List<Person> getAll();

}
