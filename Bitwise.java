class Bitwise{
	public static void main(String[] args) {

		int a = 5; // 0101
		int b = 3; // 0011

		/*
		&	AND
		if two bits are both 1 then the result will be a 1, otherwise they will both be a zero
		*/
		int result1 = a & b; // 0001

		/*
		|	OR
		if one bit is a 1 then the result is 1 otherwis the result is zero
		*/
		int result2 = a | b;  // 0111

		/*
		^	XOR
		Compares bits, if they are different then the result is 1, otherwise zero
		*/
		int result3 = a ^ b; // 0110

		/*
		~	NOT
		inverts all bits of the number
		*/
		int result4 = ~a; // 1010

		/*
		<<	Left shift
		*/
		int result5 = a << 1; // 1010


		/*
		>>	Right shift
		*/
		int result6 = a >> 1; // 0010

		/*
		>>> Unsigned right shift
		*/


	}
}