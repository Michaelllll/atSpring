package com.atspring.clubdeportivo.atSpring.test;

import com.atspring.clubdeportivo.atSpring.dao.ClubDAO;
import com.atspring.clubdeportivo.atSpring.model.Club;
import com.atspring.clubdeportivo.atSpring.model.Runner;
import com.atspring.clubdeportivo.atSpring.service.ClubServiceImpl;
import com.atspring.clubdeportivo.atSpring.service.RunnerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ClubServiceTest {

	@Mock
	private ClubDAO daoMockClub;

	@Mock
    private RunnerService daoMockRunner;
	
	@InjectMocks
	private ClubServiceImpl clubService;

	@Test
	public void testCreateClub() {
        Club clubBD = new Club();
        clubBD.setIdClub(1);
        Club clubInicial = new Club();
        clubInicial.setName("Club");

        when(daoMockClub.save(Mockito.any(Club.class))).thenReturn(clubBD);
        assertEquals(clubService.create(clubInicial).getIdClub(), (clubBD.getIdClub()));
     }

     @Test(expected = IllegalArgumentException.class)
     public void testAddRunnerNull() {
         clubService.addRunner(null, null);
     }

    @Test
    public void testAddRunner() {

         final Integer idClub = 22;
         final Integer idRunner = 1;
         final Club storedClub = new Club();
         final Runner storedRunner = new Runner();

         when(daoMockClub.findById(idClub))
                 .thenReturn(Optional.ofNullable(storedClub));
         when(daoMockRunner.findById(idRunner))
                 .thenReturn(Optional.ofNullable(storedRunner));
         clubService.addRunner(idClub, idRunner);

         verify(daoMockClub).findById(idClub);
         verify(daoMockRunner).findById(idRunner);
         verify(daoMockClub).saveAndFlush(storedClub);
     }

    @Test
    public void TestFindById() {
	    final Integer idClub = 1;
	    final Club club = new Club();
	    club.setIdClub(1);

	    when(daoMockClub.findById(Mockito.any(Integer.class)))
                .thenReturn(Optional.ofNullable(club));

	    assertEquals(clubService.findById(idClub).getIdClub(), club.getIdClub());
    }
}
