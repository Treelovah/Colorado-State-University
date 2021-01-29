#include "field.h"

/** @file field.c
 *  @brief You will modify this file and implement five functions
 *  @details Your implementation of the functions defined in field.h.
 *  You may add other function if you find it helpful. 
 * <p>
 * @author <b>Marshall Livingston</b> 
 */

/** @todo Implement in field.c based on documentation contained in field.h */
int getBit(int value, int position)
{
    return (value >> position) & 1;
}

/** @todo Implement in field.c based on documentation contained in field.h */
int setBit(int value, int position)
{
    return value | (1 << position);
}

/** @todo Implement in field.c based on documentation contained in field.h */
int clearBit(int value, int position)
{
    return (value & (~(1 << (position))));
}

/** @todo Implement in field.c based on documentation contained in field.h */
int getField(int value, int hi, int lo, bool isSigned)
{
    unsigned int n = value << (31 - hi);
    n >>= 31 - (hi - lo);
    return isSigned ? ~(int)n + 1 : (int)n;
}