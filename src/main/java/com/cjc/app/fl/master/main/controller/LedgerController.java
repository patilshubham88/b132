package com.cjc.app.fl.master.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.fl.master.main.model.Ledger;
import com.cjc.app.fl.master.main.model.UpdateLedger;
import com.cjc.app.fl.master.main.service.HomeService;

@RestController
@CrossOrigin("*")
public class LedgerController 
{
	@Autowired
	HomeService hs;
	
	@GetMapping("/getAllLedger")
	public List<Ledger> getAllLedger()
	{
		return hs.getAllLedger();
	}
	
	@PutMapping("/editLedger/{ledgerId}")
	public Ledger editLedger(@RequestBody Ledger l, @PathVariable int ledgerId)	
	{
		return hs.editLedger(l, ledgerId);
	}
	
	
	@PostMapping("/addUpdateLedger")
	public UpdateLedger addUpdateLedger(@RequestBody UpdateLedger updateLedger)
	{
		return hs.updateLedger(updateLedger);
	}
	
	@GetMapping("/getUpdateLedger")
	public List<UpdateLedger> getAllUpdateLedger()
	{
		return hs.getAllUpdateLedger();
	}
	
	@GetMapping("/getUpdateLedgerByCaseNo/{caseNo}")
	public List<UpdateLedger> getUpdateLedgerByCaseNo(@PathVariable int caseNo)
	{
		return hs.getUpdateLedgerByCaseNo(caseNo);
	}
	
	@GetMapping("/getByLedgerId/{ledgerId}")
	public Ledger getByLedgerId(@PathVariable int ledgerId)
	{
		return hs.getLedgerById(ledgerId);
	}
	
	@GetMapping("/getByCaseNo/{caseNo}")
	public Ledger getByCaseNo(@PathVariable int caseNo)
	{
		return hs.getByCaseNo(caseNo);
	}
	
//	@PutMapping("/upLedger")
//	public Ledger upLedger(@RequestBody Ledger ledger)
//	{
//		return hs.ledgerDetails(ledger);
//	}
	
	
	
	
	@PutMapping("/editUpdateLedger")
	public UpdateLedger editUpdateLedger(@RequestBody UpdateLedger updateLedger)
	{
		return hs.editUpdateLedger(updateLedger);
	}
	
//	@PutMapping("/updateLedger")
//	public Ledger updateLedger(@RequestBody Ledger ledger)
//	{
//		return hs.ledgerDetails(ledger);
//	}
	
	@PostMapping("/addLedger/{caseNo}")
	public Ledger addLedger(@RequestBody Ledger ledger,@PathVariable int caseNo)
	{
		return hs.ledgerDetails(ledger, caseNo);
	}
	
	
	
	


}
