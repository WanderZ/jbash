/* Generated By:JavaCC: Do not edit this line. jBashTokenManager.java */
package jBash;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
import SPTP.protocol.CommonClasses.Compression;
import SPTP.protocol.CommonClasses.Compression.compressionType;
import SPTP.protocol.ClientInterface.SPTPclient;
import SPTP.protocol.ClientInterface.SPTPclientInterface;
import SPTP.protocol.ServerInterface.ServerInterface;
import SPTP.protocol.ServerInterface.ServerThread;

/** Token Manager. */
public class jBashTokenManager implements jBashConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0, long active1)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x1000000000L) != 0L)
            return 22;
         if ((active0 & 0x8000000L) != 0L)
            return 23;
         if ((active0 & 0xffffffc000000000L) != 0L || (active1 & 0xfffL) != 0L)
         {
            jjmatchedKind = 77;
            return 3;
         }
         if ((active0 & 0x2001000000L) != 0L)
            return 8;
         return -1;
      case 1:
         if ((active0 & 0xfdfee58000000000L) != 0L || (active1 & 0xfffL) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 77;
               jjmatchedPos = 1;
            }
            return 3;
         }
         if ((active0 & 0x2011a4000000000L) != 0L)
            return 3;
         return -1;
      case 2:
         if ((active0 & 0xfdfef18000000000L) != 0L || (active1 & 0xfffL) != 0L)
         {
            jjmatchedKind = 77;
            jjmatchedPos = 2;
            return 3;
         }
         if ((active0 & 0x40000000000L) != 0L)
            return 3;
         return -1;
      case 3:
         if ((active0 & 0x1dd8e00000000000L) != 0L || (active1 & 0x7d1L) != 0L)
         {
            jjmatchedKind = 77;
            jjmatchedPos = 3;
            return 3;
         }
         if ((active0 & 0xe026118000000000L) != 0L || (active1 & 0x82eL) != 0L)
            return 3;
         return -1;
      case 4:
         if ((active0 & 0x1c58800000000000L) != 0L || (active1 & 0x291L) != 0L)
         {
            jjmatchedKind = 77;
            jjmatchedPos = 4;
            return 3;
         }
         if ((active0 & 0x180600000000000L) != 0L || (active1 & 0x540L) != 0L)
            return 3;
         return -1;
      case 5:
         if ((active0 & 0x1c48000000000000L) != 0L || (active1 & 0x210L) != 0L)
         {
            jjmatchedKind = 77;
            jjmatchedPos = 5;
            return 3;
         }
         if ((active0 & 0x10800000000000L) != 0L || (active1 & 0x81L) != 0L)
            return 3;
         return -1;
      case 6:
         if ((active0 & 0x1c00000000000000L) != 0L || (active1 & 0x210L) != 0L)
            return 3;
         if ((active0 & 0x48000000000000L) != 0L)
         {
            jjmatchedKind = 77;
            jjmatchedPos = 6;
            return 3;
         }
         return -1;
      case 7:
         if ((active0 & 0x8000000000000L) != 0L)
            return 3;
         if ((active0 & 0x40000000000000L) != 0L)
         {
            jjmatchedKind = 77;
            jjmatchedPos = 7;
            return 3;
         }
         return -1;
      case 8:
         if ((active0 & 0x40000000000000L) != 0L)
         {
            jjmatchedKind = 77;
            jjmatchedPos = 8;
            return 3;
         }
         return -1;
      case 9:
         if ((active0 & 0x40000000000000L) != 0L)
         {
            jjmatchedKind = 77;
            jjmatchedPos = 9;
            return 3;
         }
         return -1;
      case 10:
         if ((active0 & 0x40000000000000L) != 0L)
         {
            jjmatchedKind = 77;
            jjmatchedPos = 10;
            return 3;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0, long active1)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0, active1), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 9);
      case 33:
         jjmatchedKind = 29;
         return jjMoveStringLiteralDfa1_0(0x10000L, 0x0L);
      case 35:
         return jjStopAtPos(0, 4);
      case 36:
         return jjStopAtPos(0, 28);
      case 37:
         return jjStopAtPos(0, 25);
      case 38:
         jjmatchedKind = 11;
         return jjMoveStringLiteralDfa1_0(0x1000L, 0x0L);
      case 39:
         return jjStartNfaWithStates_0(0, 36, 22);
      case 40:
         jjmatchedKind = 32;
         return jjMoveStringLiteralDfa1_0(0x400000000L, 0x0L);
      case 41:
         jjmatchedKind = 33;
         return jjMoveStringLiteralDfa1_0(0x800000000L, 0x0L);
      case 42:
         return jjStopAtPos(0, 23);
      case 43:
         return jjStopAtPos(0, 26);
      case 45:
         return jjStartNfaWithStates_0(0, 27, 23);
      case 46:
         return jjStartNfaWithStates_0(0, 37, 8);
      case 47:
         return jjStartNfaWithStates_0(0, 24, 8);
      case 48:
         return jjStopAtPos(0, 82);
      case 59:
         jjmatchedKind = 7;
         return jjMoveStringLiteralDfa1_0(0x100L, 0x0L);
      case 60:
         jjmatchedKind = 17;
         return jjMoveStringLiteralDfa1_0(0x280000L, 0x0L);
      case 61:
         jjmatchedKind = 14;
         return jjMoveStringLiteralDfa1_0(0x8000L, 0x0L);
      case 62:
         jjmatchedKind = 18;
         return jjMoveStringLiteralDfa1_0(0x500000L, 0x0L);
      case 66:
         return jjMoveStringLiteralDfa1_0(0x40000000000000L, 0x0L);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x80000000000000L, 0x0L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x100000000000000L, 0x0L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x602000000000000L, 0x0L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x800180000000000L, 0x0L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0xe004018000000000L, 0x1L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x8060000000000L, 0x0L);
      case 104:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x2L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x1004000000000L, 0x0L);
      case 107:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x4L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x10000000000000L, 0x0L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x800000000000L, 0x18L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x1020000000000000L, 0x60L);
      case 117:
         return jjMoveStringLiteralDfa1_0(0x400000000000L, 0x780L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x200000000000L, 0x800L);
      case 123:
         return jjStopAtPos(0, 30);
      case 124:
         jjmatchedKind = 10;
         return jjMoveStringLiteralDfa1_0(0x2000L, 0x0L);
      case 125:
         return jjStopAtPos(0, 31);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0, long active1)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0, active1);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x1000L) != 0L)
            return jjStopAtPos(1, 12);
         break;
      case 40:
         if ((active0 & 0x400000000L) != 0L)
            return jjStopAtPos(1, 34);
         break;
      case 41:
         if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(1, 35);
         break;
      case 59:
         if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(1, 8);
         break;
      case 60:
         if ((active0 & 0x200000L) != 0L)
            return jjStopAtPos(1, 21);
         break;
      case 61:
         if ((active0 & 0x8000L) != 0L)
            return jjStopAtPos(1, 15);
         else if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(1, 16);
         else if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(1, 19);
         else if ((active0 & 0x100000L) != 0L)
            return jjStopAtPos(1, 20);
         break;
      case 62:
         if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(1, 22);
         break;
      case 65:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000000000L, active1, 0L);
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000000000L, active1, 0x800L);
      case 99:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000000000000L, active1, 0L);
      case 100:
         if ((active0 & 0x200000000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 57, 3);
         break;
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x810800000000000L, active1, 0x22L);
      case 102:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 38, 3);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x20200000000000L, active1, 0L);
      case 105:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 41, 3);
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x44L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x80018000000000L, active1, 0x80L);
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x100L);
      case 110:
         if ((active0 & 0x1000000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 48, 3);
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000000L, active1, 0x600L);
      case 111:
         if ((active0 & 0x80000000000L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x400140000000000L, active1, 0L);
      case 112:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x8L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000000000000L, active1, 0L);
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000000000L, active1, 0L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000000000L, active1, 0x10L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0xc000000000000000L, active1, 0x1L);
      case 121:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000000000000L, active1, 0L);
      case 124:
         if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(1, 13);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0, active1);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(0, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0, active1);
      return 2;
   }
   switch(curChar)
   {
      case 83:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000000000L, active1, 0L);
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000000000L, active1, 0x300L);
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000000000000L, active1, 0L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x4120000000000000L, active1, 0L);
      case 104:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000000000000L, active1, 0L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x8080208000000000L, active1, 0x880L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000000000L, active1, 0x6L);
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000000000L, active1, 0x40L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x8100000000000L, active1, 0L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000000000000L, active1, 0x1L);
      case 114:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 42, 3);
         break;
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x2010000000000L, active1, 0x430L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x10400000000000L, active1, 0x8L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0, active1);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(1, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0, active1);
      return 3;
   }
   switch(curChar)
   {
      case 72:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000000000000L, active1, 0L);
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x180000000000000L, active1, 0L);
      case 99:
         if ((active0 & 0x4000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 50, 3);
         else if ((active0 & 0x4000000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 62, 3);
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000000000L, active1, 0L);
      case 101:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 40, 3);
         else if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 44, 3);
         else if ((active0 & 0x2000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 49, 3);
         return jjMoveStringLiteralDfa4_0(active0, 0x1000800000000000L, active1, 0x440L);
      case 102:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 39, 3);
         break;
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000000000L, active1, 0L);
      case 108:
         if ((active1 & 0x4L) != 0L)
            return jjStartNfaWithStates_0(3, 66, 3);
         return jjMoveStringLiteralDfa4_0(active0, 0x800200000000000L, active1, 0x200L);
      case 109:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000000000000L, active1, 0x80L);
      case 110:
         if ((active0 & 0x20000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 53, 3);
         break;
      case 111:
         if ((active0 & 0x2000000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 61, 3);
         return jjMoveStringLiteralDfa4_0(active0, 0L, active1, 0x1L);
      case 112:
         if ((active1 & 0x2L) != 0L)
            return jjStartNfaWithStates_0(3, 65, 3);
         else if ((active1 & 0x8L) != 0L)
            return jjStartNfaWithStates_0(3, 67, 3);
         return jjMoveStringLiteralDfa4_0(active0, 0L, active1, 0x10L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0L, active1, 0x100L);
      case 116:
         if ((active0 & 0x8000000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 63, 3);
         else if ((active1 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(3, 69, 3);
         else if ((active1 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(3, 75, 3);
         break;
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000000000000L, active1, 0L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0, active1);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(2, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0, active1);
      return 4;
   }
   switch(curChar)
   {
      case 95:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000000000000L, active1, 0L);
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0xc00000000000000L, active1, 0L);
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000000000L, active1, 0L);
      case 101:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 45, 3);
         return jjMoveStringLiteralDfa5_0(active0, 0L, active1, 0x10L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0L, active1, 0x280L);
      case 107:
         if ((active0 & 0x100000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 56, 3);
         else if ((active1 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(4, 72, 3);
         break;
      case 108:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 46, 3);
         break;
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000000000000L, active1, 0x1L);
      case 115:
         if ((active0 & 0x80000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 55, 3);
         else if ((active1 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(4, 70, 3);
         return jjMoveStringLiteralDfa5_0(active0, 0x1000000000000000L, active1, 0L);
      case 116:
         if ((active1 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(4, 74, 3);
         return jjMoveStringLiteralDfa5_0(active0, 0x8000000000000L, active1, 0L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0, active1);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(3, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0, active1);
      return 5;
   }
   switch(curChar)
   {
      case 86:
         return jjMoveStringLiteralDfa6_0(active0, 0x40000000000000L, active1, 0L);
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0L, active1, 0x200L);
      case 101:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000000000000000L, active1, 0L);
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000000000L, active1, 0L);
      case 110:
         if ((active0 & 0x10000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 52, 3);
         return jjMoveStringLiteralDfa6_0(active0, 0x400000000000000L, active1, 0x10L);
      case 114:
         return jjMoveStringLiteralDfa6_0(active0, 0x800000000000000L, active1, 0L);
      case 116:
         if ((active0 & 0x800000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 47, 3);
         else if ((active1 & 0x1L) != 0L)
            return jjStartNfaWithStates_0(5, 64, 3);
         else if ((active1 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(5, 71, 3);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0, active1);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(4, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0, active1);
      return 6;
   }
   switch(curChar)
   {
      case 69:
         return jjMoveStringLiteralDfa7_0(active0, 0x40000000000000L, active1, 0L);
      case 100:
         if ((active0 & 0x400000000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 58, 3);
         else if ((active1 & 0x10L) != 0L)
            return jjStartNfaWithStates_0(6, 68, 3);
         break;
      case 101:
         if ((active0 & 0x800000000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 59, 3);
         break;
      case 111:
         return jjMoveStringLiteralDfa7_0(active0, 0x8000000000000L, active1, 0L);
      case 115:
         if ((active1 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(6, 73, 3);
         break;
      case 116:
         if ((active0 & 0x1000000000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 60, 3);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0, active1);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(5, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0, 0L);
      return 7;
   }
   switch(curChar)
   {
      case 82:
         return jjMoveStringLiteralDfa8_0(active0, 0x40000000000000L);
      case 110:
         if ((active0 & 0x8000000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 51, 3);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0, 0L);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0, 0L);
      return 8;
   }
   switch(curChar)
   {
      case 83:
         return jjMoveStringLiteralDfa9_0(active0, 0x40000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0, 0L);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0, 0L);
      return 9;
   }
   switch(curChar)
   {
      case 73:
         return jjMoveStringLiteralDfa10_0(active0, 0x40000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0, 0L);
}
static private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0, 0L);
      return 10;
   }
   switch(curChar)
   {
      case 79:
         return jjMoveStringLiteralDfa11_0(active0, 0x40000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0, 0L);
}
static private int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0, 0L);
      return 11;
   }
   switch(curChar)
   {
      case 78:
         if ((active0 & 0x40000000000000L) != 0L)
            return jjStartNfaWithStates_0(11, 54, 3);
         break;
      default :
         break;
   }
   return jjStartNfa_0(10, active0, 0L);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 22;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 76)
                        kind = 76;
                     jjCheckNAdd(1);
                  }
                  else if ((0xc00000000000L & l) != 0L)
                  {
                     if (kind > 81)
                        kind = 81;
                     jjCheckNAdd(8);
                  }
                  else if (curChar == 45)
                     jjAddStates(0, 6);
                  else if (curChar == 39)
                     jjCheckNAddTwoStates(5, 6);
                  break;
               case 22:
                  if ((0xffffff7bffffdbffL & l) != 0L)
                     jjCheckNAddTwoStates(5, 6);
                  else if (curChar == 39)
                  {
                     if (kind > 80)
                        kind = 80;
                  }
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 76)
                     kind = 76;
                  jjCheckNAdd(1);
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 77)
                     kind = 77;
                  jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 4:
                  if (curChar == 39)
                     jjCheckNAddTwoStates(5, 6);
                  break;
               case 5:
                  if ((0xffffff7bffffdbffL & l) != 0L)
                     jjCheckNAddTwoStates(5, 6);
                  break;
               case 6:
                  if (curChar == 39 && kind > 80)
                     kind = 80;
                  break;
               case 7:
                  if ((0xc00000000000L & l) == 0L)
                     break;
                  if (kind > 81)
                     kind = 81;
                  jjCheckNAdd(8);
                  break;
               case 8:
                  if ((0x7ffe81000000000L & l) == 0L)
                     break;
                  if (kind > 81)
                     kind = 81;
                  jjCheckNAdd(8);
                  break;
               case 9:
                  if (curChar == 45)
                     jjAddStates(0, 6);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 23:
                  if ((0x5fffbfe00491160L & l) != 0L)
                  {
                     if (kind > 83)
                        kind = 83;
                     jjCheckNAddStates(0, 6);
                  }
                  if (curChar == 110)
                     jjCheckNAddTwoStates(11, 13);
                  else if (curChar == 103)
                     jjCheckNAddTwoStates(11, 13);
                  else if (curChar == 101)
                     jjAddStates(7, 8);
                  else if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 15;
                  else if (curChar == 111)
                     jjCheckNAdd(13);
                  else if (curChar == 108)
                     jjCheckNAdd(11);
                  break;
               case 0:
               case 3:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 77)
                     kind = 77;
                  jjCheckNAdd(3);
                  break;
               case 22:
               case 5:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddTwoStates(5, 6);
                  break;
               case 8:
                  if ((0x7fffffe87ffffffL & l) == 0L)
                     break;
                  if (kind > 81)
                     kind = 81;
                  jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if ((0x5fffbfe00491160L & l) == 0L)
                     break;
                  if (kind > 83)
                     kind = 83;
                  jjCheckNAddStates(0, 6);
                  break;
               case 11:
                  if (curChar != 101)
                     break;
                  if (kind > 83)
                     kind = 83;
                  jjCheckNAddStates(0, 6);
                  break;
               case 12:
                  if (curChar == 108)
                     jjCheckNAdd(11);
                  break;
               case 13:
                  if (curChar != 116)
                     break;
                  if (kind > 83)
                     kind = 83;
                  jjCheckNAddStates(0, 6);
                  break;
               case 14:
                  if (curChar == 111)
                     jjCheckNAdd(13);
                  break;
               case 15:
                  if (curChar != 108)
                     break;
                  if (kind > 83)
                     kind = 83;
                  jjCheckNAddStates(0, 6);
                  break;
               case 16:
                  if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 17:
                  if (curChar == 101)
                     jjAddStates(7, 8);
                  break;
               case 18:
                  if (curChar != 113)
                     break;
                  if (kind > 83)
                     kind = 83;
                  jjCheckNAddStates(0, 6);
                  break;
               case 19:
                  if (curChar == 103)
                     jjCheckNAddTwoStates(11, 13);
                  break;
               case 20:
                  if (curChar == 110)
                     jjCheckNAddTwoStates(11, 13);
                  break;
               case 21:
                  if (curChar != 102)
                     break;
                  if (kind > 83)
                     kind = 83;
                  jjCheckNAddStates(0, 6);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 22:
               case 5:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(5, 6);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 22 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static private int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 5);
      default :
         return 1;
   }
}
static final int[] jjnextStates = {
   10, 12, 14, 16, 17, 19, 20, 18, 21, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, "\73", "\73\73", "\12", "\174", "\46", 
"\46\46", "\174\174", "\75", "\75\75", "\41\75", "\74", "\76", "\74\75", "\76\75", 
"\74\74", "\76\76", "\52", "\57", "\45", "\53", "\55", "\44", "\41", "\173", "\175", 
"\50", "\51", "\50\50", "\51\51", "\47", "\56", "\151\146", "\145\154\151\146", 
"\145\154\163\145", "\146\151", "\146\157\162", "\144\157", "\144\157\156\145", 
"\167\150\151\154\145", "\165\156\164\151\154", "\163\145\154\145\143\164", "\151\156", 
"\143\141\163\145", "\145\163\141\143", "\146\165\156\143\164\151\157\156", 
"\162\145\164\165\162\156", "\164\150\145\156", "\102\101\123\110\137\126\105\122\123\111\117\116", 
"\141\154\151\141\163", "\142\162\145\141\153", "\143\144", "\143\157\155\155\141\156\144", 
"\144\145\143\154\141\162\145", "\164\171\160\145\163\145\164", "\145\143\150\157", "\145\170\145\143", 
"\145\170\151\164", "\145\170\160\157\162\164", "\150\145\154\160", "\153\151\154\154", 
"\163\160\164\160", "\163\165\163\160\145\156\144", "\164\145\163\164", "\164\151\155\145\163", 
"\165\154\151\155\151\164", "\165\155\141\163\153", "\165\156\141\154\151\141\163", 
"\165\156\163\145\164", "\167\141\151\164", null, null, null, null, null, null, "\60", null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "IN_LINE_COMMENT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, 1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0xffffffffffffff81L, 0xf3fffL, 
};
static final long[] jjtoSkip = {
   0x3eL, 0x0L, 
};
static final long[] jjtoMore = {
   0x40L, 0x0L, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[22];
static private final int[] jjstateSet = new int[44];
static protected char curChar;
/** Constructor. */
public jBashTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public jBashTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 22; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 2 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         try { input_stream.backup(0);
            while (curChar <= 32 && (0x100002200L & (1L << curChar)) != 0L)
               curChar = input_stream.BeginToken();
         }
         catch (java.io.IOException e1) { continue EOFLoop; }
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         if (jjmatchedPos == 0 && jjmatchedKind > 6)
         {
            jjmatchedKind = 6;
         }
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
   }
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
