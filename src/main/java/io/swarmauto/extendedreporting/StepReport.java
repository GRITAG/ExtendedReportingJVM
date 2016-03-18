package io.swarmauto.extendedreporting;

import com.ostusa.Report;

import java.util.Date;
import java.util.UUID;

public class StepReport implements Report{

    private ReportWriter reportWriter;
    private Date startTime;
    private Date endTime;
    private UUID id;
    private String stepDescription;
    private UUID testId;
    private Boolean outcome;
    private byte[] screenshot;

    public StepReport(String stepDescription, TestReport currentTest, Boolean outcome, byte[] screenshot) {
        this(stepDescription, currentTest.getId(), outcome, screenshot);
    }

    public StepReport(String stepDescription, UUID TestGuid, Boolean outcome, byte[] screenshot) {
        id = UUID.randomUUID();
        this.stepDescription = stepDescription;
        this.testId = TestGuid;
        this.outcome = outcome;
        this.screenshot = screenshot;

        startTime = new Date();
        endTime = new Date();

        ReportingObject.getInstance().getReport().writeStep(this);
    }

    public byte[] getScreenshot() {
        return screenshot;
    }

    public void setScreenshot(byte[] screenshot) {
        this.screenshot = screenshot;
    }

    public ReportWriter getReportWriter() {
        return reportWriter;
    }

    public void setReportWriter(ReportWriter reportWriter) {
        this.reportWriter = reportWriter;
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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getStepDescription() {
        return stepDescription;
    }

    public void setStepDescription(String stepDescription) {
        this.stepDescription = stepDescription;
    }

    public UUID getTestId() {
        return testId;
    }

    public void setTestId(UUID testId) {
        this.testId = testId;
    }

    public Boolean getOutcome() {
        return outcome;
    }

    public void setOutcome(Boolean outcome) {
        this.outcome = outcome;
    }


    @Override
    public void prepReporting() {

    }

    @Override
    public void validate(String s, boolean b, boolean b1, byte[] bytes) {

    }

    @Override
    public void validate(String s, boolean b, boolean b1) {

    }

    @Override
    public void validate(String s, boolean b) {

    }

    @Override
    public void writeStep(String s) {

    }

    @Override
    public void writeReport() {

    }
}
