package com.ibm.bug.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ibm.bug.entity.Bug;
import com.ibm.bug.repo.BugRepository;

@Service
public class BugService {
	@Autowired
	BugRepository bugRepository;
	public void updateBugStatus(@Valid Bug bug) {
		 bugRepository.save(bug);
		
		
		
		
	}

}
