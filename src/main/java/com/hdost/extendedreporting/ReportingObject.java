package com.hdost.extendedreporting;

import com.ostusa.Report;

/**
 * Static reference to the reporting Object
 * Use this to exercise the properly implemented Database reporting objects
 */
public class ReportingObject {
    private static ReportingObject instance;
    private ReportWriter reportWriter;

    public static synchronized ReportingObject getInstance() {
        if (instance == null) {
            instance = new ReportingObject();
        }

        return instance;
    }

    public void setReport(ReportWriter writer){
        reportWriter = writer;
    }

    public ReportWriter getReport(){
        return reportWriter;
    }
}
