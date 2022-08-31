public class FacadeApplication {
    public static void main(String[] args) {
        ReportGeneratorFacade reportGeneratorFacade = new ReportGeneratorFacade();
        reportGeneratorFacade.generateReport(ReportType.HTML, null);
        reportGeneratorFacade.generateReport(ReportType.PDF, null);
    }
}
