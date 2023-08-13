import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

/*Note:
 * This code is errorneous.
 */
public class Problem02 {
  public static void main(String[] args) {
    PrinterJob job = PrinterJob.getPrinterJob();
    boolean ok = job.printDialog();
    if (ok) {
      try {
        job.print();
      } catch (PrinterException ex) {
        /* The job did not successfully complete */
      }
    }
  }
}