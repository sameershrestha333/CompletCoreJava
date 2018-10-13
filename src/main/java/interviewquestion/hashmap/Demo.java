package interviewquestion.hashmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Demo {

	static List<Map<String, Object>> personalizeCoupons(List<Map<String, Object>> coupons,
			List<String> preferredCategories) {

		List<Map<String, Object>> filteredCoupons = new ArrayList<>();
		List<Map<String, Object>> finalCoupons = new ArrayList<>();

		for (String category : preferredCategories) {
			for (Map<String, Object> map : coupons) {
				if (map.get("category").equals(category)) {
					filteredCoupons.add(map);
				}
			}

		}

		List<Double> discounts = new ArrayList<>();
		Map<Map<String, Object>, Double> mapOfDiscountAndCoupon = new HashMap<>();
		for (Map<String, Object> filt : filteredCoupons) {
			double couponAmt = Double.parseDouble(filt.get("couponAmount").toString());
			double price = Double.parseDouble(filt.get("itemPrice").toString());
			double discount = price - couponAmt;
			double percentDis = discount * 100 / price;
			discounts.add(percentDis);
			mapOfDiscountAndCoupon.put(filt, percentDis);
		}
		Collections.sort(discounts);
		List<Double> top10list = discounts.stream().limit(11).collect(Collectors.toList());
		for (Double discount : top10list) {
			Set<Map<String, Object>> set = mapOfDiscountAndCoupon.keySet();

			for (Map<String, Object> map : set) {
				double fromMap = mapOfDiscountAndCoupon.get(map);
				if (discount == fromMap) {
					
					finalCoupons.add(map);
				}

			}

		}

		return finalCoupons;
	}

	public static void main(String[] args) {

		Map<String, Object> coupon = new HashMap<>();
		coupon.put("upc", "0677335752583272");
		coupon.put("code", "39385271820845634478");
		coupon.put("category", "Sporting Goods");
		coupon.put("itemPrice", "10.97");
		coupon.put("couponAmount", "5.02");

		List<Map<String, Object>> coupons = new ArrayList<>();
		coupons.add(coupon);
		List<String> preferredCategories = new ArrayList<>();
		preferredCategories.add("Sporting Goods");
		personalizeCoupons(coupons, preferredCategories);
	}
}
