package com.cjc.app.fl.master.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fl.master.main.model.Ledger;
import com.cjc.app.fl.master.main.model.UpdateLedger;

@Repository
public interface UpdateLedgerRepository extends JpaRepository<UpdateLedger, Integer> 
{
	public List<UpdateLedger> findAllByCaseNo(int caseNo);

	public UpdateLedger save(Ledger l);
	

}
