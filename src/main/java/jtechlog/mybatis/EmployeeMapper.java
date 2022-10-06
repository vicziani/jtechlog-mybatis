package jtechlog.mybatis;

import org.apache.ibatis.annotations.*;

@Mapper
public interface EmployeeMapper {

    @Insert("insert into employees(id, name) values (seq_employees.nextval, #{name})")
    @Options(useGeneratedKeys = true, keyProperty="id")
    void save(Employee employee);

    @Select("select id, name from employees where id = #{id}")
    Employee findById(long id);

}
