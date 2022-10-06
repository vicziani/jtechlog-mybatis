package jtechlog.mybatis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class EmployeeMapperTest {

    @Autowired
    EmployeeMapper employeeMapper;

    @Test
    void testInsert() {
        var employee = new Employee("John Doe");
        employeeMapper.save(employee);

        var employeeToFind = employeeMapper.findById(employee.getId());
        assertEquals("John Doe", employeeToFind.getName());
    }

}
