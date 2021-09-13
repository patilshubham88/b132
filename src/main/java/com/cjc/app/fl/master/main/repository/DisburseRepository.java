package com.cjc.app.fl.master.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fl.master.main.model.Disburse;

@Repository
public interface DisburseRepository extends JpaRepository<Disburse, Integer>
{
	public Disburse getByCaseNo(int caseNo);

}
