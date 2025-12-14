package conditional_statement;

public class Conditional_statements {

	public static void main(String[] args) {
		// Find the lowest number from 3
		int a = 25;
		int b = 45;
		int c = 55;
		if (a < b && b > a) {
			System.out.println("a is the smallest number");
		} else if (b < c && c > b) {
			System.out.println("b is the smallest number");
		} else if (b > a || c < b) {
			System.out.println("c is the smallest number");
		} else {
			System.out.println("no number is smaller");
		}

		System.out.println("------------------------------------------");

		// Find the largest number from 2

		int p = 45;
		int q = 55;
		if (p > q) {
			System.out.println("The largest number is " + p);
		} else {
			System.out.println("The largest number is " + q);
		}
		System.out.println("------------------------------------------");
		// Find the smallest number from 2
		if (p < q) {
			System.out.println("The smallest number is " + p);
		} else {
			System.out.println("The smallest number is " + q);

		}
		System.out.println("-----------------------------------------");

		// 24-09-25

		// Print month_number on the basis of month_name
		String month_name = "jan";
		if (month_name == "jan") {
			System.out.println("month_number is 1");

		} else if (month_name == "feb") {
			System.out.println("month_number is 2");
		}

		else if (month_name == "Mar") {
			System.out.println("month_number is 3");
		} else if (month_name == "April") {
			System.out.println("month_number is 4");
		} else if (month_name == "May") {
			System.out.println("month_number is 5");
		} else if (month_name == "june") {
			System.out.println("month_number is 6");
		} else if (month_name == "July") {
			System.out.println("month_number is 7");
		} else if (month_name == "Aug") {
			System.out.println("month_number is 8");
		} else if (month_name == "Sept") {
			System.out.println("month_number is 9");
		} else if (month_name == "Oct") {
			System.out.println("month_number is 10");
		} else if (month_name == "Nov") {
			System.out.println("month_number is 11");
		} else if (month_name == "Dec") {
			System.out.println("month_number is 12");
		} else {
			System.out.println("Invalid month number");
		}

		System.out.println("---------------------------------------");

		// Print week_name on the basis of week_number
		String week_name = "Friday";
		if (week_name == "Monday") {
			System.out.println("week number is 1");
		} else if (week_name == "Tuesday") {
			System.out.println("week number is 2");
		} else if (week_name == "wednesday") {
			System.out.println("week number is 3");
		} else if (week_name == "Thursday") {
			System.out.println("week number is 4");
		} else if (week_name == "Friday") {
			System.out.println("week number is 5");
		} else if (week_name == "Saturday") {
			System.out.println("week number is 6");
		} else if (week_name == "Sunday") {
			System.out.println("week number is 7");
		} else {
			System.out.println("Invalid week number");
		}
		System.out.println("-------------------------------------");

		// Print week_number on the basis of week_name
		int week_number = 1;
		if (week_number == 1) {
			System.out.println("Monday");
		} else if (week_number == 2) {
			System.out.println("Tuesday");
		} else if (week_number == 3) {
			System.out.println("Wednesday");
		} else if (week_number == 4) {
			System.out.println("Thursday");
		} else if (week_number == 5) {
			System.out.println("Friday");
		} else if (week_number == 6) {
			System.out.println("Saturday");
		} else if (week_number == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("Invalid weekname");
		}
		System.out.println("---------------------------------------");

		// Print employee_id on the basis of employee_name
		int employee_id = 03;
		if (employee_id == 01) {
			System.out.println("Shrutika");
		} else if (employee_id == 02) {
			System.out.println("Ankita");
		} else if (employee_id == 03) {
			System.out.println("Vaishnavi");
		} else if (employee_id == 04) {
			System.out.println("Nidhi");
		} else if (employee_id == 05) {
			System.out.println("Arohi");
		} else {
			System.out.println("Invalid employee_name");
		}
		System.out.println("----------------------------------");

		// 25-09-25

		// Print month_name on the basis of month_number
		int month_number = 11;
		switch (month_number) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("Octomber");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("Invalid Month name");
			break;
		}
		System.out.println("----------------------------------");

		// Print month_number on the basis of month_name

		String monthname = "Nov";
		switch (monthname) {
		case "jan":
			System.out.println(1);
			break;
		case "Feb":
			System.out.println(2);
			break;
		case "March":
			System.out.println(3);
			break;
		case "April":
			System.out.println(4);
			break;
		case "May":
			System.out.println(5);
			break;
		case "June":
			System.out.println(6);
			break;
		case "July":
			System.out.println(7);
			break;
		case "Aug":
			System.out.println(8);
			break;
		case "Sept":
			System.out.println(9);
			break;
		case "Oct":
			System.out.println(10);
			break;
		case "Nov":
			System.out.println(11);
			break;
		case "Dec":
			System.out.println(12);
			break;
		default:
			System.out.println("Invalid number");
			break;
		}
		System.out.println("-----------------------------");

		// Print weekname on the basis of weeknumber

		int weeknumber = 1;
		switch (weeknumber) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid weekname");
		}
		System.out.println("--------------------------");

		// Print weeknumber on the basis of weekname
		
		String weekname = "Wednesday";
		switch (weekname) {
		case "Monday":
			System.out.println(1);
			break;
		case "Tuesday":
			System.out.println(2);
			break;
		case "Wednesday":
			System.out.println(3);
			break;
		case "Thursday":
			System.out.println(4);
			break;
		case "Friday":
			System.out.println(5);
			break;
		case "Saturday":
			System.out.println(6);
			break;
		case "Sunday":
			System.out.println(7);
			break;
		default:
			System.out.println("Invalid number");
		}
		System.out.println("----------------------------------");

		// Print employeeId on the basis of employeeName

		String employeeName = "Shruti";
		switch (employeeName) {
		case "Ojas":
			System.out.println("001");
			break;
		case "Ankita":
			System.out.println("002");
			break;
		case "Nidhi":
			System.out.println("003");
			break;
		case "Shruti":
			System.out.println("004");
			break;
		case "Aarohi":
			System.out.println("005");
			break;
		case "Pranu":
			System.out.println("006");
			break;
		default:
			System.out.println("Invalid employeeId");
		}
		System.out.println("-------------------------------------");

		// Print employeeName on the basis of employeeId
		int employeeId = 007;
		switch (employeeId) {
		case 001:
			System.out.println("Ojas");
			break;
		case 002:
			System.out.println("Ankita");
			break;
		case 003:
			System.out.println("Shamal");
			break;
		case 004:
			System.out.println("Spruha");
			break;
		case 005:
			System.out.println("Shruti");
			break;
		case 006:
			System.out.println("Shrija");
			break;
		default:
			System.out.println("Invalid employeeName");
		}

	}

}
