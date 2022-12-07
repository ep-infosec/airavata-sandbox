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
package org.apache.airavata.datacat.parsers.gridchem.gscfa;/* The following code was generated by JFlex 1.4.3 on 9/11/14 6:08 PM */

import java_cup.runtime.Symbol;
import org.apache.airavata.datacat.parsers.gridchem.Settings;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 9/11/14 6:08 PM from the specification file
 * <tt>gscfa.flex</tt>
 */
public class GSCFaLexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int ITER2 = 6;
  public static final int DASH = 10;
  public static final int INTVALUE = 12;
  public static final int SCF1 = 2;
  public static final int IGNOREALL = 24;
  public static final int ITER = 4;
  public static final int YYINITIAL = 0;
  public static final int ITER7 = 22;
  public static final int ITER6 = 20;
  public static final int ITER5 = 18;
  public static final int FLOATVALUE = 14;
  public static final int ITER4 = 16;
  public static final int ITER3 = 8;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  1,  1,  6,  6, 
     7,  7,  8,  8,  9,  9, 10, 10,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     9,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  3,  0, 23,  4,  0, 
     1,  2,  2,  2,  2,  2,  2,  2,  2,  2,  0,  0,  0,  0,  0,  0, 
     0, 14, 22, 19, 11,  7,  0, 17, 20,  5,  0,  0, 15, 12, 16, 13, 
     0,  0,  8, 21,  6,  0, 24,  0, 10, 18,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  3,  0,  0,  0, 
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
    "\13\0\2\1\2\2\1\1\2\3\2\4\1\1\3\5"+
    "\10\1\3\0\1\6\15\0\1\7\1\10\1\11\1\12"+
    "\65\0\1\13\1\14\1\15\77\0\1\16\1\17";

  private static int [] zzUnpackAction() {
    int [] result = new int[174];
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
    "\0\0\0\31\0\62\0\113\0\144\0\175\0\226\0\257"+
    "\0\310\0\341\0\372\0\u0113\0\u012c\0\u0113\0\u0145\0\u015e"+
    "\0\u0113\0\u0177\0\u0113\0\u0190\0\u01a9\0\u0113\0\u01c2\0\u01db"+
    "\0\u01f4\0\u020d\0\u0226\0\u023f\0\u0258\0\u0271\0\u028a\0\u02a3"+
    "\0\u02bc\0\u02d5\0\u02ee\0\u01c2\0\u0307\0\u01f4\0\u0320\0\u0226"+
    "\0\u0339\0\u0258\0\u0352\0\u028a\0\u036b\0\u0384\0\u039d\0\u03b6"+
    "\0\u03cf\0\u0320\0\u0339\0\u0352\0\u036b\0\u03e8\0\u0401\0\u041a"+
    "\0\u0433\0\u044c\0\u0465\0\u047e\0\u0497\0\u04b0\0\u04c9\0\u04e2"+
    "\0\u04fb\0\u0514\0\u052d\0\u0546\0\u055f\0\u0578\0\u0591\0\u05aa"+
    "\0\u05c3\0\u05dc\0\u05f5\0\u060e\0\u0627\0\u0640\0\u0659\0\u0672"+
    "\0\u068b\0\u06a4\0\u06bd\0\u06d6\0\u06ef\0\u0708\0\u0721\0\u073a"+
    "\0\u0753\0\u076c\0\u0785\0\u079e\0\u07b7\0\u07d0\0\u07e9\0\u0802"+
    "\0\u081b\0\u0834\0\u084d\0\u0866\0\u087f\0\u0898\0\u08b1\0\u08ca"+
    "\0\u08e3\0\u08fc\0\u0113\0\u0113\0\u0113\0\u0915\0\u092e\0\u0947"+
    "\0\u0960\0\u0979\0\u0992\0\u09ab\0\u09c4\0\u09dd\0\u09f6\0\u0a0f"+
    "\0\u0a28\0\u0a41\0\u0a5a\0\u0a73\0\u0a8c\0\u0aa5\0\u0abe\0\u0ad7"+
    "\0\u0af0\0\u0b09\0\u0b22\0\u0b3b\0\u0b54\0\u0b6d\0\u0b86\0\u0b9f"+
    "\0\u0bb8\0\u0bd1\0\u0bea\0\u0c03\0\u0c1c\0\u0c35\0\u0c4e\0\u0c67"+
    "\0\u0c80\0\u0c99\0\u0cb2\0\u0ccb\0\u0ce4\0\u0cfd\0\u0d16\0\u0d2f"+
    "\0\u0d48\0\u0d61\0\u0d7a\0\u0d93\0\u0dac\0\u0dc5\0\u0dde\0\u0df7"+
    "\0\u0e10\0\u0e29\0\u0e42\0\u0e5b\0\u0e74\0\u0e8d\0\u0ea6\0\u0ebf"+
    "\0\u0ed8\0\u0ef1\0\u0f0a\0\u0f23\0\u0113\0\u0113";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[174];
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
    "\5\14\1\15\55\14\1\16\1\17\24\14\1\20\2\14"+
    "\1\21\1\22\27\14\1\23\1\24\41\14\1\25\15\14"+
    "\1\26\3\27\23\26\1\30\1\26\1\14\2\31\1\32"+
    "\23\14\1\32\2\14\2\33\1\34\23\14\1\34\2\14"+
    "\2\35\1\36\23\14\1\36\2\14\2\37\1\40\23\14"+
    "\1\40\1\14\37\0\1\41\23\0\2\17\55\0\1\42"+
    "\2\0\2\22\27\0\2\24\35\0\1\43\22\0\2\44"+
    "\27\0\2\44\24\0\1\45\2\0\2\46\1\0\1\47"+
    "\25\0\2\46\27\0\2\50\1\0\1\51\25\0\2\50"+
    "\27\0\2\52\1\0\1\53\25\0\2\52\27\0\2\54"+
    "\1\0\1\55\25\0\2\54\35\0\1\56\50\0\1\57"+
    "\21\0\1\60\37\0\1\61\2\0\2\62\27\0\2\63"+
    "\27\0\2\64\27\0\2\65\36\0\1\66\47\0\1\67"+
    "\26\0\1\70\32\0\1\71\12\0\1\72\46\0\1\73"+
    "\6\0\1\74\52\0\1\75\10\0\1\76\50\0\1\77"+
    "\7\0\1\100\51\0\1\101\13\0\1\102\45\0\1\103"+
    "\23\0\1\104\35\0\1\105\12\0\1\106\46\0\1\107"+
    "\12\0\1\110\46\0\1\111\14\0\1\112\44\0\1\113"+
    "\24\0\1\114\34\0\1\115\10\0\1\116\50\0\1\117"+
    "\16\0\1\120\42\0\1\121\15\0\1\122\43\0\1\123"+
    "\21\0\1\124\37\0\1\125\12\0\1\126\46\0\1\127"+
    "\31\0\1\130\27\0\1\131\12\0\1\132\46\0\1\133"+
    "\10\0\1\134\50\0\1\135\12\0\1\136\46\0\1\137"+
    "\11\0\1\140\47\0\1\141\12\0\1\142\46\0\1\143"+
    "\22\0\1\144\36\0\1\145\7\0\1\146\51\0\1\147"+
    "\10\0\1\150\50\0\1\151\16\0\1\152\42\0\1\153"+
    "\14\0\1\154\44\0\1\155\7\0\1\156\40\0\1\157"+
    "\31\0\1\160\22\0\1\161\26\0\1\162\41\0\1\163"+
    "\17\0\1\164\31\0\1\165\41\0\1\166\31\0\1\167"+
    "\17\0\1\170\30\0\1\171\30\0\1\172\30\0\1\173"+
    "\30\0\1\174\30\0\1\175\30\0\1\176\26\0\1\177"+
    "\32\0\1\200\42\0\1\201\31\0\1\202\22\0\1\203"+
    "\32\0\1\204\31\0\1\205\16\0\1\206\32\0\1\207"+
    "\30\0\1\210\32\0\1\211\24\0\1\212\41\0\1\213"+
    "\35\0\1\214\10\0\1\215\31\0\1\216\44\0\1\217"+
    "\17\0\1\220\42\0\1\221\31\0\1\222\22\0\1\223"+
    "\32\0\1\224\31\0\1\225\16\0\1\226\32\0\1\227"+
    "\30\0\1\230\30\0\1\231\30\0\1\232\30\0\1\233"+
    "\1\0\1\234\32\0\1\235\20\0\1\236\33\0\1\237"+
    "\25\0\1\240\51\0\1\241\27\0\1\242\7\0\1\243"+
    "\35\0\1\244\30\0\1\245\26\0\1\246\42\0\1\247"+
    "\17\0\1\250\30\0\1\251\30\0\1\252\36\0\1\253"+
    "\27\0\1\254\26\0\1\255\25\0\1\256\20\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3900];
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
    "\13\0\1\11\1\1\1\11\2\1\1\11\1\1\1\11"+
    "\2\1\1\11\12\1\3\0\1\1\15\0\4\1\65\0"+
    "\3\11\77\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[174];
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
  public GSCFaLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public GSCFaLexer(java.io.InputStream in) {
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
        case 11: 
          { if (Settings.DEBUG) System.out.println("GSCFaFlex: Found the dash");
               yybegin(DASH);
          }
        case 16: break;
        case 13: 
          { yybegin(DASH);
          }
        case 17: break;
        case 4: 
          { if (Settings.DEBUG) System.out.println("GSCFaFlex: Found the third integer in the iteration");
   if (Settings.DEBUG) System.out.println(yytext());
   yybegin(ITER4);
    return new Symbol(GSCFaSym.INT2, new Integer(yytext()));
          }
        case 18: break;
        case 3: 
          { if (Settings.DEBUG) System.out.println("GSCFaFlex: Found the second integer in the iteration");
     if (Settings.DEBUG) System.out.println(yytext());
     yybegin(ITER3); 
      return new Symbol(GSCFaSym.INT1, new Integer(yytext()));
          }
        case 19: break;
        case 14: 
          { if (Settings.DEBUG) System.out.println("GSCFaFlex: Found ITER EX DEM etc");
           yybegin(ITER);
           return new Symbol(GSCFaSym.FOUNDITER);
          }
        case 20: break;
        case 2: 
          { if (Settings.DEBUG) System.out.println("GSCFaFlex: Found the first integer in the iteration");
   if (Settings.DEBUG) System.out.println(yytext());
   yybegin(ITER2);
   return new Symbol(GSCFaSym.INTCycle, new Integer(yytext()));
          }
        case 21: break;
        case 9: 
          { if  (Settings.DEBUG) System.out.println("GSCFaFlex: Found float2");
  yybegin (ITER7);
   return new Symbol(GSCFaSym.FLOAT2);
          }
        case 22: break;
        case 7: 
          { if (Settings.DEBUG) System.out.println("GSCFaFlex: Found the energy");
   if (Settings.DEBUG) System.out.println(yytext());
   yybegin(ITER5);
   return new Symbol(GSCFaSym.ENERGY, new Float(yytext()));
          }
        case 23: break;
        case 5: 
          { if  (Settings.DEBUG) System.out.println("GSCFaFlex: Found new line");
          }
        case 24: break;
        case 12: 
          { yybegin(IGNOREALL);
  return new Symbol(GSCFaSym.SCFDONE);
          }
        case 25: break;
        case 8: 
          { if (Settings.DEBUG) System.out.println("GSCFaFlex: ITER5");
   if (Settings.DEBUG) System.out.println("GSCFaFlex: Found float1");
   yybegin (ITER6);
    return new Symbol(GSCFaSym.FLOAT1);
          }
        case 26: break;
        case 6: 
          { if  (Settings.DEBUG) System.out.println("GSCFaFlex: Found float value");
  yybegin(ITER);
          }
        case 27: break;
        case 15: 
          { if (Settings.DEBUG) System.out.println("GSCFaFlex: Found ITER EX DEM etc");
	   yybegin(ITER);
	   return new Symbol(GSCFaSym.FOUNDITER);
          }
        case 28: break;
        case 10: 
          { if  (Settings.DEBUG) System.out.println("GSCFaFlex: Found float3");
     yybegin(ITER);
      return new Symbol(GSCFaSym.FLOAT3);
          }
        case 29: break;
        case 1: 
          { 
          }
        case 30: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(GSCFaSym.EOF); }
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
      java.lang.reflect.Field [] classFields = GSCFaSym.class.getFields();
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
      System.out.println("Usage : java GSCFaLexer <inputfile>");
    }
    else {
      for (int i = 0; i < argv.length; i++) {
        GSCFaLexer scanner = null;
        try {
          scanner = new GSCFaLexer( new java.io.FileReader(argv[i]) );
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
