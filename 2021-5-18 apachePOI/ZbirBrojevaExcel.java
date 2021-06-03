package domaciApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ZbirBrojevaExcel {

	public static void main(String[] args) {
		/*
		 * Napraviti novi projekat i u njega dodati biblioteke za apache poi. Kao na
		 * casu, doci do lokacije na vasem kompjuteru i tamo prekopirati fajl koji sam
		 * okacila (domaci.xlsx). Ako bude problema sa citanjem fajla koji vam okacih, a
		 * vi molim vas onda ipak kreirajte novi excel, posto radim na linuxu danas
		 * shvatismo da moze da se desi da se nesto izbagovalo.
		 * 
		 * Napisati program koji racuna sumu brojeva koji se nalaze prvom sheet-u excel
		 * tabele koji se zove Brojevi. U tabeli svi brojevi se nalaze u prvoj koloni.
		 * Program treba da cita red po red iz tabele i upisane brojeve dodaje na sumu.
		 * Ukupnu sumu na kraju treba ispisati na standardnom izlazu. Potrebno je
		 * omoguciti da program radi i ukoliko se u datu tabelu doda jos brojeva.
		 */
		File f = new File("domaci.xlsx");
		Scanner sc = new Scanner(System.in);
		double broj;

		try {
			InputStream is = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(is);
			Sheet sheet = wb.getSheetAt(0);

			int poslednjiIndex = sheet.getLastRowNum();
			double zbir = 0;
			boolean kraj = false;

			while (!kraj) {
				try {
					System.out.println("Da li zelite da unesete jos brojeva?  DA/NE");

					if (sc.next().toUpperCase().equals("NE")) {
						kraj = true;
					} else {
						System.out.println("Unesite broj");
						broj = sc.nextDouble();
						Row rowUnos = sheet.createRow(poslednjiIndex + 1);
						poslednjiIndex++;
						Cell cellUnos = rowUnos.createCell(0);
						cellUnos.setCellValue(broj);

					}
					OutputStream os = new FileOutputStream("domaci.xlsx");
					wb.write(os);

				} catch (IOException e) {
					System.out.println("doslo je do greske");
					e.printStackTrace();
				}

			}

			for (int i = 0; i <= poslednjiIndex; i++) {
				Row row = sheet.getRow(i);
				Cell cell = row.getCell(0);
				zbir = zbir + cell.getNumericCellValue();
			}
			System.out.println(zbir);

			wb.close();

		} catch (IOException e) {
			System.out.println("Fajl nije pronadjen!");
			e.printStackTrace();
		} finally {
			sc.close();

		}

	}
}
