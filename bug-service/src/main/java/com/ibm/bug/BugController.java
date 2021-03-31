package com.ibm.bug;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
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

	/**
	 * method to get all the bugs present in db
	 * 
	 * @return all the bugs
	 */

	@GetMapping("/bug")
	List<Bug> getOrders() {
		return bugService.getBugs();

	}

	/**
	 * method to get the bug with particular id
	 * 
	 * @param bugId
	 * @return zero or matching bug
	 */

	@GetMapping("/bug/{id}")
	Optional<Bug> getOrder(@PathVariable("id") String bugId) {
		return bugService.getBug(bugId);
	}
	
	
	@PutMapping("/bug/{id}")
	void updateBugStatus(@RequestBody @Valid Bug bug, BindingResult bindingResult,@PathVariable("id") String bugId ) {
//		System.out.println(bugId);
		bug.setId(bugId);
		bugService.updateBugStatus(bug);
		
		
	}
	
	
	

	

}
