import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class EmployeeService {

	@Autowired

	private EmployeeRepository employeeRepository;

	@Transactional

	public void addEmployee(Employee employee) {

	employeeRepository.save(employee);

	}
}
