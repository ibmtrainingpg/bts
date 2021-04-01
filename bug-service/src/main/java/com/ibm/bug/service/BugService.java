package com.ibm.bug.service;

import java.util.List;
import java.util.Optional;

import javax.net.ssl.SSLEngineResult.Status;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.bug.STATUS;
import com.ibm.bug.entity.Bug;
import com.ibm.bug.repo.BugRepository;

@Service
public class BugService {
	@Autowired
	BugRepository bugRepository;

	/**
	 * method to return the List of the bugs present in db
	 * 
	 * @return all the bugs present in db
	 */
	public List<Bug> getBugs() {
		return bugRepository.findAll();
	}

	/**
	 * method to get the particular bug
	 * 
	 * @param bugId
	 * @return zero or matching bug
	 */

	public Optional<Bug> getBug(String bugId) {
		return bugRepository.findById(bugId);
	}
	
	/**
	 * method to update the status of the code
	 * @param bug
	 * @returns updated bug status
	 */
	
	public STATUS updateBugStatus(@Valid Bug bug) {
		bugRepository.save(bug);
		return bug.getStatus();
		
	}
	public String createBug(@Valid Bug bug) {
		Bug savedBug=bugRepository.save(bug);
		return bug.getId();
	}

	public BugRepository getBugRepository() {
		return bugRepository;
	}

	public void setBugRepository(BugRepository bugRepository) {
		this.bugRepository = bugRepository;
	}

}
