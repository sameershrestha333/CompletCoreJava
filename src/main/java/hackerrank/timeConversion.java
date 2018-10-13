package hackerrank;

public class timeConversion {
	static String timeConversion(String s) {
		int length = s.length();
		if (s.equals("12:00:00AM")) {
			return "00:00:00";
		} else if (s.equals("12:00:00PM")) {
			return "12:00:00";
		} else {
			StringBuilder builder = new StringBuilder();
			char secondLastchar = s.charAt(length - 2);
			if (secondLastchar == 'P') {
				// s.replaceAll("PM","");
				String hours = s.substring(0, 2);
				String remainingHours = s.substring(2, 8);
				int intHours = Integer.parseInt(hours);

				String convertedhoursToString ="";

				if(intHours<12) {
					int convertedhours = intHours + 12;
					if (convertedhours >= 24) {
						convertedhoursToString = "00";
						
					}else {
						convertedhoursToString = String.valueOf(convertedhours);
					}

				}else {
					convertedhoursToString =hours;
				}

				
				return builder.append(convertedhoursToString).append(remainingHours).toString();
			} else {
				String hours = s.substring(0, 2);
				String remainingHours = s.substring(2, 8);
				int intHours = Integer.parseInt(hours);
				String convertedhoursToString ="";

				if(intHours>=12) {
					int convertedhours = intHours + 12;
					if (convertedhours >= 24) {
						convertedhoursToString = "00";
						
					}else {
						convertedhoursToString = String.valueOf(convertedhours);
					}

				}else {
					convertedhoursToString =hours;
				}
								
				return builder.append(convertedhoursToString).append(remainingHours).toString();
				// String remainingHours = s.substring(0,8);
				// return remainingHours;
			}
		}
		// return "";
	}

	public static void main(String[] args) {
		System.out.println(timeConversion("07:05:45PM"));
	}
}
