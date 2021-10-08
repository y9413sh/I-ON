package com.kosa.emp.repository;

import com.kosa.emp.model.EmpDTO;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/*
    PagingAndSortingRespository : 페이징 처리, 정렬 기능. CRUDRepository 상속 받음
 */

@RepositoryRestResource(collectionResourceRel = "empdto", path = "empdto")
public interface EmpRepository extends PagingAndSortingRepository<EmpDTO, Long> {

    List<EmpDTO> findByEname(@Param("ename") String name);

}