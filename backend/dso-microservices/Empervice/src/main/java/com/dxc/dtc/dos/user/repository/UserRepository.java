package com.dxc.dtc.dos.user.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dxc.dtc.dos.user.model.User;

@RepositoryRestResource(collectionResourceRel = "depts", path = "depts")
public interface UserRepository extends PagingAndSortingRepository<User, Long>{
	
	List<User> findByLastName(@Param("lastname") String lastname);
}
