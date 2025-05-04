package ru.elizarov;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.elizarov.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}