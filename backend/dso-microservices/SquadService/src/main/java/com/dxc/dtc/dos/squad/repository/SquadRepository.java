package com.dxc.dtc.dos.squad.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dxc.dtc.dos.squad.model.Squad;

@RepositoryRestResource(collectionResourceRel = "squads", path = "squads")
public interface SquadRepository extends PagingAndSortingRepository<Squad, Long>{

}
