/**
 *  @author Marshall Livingston 
 */

#include <stdio.h>
#include <ctype.h>


/** @todo implement in <code>numconv.c</code> based on documentation contained 
 *  in <code>numconv.h</code>.
 */
char int2char(int radix, int value)
{
  char sN = '0';
  if (value < 2 || radix > 36) return '?';
  if (value > 9) return sN + value + 7;
  return sN + value;
}

/** @todo implement in <code>numconv.c</code> based on documentation contained 
 *  in <code>numconv.h</code>.
 */
int char2int(int radix, char digit)
{
  digit = toupper(digit);
  int holder;

  if (digit >= 48 && digit <= 57) holder = digit - 48;
  else holder = digit - 55;


  if (radix > 36 || radix < 2 || !isalnum(digit) || holder >= radix)
    return -1;

  if (digit >= 48 && digit <= 57) return digit - 48;
  else return digit - 55;
}

/** @todo implement in <code>numconv.c</code> based on documentation contained 
 *  in <code>numconv.h</code>.
 */
void divRem(int numerator, int divisor, int *quotient, int *remainder)
{
  *quotient =  (numerator/divisor);
  *remainder =  (numerator%divisor);

}

/** @todo implement in <code>numconv.c</code> based on documentation contained 
 *  in <code>numconv.h</code>.
 */
int ascii2int (int radix, int valueOfPrefix) {

  char c = getchar();
    
  if(c  == '\n') return valueOfPrefix;

  return ascii2int(radix,(radix * valueOfPrefix) + char2int(radix, c));
}

/** @todo implement in <code>numconv.c</code> based on documentation contained 
 *  in <code>numconv.h</code>.
 */
void int2ascii (int radix, int value) {
  char newChar;
    
  if(value == 0) return;
  else newChar = int2char(radix, value%radix);
  
  putchar(newChar);
}

/** @todo implement in <code>numconv.c</code> based on documentation contained 
 *  in <code>numconv.h</code>.
 */
double frac2double (int radix) {
  char c = toupper(getchar());

  if(c == '\n') return 0;
  else
  {
    int i = char2int(radix, c);
    return (i+frac2double(radix)) / radix;
  }
}