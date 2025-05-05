package ru.elizarov;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.elizarov.EmployeeRepository;

@Controller
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeRepository repository;

    @GetMapping("/employees")
    public String listEmployees(Model model) {
        model.addAttribute("employees", repository.findAll());
        return "employees";
    }

    @GetMapping("/employee/{id}")
    public String getEmployeeById(@PathVariable Long id, Model model) {
        Employee employee = repository.findById(id).orElse(null);
        model.addAttribute("employee", employee);
        return "employee";
    }

}