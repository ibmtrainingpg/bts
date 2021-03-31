package com.ibm.bug;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ibm.bug.entity.Bug;
import com.ibm.bug.service.BugService;


@RestController
public class BugController {
	@Autowired
	BugService bugService;
	
	
	@PutMapping("/bug/{id}")
	void updateBugStatus(@RequestBody @Valid Bug bug, BindingResult bindingResult,@PathVariable("id") String bugId ) {
//		System.out.println(bugId);
		bug.setId(bugId);
		bugService.updateBugStatus(bug);
		
		
	}
	
	
	

	

}
