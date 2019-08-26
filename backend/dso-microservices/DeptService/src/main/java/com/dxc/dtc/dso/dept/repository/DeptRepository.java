package com.dxc.dtc.dso.dept.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dxc.dtc.dso.dept.model.Dept;

@RepositoryRestResource(collectionResourceRel = "depts", path = "depts")
public interface DeptRepository extends PagingAndSortingRepository<Dept, Long>{
}

