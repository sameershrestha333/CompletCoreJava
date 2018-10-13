package interviewquestion.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo2 {
	static List<Map<String, Object>> validateCards(String[] bannedPrefixes, String[] cardsToValidate) {

		List<Map<String, Object>> returnCardInfo = new ArrayList<>();

		for (String str : cardsToValidate) {
			Map<String, Object> cardInfo = new HashMap<>();
			int sum = 0;
			char[] charArray = str.toCharArray();
			cardInfo.put("card", str);

			cardInfo.put("isAllowed", true);
			for (String bannedCardPref : bannedPrefixes) {
				if (str.startsWith(bannedCardPref)) {
					cardInfo.put("isAllowed", false);
					break;
				}

			}
			for (int i = 0; i < charArray.length - 1; i++) {
				int intValue = Integer.parseInt(String.valueOf(charArray[i]));
				sum = sum + (intValue * 2);
			}
			int lastDigit = Integer.parseInt(String.valueOf(charArray[charArray.length - 1]));

			if (sum % 10 == lastDigit) {

				cardInfo.put("isValid", true);
			} else
				cardInfo.put("isValid", false);

			returnCardInfo.add(cardInfo);
		}

		return returnCardInfo;
	}

}

/*
 * class CardInfo { String card; boolean isValid; boolean isAllowed = true;
 * 
 * public String getCard() { return card; }
 * 
 * public void setCard(String card) { this.card = card; }
 * 
 * public boolean isValid() { return isValid; }
 * 
 * public void setValid(boolean isValid) { this.isValid = isValid; }
 * 
 * public boolean isAllowed() { return isAllowed; }
 * 
 * public void setAllowed(boolean isAllowed) { this.isAllowed = isAllowed; }
 * 
 * }
 */
