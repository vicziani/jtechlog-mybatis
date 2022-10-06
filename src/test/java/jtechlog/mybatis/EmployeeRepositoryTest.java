package jtechlog.mybatis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class EmployeeRepositoryTest {

    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    void testInsert() {
        var employee = new Employee("John Doe");
        employeeRepository.save(employee);

        var employeeToFind = employeeRepository.findById(employee.getId());
        assertEquals("John Doe", employeeToFind.getName());
    }
}
