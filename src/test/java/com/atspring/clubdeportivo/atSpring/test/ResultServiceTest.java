package com.atspring.clubdeportivo.atSpring.test;

import com.atspring.clubdeportivo.atSpring.dao.ResultDAO;
import com.atspring.clubdeportivo.atSpring.model.Competition;
import com.atspring.clubdeportivo.atSpring.model.Result;
import com.atspring.clubdeportivo.atSpring.model.Runner;
import com.atspring.clubdeportivo.atSpring.service.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ResultServiceTest {

    @Mock
    private ResultDAO daoMockResult;

    @Mock
    private RunnerServiceImpl runnerMockService;

    @Mock
    private CompetitionServiceImpl competitionMockService;

    @InjectMocks
    private ResultServiceImpl resultService;

    @Test
    public void testCreateResult() {

        final Runner storedRunner = new Runner();
        final Competition storedCompetition = new Competition();

        final Result storedResult = new Result();
        final Result initialResult = new Result();

        storedRunner.setIdRunner(1);
        storedCompetition.setIdCompetition(1);
        storedResult.setidResult(1);
        storedResult.setRunner(storedRunner);

        when(runnerMockService.findById(Mockito.anyInt()))
                .thenReturn(Optional.ofNullable(storedRunner));

        when(competitionMockService.findById(Mockito.anyInt()))
                .thenReturn(Optional.ofNullable(storedCompetition));

        when(daoMockResult.save(Mockito.any(Result.class)))
                .thenReturn(storedResult);

        Result result = resultService.create(initialResult,1,1);

        assertEquals(storedResult.getRunner().getIdRunner(), result.getRunner().getIdRunner());
    }

}
