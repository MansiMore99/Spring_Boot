package com.example.emp;

import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

//@Service
public interface jdbcService {


	public List<EmpJDBC> findAll();
	
	public EmpJDBC findById(Integer eid);
	
	public Integer deleteById(Integer eid);
	
	public Integer save(EmpJDBC e);
	
	public Integer update(EmpJDBC e, Integer eid);
	
}



//
//	private final JdbcTemplate jdbcTemplate;
//	
//	public jdbcService(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//	
//	
////	public void insert() {
////		
////        int rowsInserted = jdbcTemplate.update("insert into EmpJDBC (eid,ename,eDOB) values (5, 'Omkar','02-5-1999')");
////        System.out.println("Number of rows updated = " + rowsInserted);
////    }
//	
//	public EmpJDBC queryUserById(Integer eid) {
//
//		EmpJDBC emp = jdbcTemplate.queryForObject("select * from EmpJDBC where eid=?", (resultSet, i) -> {
//			EmpJDBC employee = new EmpJDBC();
//            employee.setEid(resultSet.getInt("eid"));
//            employee.setEname(resultSet.getString("ename"));
//            employee.seteDOB(resultSet.getString("eDOB"));
//            return employee;
//        }, eid);
//        System.out.println(emp);
//        return emp;
//    }
//	
//	 public List<EmpJDBC> queryFromDatabase(int eidLessThan) {
//
//	        return jdbcTemplate.query("select eid,ename,eDOB from EmpJDBC where eid<? ", preparedStatement -> preparedStatement.setInt(1, eidLessThan), (resultSet, i) -> {
//	        	EmpJDBC empJ = new EmpJDBC();
//	        	empJ.setEid(resultSet.getInt("eid"));
//	            empJ.setEname(resultSet.getString("ename"));
//	            empJ.seteDOB(resultSet.getString("eDOB"));
//	            return empJ;
//	        });
//	        
//	    }
//	 
//	 public int delete(Integer eid) {
//		 
//	        return jdbcTemplate.update("DELETE FROM EmpJDBC WHERE eid=?", eid);
//	    }
//	 
//	 public int save(EmpJDBC e) {
//		 
//	        return jdbcTemplate.update("INSERT INTO EmpJDBC (eid, ename,eDOB) VALUES (?, ?, ?)", new Object[] {e.getEid(), e.getEname(), e.geteDOB()});
//	    }
	
