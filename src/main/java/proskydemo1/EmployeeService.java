
package proskydemo1;
import proskydemo1.Demo1Application;
public interface EmployeeService{
     Employee add(String firstName, String lastName);

     Employee remove(String firstName, String lastName);

     Employee find(String firstName, String lastName);

     collection<Employee> findAll();
}
