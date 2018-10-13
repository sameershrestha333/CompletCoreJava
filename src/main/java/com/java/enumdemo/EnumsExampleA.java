package com.java.enumdemo;

enum enumB {
	FIRST {
		@Override
		void commonMethod() {
			System.out.println("Common method Overridden in FIRST");
		}
	},

	SECOND {
		@Override
		void commonMethod() {
			System.out.println("Common method Overridden in SECOND");
		}
	},

	THIRD {
		@Override
		void commonMethod() {
			System.out.println("Common method Overridden in THIRD");
		}
	};

	void commonMethod() {
		System.out.println("Generalized method, Common to all constants");
	}
}

public class EnumsExampleA {
	public static void main(String[] args) {
		enumB.FIRST.commonMethod(); // Output : Common method Overridden in FIRST

		enumB.SECOND.commonMethod(); // Output : Common method Overridden in SECOND

		enumB.THIRD.commonMethod(); // Output : Common method Overridden in THIRD
	}
}