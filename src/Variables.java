public class Variables {
    public static void main(String[] args) {
        /*
            1. char is of 2 bytes (It store the character representation of the ascii values)
            2. Range is from 0 to 65435 (0 to 2^15)
         */
        char var = 'a';
        System.out.println(var);

        /*
           1. bytes is of 1 bytes
           2. Range is from -128 to +127
           3>
        */
        byte a = 127;

        // Float is stored in 32 bit IEEE 754 Standard
        // Double is stored in 64 bit IEEE 754 Standard

        /*
          Step 1: Convert it in to Binary
          Step 2:
             1st Bit is Sign Bit | Rest 8 bits are exponent | Remaining 23 bits are mantissa/significant

          Step 3: Write it in the form of (1.xxx)*2^exponent
          For 100.001 ---> 1.00001 * 2 ^ 2 (As we moved the decimal two pointer ahead)
                             ----- (mantissa)
          Step 4: Steps to convert back to the actual float or decimal number
          (-1)^sign * (1+mantissa)* 2^exponent-127 (For float)

          For 1*(1 + 2^-5)*2^2
              33*4/32 = 4.125 (Actual answer)
         */
    }
}