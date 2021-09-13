package com.cjc.app.fl.master.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fl.master.main.model.Ledger;

@Repository
public interface LedgerRepository extends JpaRepository<Ledger, Integer> 
{
	public Ledger findAllByLedgerId(int ledgerId);
	public Ledger findByCaseNo(int caseNo);

}
