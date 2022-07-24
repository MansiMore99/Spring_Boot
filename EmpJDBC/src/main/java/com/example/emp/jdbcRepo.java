package com.example.emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
public class jdbcRepo implements jdbcService {


	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<EmpJDBC> findAll() {
		return jdbcTemplate.query("SELECT * FROM EmpJDBC", new BeanPropertyRowMapper<EmpJDBC>(EmpJDBC.class));
	}

	@Override
	public EmpJDBC findById(Integer eid) {
		return jdbcTemplate.queryForObject("SELECT * FROM EmpJDBC WHERE eid=?", new BeanPropertyRowMapper<EmpJDBC>(EmpJDBC.class), eid);
	}

	@Override
	public Integer deleteById(Integer eid) {
		return jdbcTemplate.update("DELETE FROM EmpJDBC WHERE eid=?", eid);
	}

	@Override
	public Integer save(EmpJDBC e) {
		return jdbcTemplate.update("INSERT INTO EmpJDBC (eid, ename, eDOB) VALUES (?, ?, ?)", new Object[] {e.getEid(), e.getEname(), e.geteDOB()});
	}
	
	@Override
	public Integer update(EmpJDBC e, Integer eid) {
		return jdbcTemplate.update("UPDATE EmpJDBC SET ename = ?, eDOB = ? WHERE eid = ?", new Object[] {e.getEname(),  eid});
	}
}
