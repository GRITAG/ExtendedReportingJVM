package io.swarmauto.extendedreporting;

import com.ostusa.Report;

import java.util.Date;
import java.util.UUID;

/**
 * Created by harolddost on 3/16/16.
 */
public class RunReport implements Report{

    private ReportWriter report;

    private UUID id;
    private String name;
    private String description;

    private Date startTime;
    private Date endTime;


    public RunReport(String runName , String runDescription) {
        this(UUID.randomUUID(),runName,runDescription);
    }

    public RunReport(UUID runID, String runName, String runDescription) {
        id = runID;
        this.name = (runName == null ? "" : runName);
        this.description = (runDescription == null ? "" : runDescription);
        startTime = new Date();
        endTime = new Date();
    }

    public void startRun() {
        this.startTime = new Date();
        ReportingObject.getInstance().getReport().writePreRun(this);
    }

    public void completeRun()
    {
        this.endTime = new Date();
        ReportingObject.getInstance().getReport().writePostRun(this);
    }

    public ReportWriter getReport() {
        return report;
    }

    public void setReport(ReportWriter report) {
        this.report = report;
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
