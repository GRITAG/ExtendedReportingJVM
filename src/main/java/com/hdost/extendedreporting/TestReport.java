package com.hdost.extendedreporting;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by harolddost on 3/16/16.
 */
public class TestReport {

    public UUID runId;
    public UUID id;

    public String name;
    public String description;
    public Boolean outcome;

    public Date startTime;
    public Date endTime;

    public List<StepReport> stepOutcome;

    public TestReport() {
        this(null,null,null);
    }

    public TestReport(String testName, UUID runUUID, String description) {
        this.runId = runUUID;
        this.id = (runUUID == null ? UUID.randomUUID() : runUUID);

        this.name = (testName == null ? "" : testName);
        this.description = (description == null ? "" : description);

        this.startTime = new Date();
        this.stepOutcome = new ArrayList<StepReport>();

        ReportingObject.getInstance().getReport().writePreTest(this);
    }

    public void addStep(StepReport StepToAdd) {
        this.stepOutcome.add(StepToAdd);
    }

    public TestReport getTestObject() {
        return this;
    }

    public void finishTest() {
        this.endTime = new Date();
        this.outcome = true;

        for(StepReport x : this.stepOutcome) {
            if(x.getOutcome() != true) {
                this.outcome = false;
                break;
            }
        }

        ReportingObject.getInstance().getReport().writePostTest(this);
    }

    public List<StepReport> getStepOutcome() {
        return stepOutcome;
    }

    public void setStepOutcome(List<StepReport> stepOutcome) {
        this.stepOutcome = stepOutcome;
    }

    public UUID getRunId() {
        return runId;
    }

    public void setRunId(UUID runId) {
        this.runId = runId;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getOutcome() {
        return outcome;
    }

    public void setOutcome(Boolean outcome) {
        this.outcome = outcome;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

}
