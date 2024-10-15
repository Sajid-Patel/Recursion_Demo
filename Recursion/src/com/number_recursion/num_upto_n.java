package com.number_recursion;
//print number from 0 upto n(given) value using recursion
class num_upto_n {

	static void uptoN(int n) {
		if (n >= 0) {
			uptoN(n - 1);
			System.out.print(n + " ");
		}
	}

	public static void main(String[] args) {
		num_upto_n.uptoN(20);
	}

}
