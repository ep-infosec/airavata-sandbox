/*
*
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*   http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*
*/
package org.apache.airavata.datacat.parsers.gridchem.input;/* The following code was generated by JFlex 1.4.3 on 9/11/14 6:37 PM */

import java_cup.runtime.Symbol;
import org.apache.airavata.datacat.parsers.gridchem.Settings;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 9/11/14 6:37 PM from the specification file
 * <tt>input.flex</tt>
 */
public class InputLexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int INPUTF = 30;
  public static final int ITER2 = 4;
  public static final int INPUTE = 28;
  public static final int INPUTD = 26;
  public static final int INPUTC = 24;
  public static final int INPUTB = 22;
  public static final int INPUTA = 20;
  public static final int INTVALUE = 8;
  public static final int INPUT = 18;
  public static final int IGNOREALL = 16;
  public static final int ITER = 2;
  public static final int YYINITIAL = 0;
  public static final int FLOAT2 = 14;
  public static final int FLOAT1 = 12;
  public static final int FLOATVALUE = 10;
  public static final int ITER3 = 6;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2, 
     2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7,  8,  8,  9, 9
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    11,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  2,  0, 31,  3,  0, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0, 27, 25,  4,  0, 24, 29,  0,  0, 30,  0,  5, 28, 
     0,  0,  0,  0, 23,  0,  0,  0, 20, 21, 22,  0,  0,  0,  0, 26, 
     0,  0,  8,  0,  0,  9, 13,  0, 19, 17,  0,  0,  0,  7, 18, 12, 
    16,  0, 10, 14, 15,  6,  0,  0,  0,  0,  0,  0,  2,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\12\0\4\1\1\2\2\1\1\3\1\1\1\4\10\1"+
    "\17\0\1\5\1\6\1\7\72\0\1\10\47\0\1\11"+
    "\5\0\1\12\124\0\1\13\1\14";

  private static int [] zzUnpackAction() {
    int [] result = new int[237];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\40\0\100\0\140\0\200\0\240\0\300\0\340"+
    "\0\u0100\0\u0120\0\u0140\0\u0160\0\u0180\0\u01a0\0\u01c0\0\u01c0"+
    "\0\u01e0\0\u0200\0\u0200\0\u0220\0\u0220\0\u0240\0\u0260\0\u0280"+
    "\0\u02a0\0\u02c0\0\u02e0\0\u0300\0\u0320\0\u0340\0\u0360\0\u0380"+
    "\0\u0240\0\u03a0\0\u0280\0\u03c0\0\u02c0\0\u03e0\0\u0400\0\u0420"+
    "\0\u0440\0\u0460\0\u0480\0\u03a0\0\u03c0\0\u03e0\0\u04a0\0\u04c0"+
    "\0\u04e0\0\u0500\0\u0520\0\u0540\0\u0560\0\u0580\0\u05a0\0\u05c0"+
    "\0\u05e0\0\u0600\0\u0620\0\u0640\0\u0660\0\u0680\0\u06a0\0\u06c0"+
    "\0\u06e0\0\u0700\0\u0720\0\u0740\0\u0760\0\u0780\0\u07a0\0\u07c0"+
    "\0\u07e0\0\u0800\0\u0820\0\u0840\0\u0860\0\u0880\0\u08a0\0\u08c0"+
    "\0\u08e0\0\u0900\0\u0920\0\u0940\0\u0960\0\u0980\0\u09a0\0\u09c0"+
    "\0\u09e0\0\u0a00\0\u0a20\0\u0a40\0\u0a60\0\u0a80\0\u0aa0\0\u0ac0"+
    "\0\u0ae0\0\u0b00\0\u0b20\0\u0b40\0\u0b60\0\u0b80\0\u0ba0\0\u0bc0"+
    "\0\u0140\0\u0be0\0\u0c00\0\u0c20\0\u0c40\0\u0c60\0\u0c80\0\u0ca0"+
    "\0\u0cc0\0\u0ce0\0\u0d00\0\u0d20\0\u0d40\0\u0d60\0\u0d80\0\u0da0"+
    "\0\u0dc0\0\u0de0\0\u0e00\0\u0e20\0\u0e40\0\u0e60\0\u0e80\0\u0ea0"+
    "\0\u0ec0\0\u0ee0\0\u0f00\0\u0f20\0\u0f40\0\u0f60\0\u0f80\0\u0fa0"+
    "\0\u0fc0\0\u0fe0\0\u1000\0\u1020\0\u1040\0\u1060\0\u1080\0\u10a0"+
    "\0\u0140\0\u10c0\0\u10e0\0\u1100\0\u1120\0\u1140\0\u0140\0\u1160"+
    "\0\u1180\0\u11a0\0\u11c0\0\u11e0\0\u1200\0\u1220\0\u1240\0\u1260"+
    "\0\u1280\0\u12a0\0\u12c0\0\u12e0\0\u1300\0\u1320\0\u1340\0\u1360"+
    "\0\u1380\0\u13a0\0\u13c0\0\u13e0\0\u1400\0\u1420\0\u1440\0\u1460"+
    "\0\u1480\0\u14a0\0\u14c0\0\u14e0\0\u1500\0\u1520\0\u1540\0\u1560"+
    "\0\u1580\0\u15a0\0\u15c0\0\u15e0\0\u1600\0\u1620\0\u1640\0\u1660"+
    "\0\u1680\0\u16a0\0\u16c0\0\u16e0\0\u1700\0\u1720\0\u1740\0\u1760"+
    "\0\u1780\0\u17a0\0\u17c0\0\u17e0\0\u1800\0\u1820\0\u1840\0\u1860"+
    "\0\u1880\0\u18a0\0\u18c0\0\u18e0\0\u1900\0\u1920\0\u1940\0\u1960"+
    "\0\u1980\0\u19a0\0\u19c0\0\u19e0\0\u1a00\0\u1a20\0\u1a40\0\u1a60"+
    "\0\u1a80\0\u1aa0\0\u1ac0\0\u1ae0\0\u1b00\0\u1b20\0\u1b40\0\u1b60"+
    "\0\u1b80\0\u1ba0\0\u1bc0\0\u0140\0\u0140";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[237];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\5\13\1\14\56\13\1\15\2\13\1\16\51\13\1\17"+
    "\1\20\34\13\1\21\1\13\1\22\1\23\34\13\1\23"+
    "\1\13\1\24\1\25\34\13\1\25\1\13\1\26\1\27"+
    "\34\13\1\27\1\13\1\30\1\31\34\13\1\31\1\13"+
    "\1\32\1\33\34\13\1\33\37\13\1\34\46\0\1\35"+
    "\44\0\1\36\54\0\1\37\10\0\1\17\37\0\1\17"+
    "\35\0\1\40\1\0\1\22\37\0\1\24\37\0\1\41"+
    "\1\0\1\42\35\0\1\41\37\0\1\43\1\0\1\44"+
    "\35\0\1\43\37\0\1\45\1\0\1\46\35\0\1\45"+
    "\75\0\1\47\7\0\1\50\43\0\1\51\55\0\1\52"+
    "\45\0\1\53\1\0\1\54\37\0\1\55\37\0\1\56"+
    "\75\0\1\57\10\0\1\60\42\0\1\61\56\0\1\62"+
    "\44\0\1\63\37\0\1\64\11\0\1\65\41\0\1\66"+
    "\55\0\1\67\45\0\1\70\37\0\1\71\12\0\1\72"+
    "\40\0\1\73\31\0\1\74\71\0\1\75\37\0\1\76"+
    "\13\0\1\77\37\0\1\100\57\0\1\101\43\0\1\102"+
    "\37\0\1\103\14\0\1\104\36\0\1\105\56\0\1\106"+
    "\44\0\1\107\37\0\1\110\15\0\1\111\35\0\1\112"+
    "\60\0\1\113\42\0\1\114\37\0\1\115\13\0\1\116"+
    "\37\0\1\117\30\0\1\120\72\0\1\121\37\0\1\122"+
    "\16\0\1\123\34\0\1\124\56\0\1\125\44\0\1\126"+
    "\37\0\1\127\17\0\1\130\33\0\1\131\30\0\1\132"+
    "\72\0\1\133\37\0\1\134\11\0\1\135\53\0\1\136"+
    "\47\0\1\137\41\0\1\140\37\0\1\141\20\0\1\142"+
    "\32\0\1\143\62\0\1\144\40\0\1\145\37\0\1\146"+
    "\16\0\1\147\34\0\1\150\55\0\1\151\45\0\1\152"+
    "\37\0\1\153\13\0\1\154\37\0\1\155\63\0\1\156"+
    "\37\0\1\157\21\0\1\160\31\0\1\161\63\0\1\162"+
    "\37\0\1\163\22\0\1\164\30\0\1\165\63\0\1\166"+
    "\37\0\1\167\13\0\1\170\37\0\1\171\63\0\1\172"+
    "\37\0\1\173\17\0\1\174\33\0\1\175\63\0\1\176"+
    "\37\0\1\177\23\0\1\200\27\0\1\201\63\0\1\202"+
    "\37\0\1\203\21\0\1\204\31\0\1\205\63\0\1\206"+
    "\37\0\1\207\16\0\1\210\34\0\1\211\63\0\1\212"+
    "\37\0\1\213\13\0\1\214\37\0\1\215\63\0\1\216"+
    "\37\0\1\217\12\0\1\220\53\0\1\221\50\0\1\222"+
    "\37\0\1\223\6\0\1\224\70\0\1\225\37\0\1\226"+
    "\22\0\1\227\54\0\1\230\37\0\1\231\37\0\1\232"+
    "\37\0\1\233\37\0\1\234\37\0\1\235\37\0\1\236"+
    "\37\0\1\237\37\0\1\240\37\0\1\241\37\0\1\242"+
    "\37\0\1\243\37\0\1\244\37\0\1\245\37\0\1\246"+
    "\37\0\1\247\37\0\1\250\37\0\1\251\37\0\1\252"+
    "\37\0\1\253\37\0\1\254\37\0\1\255\37\0\1\256"+
    "\37\0\1\257\37\0\1\260\37\0\1\261\37\0\1\262"+
    "\37\0\1\263\37\0\1\264\37\0\1\265\37\0\1\266"+
    "\37\0\1\267\37\0\1\270\37\0\1\271\37\0\1\272"+
    "\37\0\1\273\37\0\1\274\37\0\1\275\37\0\1\276"+
    "\37\0\1\277\37\0\1\300\37\0\1\301\37\0\1\302"+
    "\37\0\1\303\37\0\1\304\37\0\1\305\37\0\1\306"+
    "\37\0\1\307\37\0\1\310\37\0\1\311\37\0\1\312"+
    "\37\0\1\313\37\0\1\314\37\0\1\315\37\0\1\316"+
    "\37\0\1\317\37\0\1\320\37\0\1\321\37\0\1\322"+
    "\37\0\1\323\37\0\1\324\37\0\1\325\37\0\1\326"+
    "\37\0\1\327\37\0\1\330\37\0\1\331\37\0\1\332"+
    "\37\0\1\333\37\0\1\334\37\0\1\335\37\0\1\336"+
    "\37\0\1\337\37\0\1\340\37\0\1\341\37\0\1\342"+
    "\37\0\1\343\37\0\1\344\37\0\1\345\37\0\1\346"+
    "\37\0\1\347\37\0\1\350\37\0\1\351\37\0\1\352"+
    "\37\0\1\353\37\0\1\354\37\0\1\355";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7136];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\12\0\1\11\21\1\17\0\3\1\72\0\1\11\47\0"+
    "\1\11\5\0\1\11\124\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[237];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public static boolean DEBUG = false;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public InputLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public InputLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 6: 
          { if  (Settings.DEBUG) System.out.println("InputFlex: Found y coord. in input");
  yybegin (INPUTE);
   return new Symbol(InputSym.INPUT6, new Float(yytext()));
          }
        case 13: break;
        case 7: 
          { if  (Settings.DEBUG) System.out.println("InputFlex: Found z coord. in input");
  yybegin (INPUT);
   return new Symbol(InputSym.INPUT7, new Float(yytext()));
          }
        case 14: break;
        case 4: 
          { if  (Settings.DEBUG) System.out.println("InputFlex: Found integer3 in input");
  yybegin (INPUTC);
   return new Symbol(InputSym.INPUT4, new Integer(yytext()));
          }
        case 15: break;
        case 11: 
          { if  (Settings.DEBUG) System.out.println("InputFlex: Found the second dash");
  yybegin (ITER);
   return new Symbol(InputSym.DASH2);
          }
        case 16: break;
        case 5: 
          { if  (Settings.DEBUG) System.out.println("InputFlex: Found x coord. in input");
  yybegin (INPUTD);
   return new Symbol(InputSym.INPUT5, new Float(yytext()));
          }
        case 17: break;
        case 12: 
          { if  (Settings.DEBUG) System.out.println("InputFlex: Found the first dash");
  yybegin (INPUT);
   return new Symbol(InputSym.DASH1);
          }
        case 18: break;
        case 9: 
          { if (Settings.DEBUG) System.out.println("InputFlex: Found Input Orientation");
            yybegin(INPUTF);
            return new Symbol(InputSym.INPUT1);
          }
        case 19: break;
        case 8: 
          { yybegin(IGNOREALL);
      return new Symbol(InputSym.SCFDONE);
          }
        case 20: break;
        case 3: 
          { if  (Settings.DEBUG) System.out.println("InputFlex: Found integer2 in input");
  yybegin (INPUTB);
   return new Symbol(InputSym.INPUT3, new Integer(yytext()));
          }
        case 21: break;
        case 10: 
          { if (Settings.DEBUG) System.out.println("InputFlex: Found Number of steps");
	   yybegin(ITER);
	   return new Symbol(InputSym.FOUNDITER);
          }
        case 22: break;
        case 1: 
          { 
          }
        case 23: break;
        case 2: 
          { if  (Settings.DEBUG) System.out.println("InputFlex: Found integer1 in input");
  yybegin (INPUTA);
   return new Symbol(InputSym.INPUT2, new Integer(yytext()));
          }
        case 24: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(InputSym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }

  /**
   * Converts an int token code into the name of the
   * token by reflection on the cup symbol class/interface sym
   *
   * This code was contributed by Karl Meissner <meissnersd@yahoo.com>
   */
  private String getTokenName(int token) {
    try {
      java.lang.reflect.Field [] classFields = InputSym.class.getFields();
      for (int i = 0; i < classFields.length; i++) {
        if (classFields[i].getInt(null) == token) {
          return classFields[i].getName();
        }
      }
    } catch (Exception e) {
      e.printStackTrace(System.err);
    }

    return "UNKNOWN TOKEN";
  }

  /**
   * Same as next_token but also prints the token to standard out
   * for debugging.
   *
   * This code was contributed by Karl Meissner <meissnersd@yahoo.com>
   */
  public java_cup.runtime.Symbol debug_next_token() throws java.io.IOException {
    java_cup.runtime.Symbol s = next_token();
    System.out.println( " --"+ yytext() + "--" + getTokenName(s.sym) + "--");
    return s;
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java InputLexer <inputfile>");
    }
    else {
      for (int i = 0; i < argv.length; i++) {
        InputLexer scanner = null;
        try {
          scanner = new InputLexer( new java.io.FileReader(argv[i]) );
          while ( !scanner.zzAtEOF ) scanner.next_token();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
