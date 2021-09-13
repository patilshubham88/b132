package com.cjc.app.fl.master.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fl.master.main.model.Sanction;

@Repository
public interface SanctionRepository extends JpaRepository<Sanction, Integer>
{
	public Sanction findAllByLoanId(int loanId);

}
