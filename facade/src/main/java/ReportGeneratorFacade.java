import javax.sql.DataSource;

public class ReportGeneratorFacade {
    public static void generateReport(ReportType type, DataSource dataSource) {
        if (dataSource == null) {
            // throw exception, but now it's unnecessary
        }

        Report report = new Report();
        report.setReportHeader(new ReportHeader());
        report.setReportFooter(new ReportFooter());

        //get data from dataSource and set
        report.setReportData(new ReportData());

        ReportWriter writer = new ReportWriter();
        switch (type) {
            case HTML:
                writer.writeHtmlReport(report);
                break;
            case PDF:
                writer.writePdfReport(report);
                break;
            default:
                // throw exception
        }
    }
}
