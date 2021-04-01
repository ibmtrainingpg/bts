package com.ibm.bug.service;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.net.ssl.SSLEngineResult.Status;

import org.junit.jupiter.api.Test;

import com.ibm.bug.STATUS;
import com.ibm.bug.entity.Bug;
import com.ibm.bug.repo.BugRepository;

class BugServiceTest {

	@Test
	void testGetBugs() {
		BugService bugService = new BugService();
		BugRepository dummyRepo = new DummyBugRepository();
		bugService.setBugRepository(dummyRepo);
		Bug bug = new Bug();
		String bugId = bugService.createBug(bug);
		assertNotNull(bugId);
	}

//	@Test
//	void testGetBug() {
//		fail("Not yet implemented");
//	}
//
	@Test
	void testUpdateBugStatus() {
		BugService bugService = new BugService();
		BugRepository dummyRepo = new DummyBugRepository();
		bugService.setBugRepository(dummyRepo);
		Bug bug = new Bug();
		STATUS status = bugService.updateBugStatus(bug);
		assertNotNull(status);
		assertEquals(STATUS.VERIFIED, status);
	}
//
//	@Test
//	void testCreateProject() {
//		fail("Not yet implemented");
//	}

}
