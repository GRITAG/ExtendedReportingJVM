package io.swarmauto.extendedreporting;

public interface ReportWriter {

    void writePreRun(RunReport runReport);

    void writePostRun(RunReport runReport);

    void writePreTest(TestReport testReport);

    void writePostTest(TestReport testReport);

    void writeStep(StepReport stepReport);
}
