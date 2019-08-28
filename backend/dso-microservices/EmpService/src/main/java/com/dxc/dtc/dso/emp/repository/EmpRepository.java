package com.dxc.dtc.dso.emp.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dxc.dtc.dso.emp.model.Emp;

@RepositoryRestResource(collectionResourceRel = "employees", path = "employees")
public interface EmpRepository extends PagingAndSortingRepository<Emp, Long>{
	
	List<Emp> findByEmpUsername(@Param("empUsername") String empUsername);
	
	List<Emp> findByEmpEmail(@Param("empEmail") String empEmail);
}
