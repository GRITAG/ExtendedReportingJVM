package com.hdost.extendedreporting;

import com.ostusa.Report;

/**
 * Created by harolddost on 3/16/16.
 */
public class ReportingUnit implements Report{

    public void prepReporting(){
        // TODO:  Create Test Report Pass in Associated Run if there is one
    }

    public void validate(String text, boolean passFail, boolean positiveCheck, byte[] screenshot){
        // TODO: Create new step outcome for Current TestID
    }

    public void validate(String text, boolean passFail, boolean positiveCheck){
        validate(text,passFail,positiveCheck,null); // TODO: Verify if null should be default value for screenshot
    }

    public void validate(String text, boolean passFail){
        validate(text,passFail,true); // TODO: Verify if default should be true for positive check
    }

    public void writeStep(String text){
        // TODO: Create new step outcome for current testId
    }

    public void writeReport(){
        // TODO: Execute Closing of the Test Report.  Set End Date time and call any post Test Methods here
    }

    public void createRun()
    {
        //TODO: need to figure out a way to create a run object (Look to distributed Testing system if needed)
    }

    public void closeRun()
    {
        //TODO: need to figure out how to close a run once comopleted. (Look to distributed Testing system if needed)
    }
}
