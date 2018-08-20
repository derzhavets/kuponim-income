package com.derzhavets.kuponimincome;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "incomes", path = "incomes")
public interface IncomeRepository extends PagingAndSortingRepository<Income, Long>{
	
	List<Income> findByAmount(@Param("amount") Double amount);
	
	List<Income> findByClient(@Param("client") String client); 
	
}
