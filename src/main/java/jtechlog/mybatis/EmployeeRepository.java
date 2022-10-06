package jtechlog.mybatis;

import lombok.AllArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class EmployeeRepository {

    private SqlSession session;

    public void save(Employee employee) {
        session.insert("saveEmployee", employee);
    }

    public Employee findById(long id) {
        return session.selectOne("findEmployeeById", id);
    }
}
