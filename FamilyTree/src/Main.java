import java.util.Arrays;

/**
 * @author khaza.shaik
 * Jan 24, 2019
 * 
 */

/**
 * @author khaza.shaik
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functions function = new Functions();
		
	
		function.createFamilyHeader("KHWAZUN", "M");
		function.createFamilyHeader("MASIFA", "F");

		function.createFamilyHeader("IBRAHIM", "M");
		function.createFamilyHeader("MAIMUNA", "F");
		
		
		
		function.born(function.getPerson("KHWAZUN"),function.getPerson("MASIFA"), "MASROOR", "M");
		function.born(function.getPerson("KHWAZUN"),function.getPerson("MASIFA"), "TARA", "F");
		function.born(function.getPerson("KHWAZUN"),function.getPerson("MASIFA"), "NANOON", "F");
		function.born(function.getPerson("KHWAZUN"),function.getPerson("MASIFA"), "JAMILA", "F");
		function.born(function.getPerson("KHWAZUN"),function.getPerson("MASIFA"), "SHAKEEBA", "F");
		function.born(function.getPerson("KHWAZUN"),function.getPerson("MASIFA"), "KHASIA", "F");
		
		function.born(function.getPerson("IBRAHIM"),function.getPerson("MAIMUNA"), "SATHAR", "M");
		function.born(function.getPerson("IBRAHIM"),function.getPerson("MAIMUNA"), "RAHEEMA", "F");
		
		function.marrage(function.getPerson("MASROOR"), function.getPerson("RAHEEMA"));
		function.born(function.getPerson("MASROOR"),function.getPerson("RAHEEMA"), "KHAJA", "M");
		function.born(function.getPerson("MASROOR"),function.getPerson("RAHEEMA"), "ASIF", "M");
		function.born(function.getPerson("MASROOR"),function.getPerson("RAHEEMA"), "SAFIYA", "F");
		
		function.createFamilyHeader("RAWOOF", "M");
		function.marrage(function.getPerson("RAWOOF"), function.getPerson("SAFIYA"));
		function.born(function.getPerson("RAWOOF"),function.getPerson("SAFIYA"), "REHAN", "M");
		function.born(function.getPerson("RAWOOF"),function.getPerson("SAFIYA"), "AYAN", "M");
	
		Functions.familyTree.forEach(p->{
			System.out.println(p);
		});
		
	}

}
