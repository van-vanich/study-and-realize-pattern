public abstract class ColumnDecorator implements Report {

    private Report decoratedReport;

    public ColumnDecorator(Report decoratedReport) {
        this.decoratedReport = decoratedReport;
    }

    public String getFirstColumnData() {
        return decoratedReport.getFirstColumnData();
    }

    @Override
    public Object[][] getReportData(String reportId) {
        return decoratedReport.getReportData(reportId);
    }
}
