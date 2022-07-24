package com.example.emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jdbcController {
	

	@Autowired 
	private jdbcService emp;
	
	@GetMapping("/emp")
	public List<EmpJDBC> findAll() {
		return emp.findAll();
	}
	
	@GetMapping("/emp/{eid}")
	public EmpJDBC findById(@PathVariable Integer eid) {
		return emp.findById(eid);
	}
	
	@DeleteMapping("/emp/{eid}")
	public String deleteById(@PathVariable Integer eid) {
		return emp.deleteById(eid)+" Employee Detail deleted from the database..!";
	}
	
	@PostMapping("/emp")
	public String save(@RequestBody EmpJDBC e) {
		return emp.save(e)+" Employee Detail saved successfully..1";
	}
	
	@PutMapping("/emp/{eid}")
	public String update(@RequestBody EmpJDBC e, @PathVariable Integer eid) {
		return emp.update(e, eid)+" Employee Detail updated successfully..!";
	}

}

//	
//	 private final jdbcService testService;
//	 
//	 public jdbcController(jdbcService testService) {
//		 
//	        this.testService = testService;
//	    }
//	 
//	
//	 @GetMapping("/emp/{eid}")
//	 EmpJDBC getEmployee(@PathVariable Integer eid) {
//	        return testService.queryUserById(eid);
//	    }
//  
//	 @GetMapping("/emp")
//	 List<EmpJDBC> getEmps() {
//	     return testService.queryFromDatabase(100);
//	 }
//	 
//	 @DeleteMapping("/emp/{eid}")
//	    public String deleteById(@PathVariable Integer eid) {
//	        return testService.delete(eid)+" Deleted Employee Detail from the Database..! ";
//	    }
//	 
//	 @PostMapping("/emp")
//	    public String save(@RequestBody EmpJDBC e) {
//	        return testService.save(e)+" Employee Detail saved successfully..!";
//	    }

