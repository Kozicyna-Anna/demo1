import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

@Service
public class EmployeeServiceImpl implements EmloyeeService {
    private final List<Employee> employeeList;

    public EmployeeServiceImpl() {
        this.employeeList = new ArrayList<>();
    }

    @Override
    public Employee add(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employeeList.contains(employee)) {
            throw new EmployeeAlreadyAddedException();
        }
        employeeList.add(employee);
        return employee;

        @Override
        public Employee remove(String firstName, String lastName) {
            Employee employee = new Employee(firstName, lastName);
            if (employeeList.contains(employee)) {
                employeeList.remove(employee);
                return employee;
            }
            throw new EmployeeNotFoundException();
        }

        @Override
        public Employee find(String firstName, String lastName) {
            Employee employee = new Employee(firstName, lastName);

            if (employeeList.contains(employee)) {
                return employee;
            }

            throw new EmployeeNotFoundException();
        }
        @Override
        public Collection<Employee> findAll() {
            return Collection.unmodifiableList(employeeList);
        }
    }
}







