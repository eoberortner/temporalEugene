// $ANTLR 3.4 /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g 2014-03-07 18:27:42

/*
Copyright (c) 2012 Boston University.
All rights reserved.
Permission is hereby granted, without written agreement and without
license or royalty fees, to use, copy, modify, and distribute this
software and its documentation for any purpose, provided that the above
copyright notice and the following two paragraphs appear in all copies
of this software.

IN NO EVENT SHALL BOSTON UNIVERSITY BE LIABLE TO ANY PARTY
FOR DIRECT, INDIRECT, SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES
ARISING OUT OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF
BOSTON UNIVERSITY HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

BOSTON UNIVERSITY SPECIFICALLY DISCLAIMS ANY WARRANTIES,
INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE. THE SOFTWARE
PROVIDED HEREUNDER IS ON AN "AS IS" BASIS, AND BOSTON UNIVERSITY HAS
NO OBLIGATION TO PROVIDE MAINTENANCE, SUPPORT, UPDATES,
ENHANCEMENTS, OR MODIFICATIONS.
*/

package org.cidarlab.minieugene.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MiniEugeneLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int CHAR=4;
    public static final int COMMENT=5;
    public static final int ESC_SEQ=6;
    public static final int EXPONENT=7;
    public static final int HEX_DIGIT=8;
    public static final int ID=9;
    public static final int INT=10;
    public static final int OCTAL_ESC=11;
    public static final int STRING=12;
    public static final int UNICODE_ESC=13;
    public static final int WS=14;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public MiniEugeneLexer() {} 
    public MiniEugeneLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MiniEugeneLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:28:7: ( '(' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:28:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:29:7: ( ')' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:29:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:30:7: ( ',' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:30:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:31:7: ( '.' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:31:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:32:7: ( ':=' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:32:9: ':='
            {
            match(":="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:33:7: ( '=' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:33:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:34:7: ( 'AFTER' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:34:9: 'AFTER'
            {
            match("AFTER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:35:7: ( 'ALL_AFTER' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:35:9: 'ALL_AFTER'
            {
            match("ALL_AFTER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:36:7: ( 'ALL_BEFORE' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:36:9: 'ALL_BEFORE'
            {
            match("ALL_BEFORE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:37:7: ( 'ALL_FORWARD' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:37:9: 'ALL_FORWARD'
            {
            match("ALL_FORWARD"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:38:7: ( 'ALL_NEXTTO' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:38:9: 'ALL_NEXTTO'
            {
            match("ALL_NEXTTO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:39:7: ( 'ALL_REVERSE' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:39:9: 'ALL_REVERSE'
            {
            match("ALL_REVERSE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:40:7: ( 'BEFORE' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:40:9: 'BEFORE'
            {
            match("BEFORE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:41:7: ( 'CONTAINS' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:41:9: 'CONTAINS'
            {
            match("CONTAINS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:42:7: ( 'DRIVES' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:42:9: 'DRIVES'
            {
            match("DRIVES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:43:7: ( 'ENDSWITH' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:43:9: 'ENDSWITH'
            {
            match("ENDSWITH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:44:7: ( 'EQUALS' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:44:9: 'EQUALS'
            {
            match("EQUALS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:45:7: ( 'EXACTLY' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:45:9: 'EXACTLY'
            {
            match("EXACTLY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:46:7: ( 'FORWARD' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:46:9: 'FORWARD'
            {
            match("FORWARD"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:47:7: ( 'INDUCES' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:47:9: 'INDUCES'
            {
            match("INDUCES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:48:7: ( 'MATCHES' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:48:9: 'MATCHES'
            {
            match("MATCHES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:49:7: ( 'MORETHAN' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:49:9: 'MORETHAN'
            {
            match("MORETHAN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:50:7: ( 'N' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:50:9: 'N'
            {
            match('N'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:51:7: ( 'NEXTTO' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:51:9: 'NEXTTO'
            {
            match("NEXTTO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:52:7: ( 'NOT' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:52:9: 'NOT'
            {
            match("NOT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:53:7: ( 'NOTCONTAINS' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:53:9: 'NOTCONTAINS'
            {
            match("NOTCONTAINS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:54:7: ( 'NOTEQUALS' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:54:9: 'NOTEQUALS'
            {
            match("NOTEQUALS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:55:7: ( 'NOTEXACTLY' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:55:9: 'NOTEXACTLY'
            {
            match("NOTEXACTLY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:56:7: ( 'NOTMATCHES' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:56:9: 'NOTMATCHES'
            {
            match("NOTMATCHES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:57:7: ( 'NOTMORETHAN' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:57:9: 'NOTMORETHAN'
            {
            match("NOTMORETHAN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:58:7: ( 'NOTTHEN' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:58:9: 'NOTTHEN'
            {
            match("NOTTHEN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:59:7: ( 'NOTWITH' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:59:9: 'NOTWITH'
            {
            match("NOTWITH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:60:7: ( 'REPRESSES' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:60:9: 'REPRESSES'
            {
            match("REPRESSES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:61:7: ( 'REVERSE' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:61:9: 'REVERSE'
            {
            match("REVERSE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:62:7: ( 'SAME_ORIENTATION' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:62:9: 'SAME_ORIENTATION'
            {
            match("SAME_ORIENTATION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:63:7: ( 'SOME_AFTER' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:63:9: 'SOME_AFTER'
            {
            match("SOME_AFTER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:64:7: ( 'SOME_BEFORE' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:64:9: 'SOME_BEFORE'
            {
            match("SOME_BEFORE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:65:7: ( 'SOME_FORWARD' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:65:9: 'SOME_FORWARD'
            {
            match("SOME_FORWARD"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:66:7: ( 'SOME_NEXTTO' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:66:9: 'SOME_NEXTTO'
            {
            match("SOME_NEXTTO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:67:7: ( 'SOME_REVERSE' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:67:9: 'SOME_REVERSE'
            {
            match("SOME_REVERSE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:68:7: ( 'STARTSWITH' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:68:9: 'STARTSWITH'
            {
            match("STARTSWITH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:69:7: ( 'THEN' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:69:9: 'THEN'
            {
            match("THEN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:70:7: ( 'WITH' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:70:9: 'WITH'
            {
            match("WITH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:71:7: ( '[' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:71:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:72:7: ( ']' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:72:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:134:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )* )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:134:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:134:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='-'||(LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:137:5: ( ( '0' .. '9' )+ )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:137:7: ( '0' .. '9' )+
            {
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:137:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:142:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='/') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='/') ) {
                    alt6=1;
                }
                else if ( (LA6_1=='*') ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:142:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:142:14: (~ ( '\\n' | '\\r' ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:142:28: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:142:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:143:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:143:14: ( options {greedy=false; } : . )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='*') ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1=='/') ) {
                                alt5=2;
                            }
                            else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
                                alt5=1;
                            }


                        }
                        else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:143:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:146:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:146:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:154:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:154:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:154:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\\') ) {
                    alt7=1;
                }
                else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '[')||(LA7_0 >= ']' && LA7_0 <= '\uFFFF')) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:154:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:154:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:157:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:157:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 

            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:157:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\\') ) {
                alt8=1;
            }
            else if ( ((LA8_0 >= '\u0000' && LA8_0 <= '&')||(LA8_0 >= '(' && LA8_0 <= '[')||(LA8_0 >= ']' && LA8_0 <= '\uFFFF')) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:157:15: ESC_SEQ
                    {
                    mESC_SEQ(); 


                    }
                    break;
                case 2 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:157:25: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:162:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:162:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:162:22: ( '+' | '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='+'||LA9_0=='-') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:162:33: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:165:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:169:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt11=1;
                    }
                    break;
                case 'u':
                    {
                    alt11=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt11=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:169:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 

                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:170:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:171:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:176:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\\') ) {
                int LA12_1 = input.LA(2);

                if ( ((LA12_1 >= '0' && LA12_1 <= '3')) ) {
                    int LA12_2 = input.LA(3);

                    if ( ((LA12_2 >= '0' && LA12_2 <= '7')) ) {
                        int LA12_4 = input.LA(4);

                        if ( ((LA12_4 >= '0' && LA12_4 <= '7')) ) {
                            alt12=1;
                        }
                        else {
                            alt12=2;
                        }
                    }
                    else {
                        alt12=3;
                    }
                }
                else if ( ((LA12_1 >= '4' && LA12_1 <= '7')) ) {
                    int LA12_3 = input.LA(3);

                    if ( ((LA12_3 >= '0' && LA12_3 <= '7')) ) {
                        alt12=2;
                    }
                    else {
                        alt12=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:176:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:177:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:178:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:183:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:183:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 

            match('u'); 

            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | ID | INT | COMMENT | WS | STRING | CHAR )
        int alt13=51;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:10: T__15
                {
                mT__15(); 


                }
                break;
            case 2 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:16: T__16
                {
                mT__16(); 


                }
                break;
            case 3 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:22: T__17
                {
                mT__17(); 


                }
                break;
            case 4 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:28: T__18
                {
                mT__18(); 


                }
                break;
            case 5 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:34: T__19
                {
                mT__19(); 


                }
                break;
            case 6 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:40: T__20
                {
                mT__20(); 


                }
                break;
            case 7 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:46: T__21
                {
                mT__21(); 


                }
                break;
            case 8 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:52: T__22
                {
                mT__22(); 


                }
                break;
            case 9 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:58: T__23
                {
                mT__23(); 


                }
                break;
            case 10 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:64: T__24
                {
                mT__24(); 


                }
                break;
            case 11 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:70: T__25
                {
                mT__25(); 


                }
                break;
            case 12 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:76: T__26
                {
                mT__26(); 


                }
                break;
            case 13 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:82: T__27
                {
                mT__27(); 


                }
                break;
            case 14 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:88: T__28
                {
                mT__28(); 


                }
                break;
            case 15 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:94: T__29
                {
                mT__29(); 


                }
                break;
            case 16 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:100: T__30
                {
                mT__30(); 


                }
                break;
            case 17 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:106: T__31
                {
                mT__31(); 


                }
                break;
            case 18 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:112: T__32
                {
                mT__32(); 


                }
                break;
            case 19 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:118: T__33
                {
                mT__33(); 


                }
                break;
            case 20 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:124: T__34
                {
                mT__34(); 


                }
                break;
            case 21 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:130: T__35
                {
                mT__35(); 


                }
                break;
            case 22 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:136: T__36
                {
                mT__36(); 


                }
                break;
            case 23 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:142: T__37
                {
                mT__37(); 


                }
                break;
            case 24 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:148: T__38
                {
                mT__38(); 


                }
                break;
            case 25 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:154: T__39
                {
                mT__39(); 


                }
                break;
            case 26 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:160: T__40
                {
                mT__40(); 


                }
                break;
            case 27 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:166: T__41
                {
                mT__41(); 


                }
                break;
            case 28 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:172: T__42
                {
                mT__42(); 


                }
                break;
            case 29 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:178: T__43
                {
                mT__43(); 


                }
                break;
            case 30 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:184: T__44
                {
                mT__44(); 


                }
                break;
            case 31 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:190: T__45
                {
                mT__45(); 


                }
                break;
            case 32 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:196: T__46
                {
                mT__46(); 


                }
                break;
            case 33 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:202: T__47
                {
                mT__47(); 


                }
                break;
            case 34 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:208: T__48
                {
                mT__48(); 


                }
                break;
            case 35 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:214: T__49
                {
                mT__49(); 


                }
                break;
            case 36 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:220: T__50
                {
                mT__50(); 


                }
                break;
            case 37 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:226: T__51
                {
                mT__51(); 


                }
                break;
            case 38 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:232: T__52
                {
                mT__52(); 


                }
                break;
            case 39 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:238: T__53
                {
                mT__53(); 


                }
                break;
            case 40 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:244: T__54
                {
                mT__54(); 


                }
                break;
            case 41 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:250: T__55
                {
                mT__55(); 


                }
                break;
            case 42 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:256: T__56
                {
                mT__56(); 


                }
                break;
            case 43 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:262: T__57
                {
                mT__57(); 


                }
                break;
            case 44 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:268: T__58
                {
                mT__58(); 


                }
                break;
            case 45 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:274: T__59
                {
                mT__59(); 


                }
                break;
            case 46 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:280: ID
                {
                mID(); 


                }
                break;
            case 47 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:283: INT
                {
                mINT(); 


                }
                break;
            case 48 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:287: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 49 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:295: WS
                {
                mWS(); 


                }
                break;
            case 50 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:298: STRING
                {
                mSTRING(); 


                }
                break;
            case 51 :
                // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:1:305: CHAR
                {
                mCHAR(); 


                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\7\uffff\10\26\1\52\4\26\10\uffff\16\26\1\uffff\23\26\1\130\31\26"+
        "\1\uffff\5\26\1\175\1\176\1\177\34\26\3\uffff\5\26\1\u00a5\1\26"+
        "\1\u00a7\1\26\1\u00a9\5\26\1\u00af\25\26\1\uffff\1\26\1\uffff\1"+
        "\26\1\uffff\1\u00c7\1\u00c8\1\u00c9\1\u00ca\1\26\1\uffff\5\26\1"+
        "\u00d1\1\u00d2\1\26\1\u00d4\14\26\1\u00e1\1\u00e2\4\uffff\1\u00e3"+
        "\5\26\2\uffff\1\26\1\uffff\7\26\1\u00f1\4\26\3\uffff\1\26\1\u00f7"+
        "\3\26\1\u00fb\7\26\1\uffff\1\u0103\1\26\1\u0105\2\26\1\uffff\1\u0108"+
        "\1\u0109\1\26\1\uffff\1\26\1\u010c\4\26\1\u0111\1\uffff\1\u0112"+
        "\1\uffff\1\u0113\1\u0114\2\uffff\1\u0115\1\26\1\uffff\1\u0117\1"+
        "\26\1\u0119\1\26\5\uffff\1\26\1\uffff\1\u011c\1\uffff\1\u011d\1"+
        "\26\2\uffff\2\26\1\u0121\1\uffff";
    static final String DFA13_eofS =
        "\u0122\uffff";
    static final String DFA13_minS =
        "\1\11\6\uffff\1\106\1\105\1\117\1\122\1\116\1\117\1\116\1\101\1"+
        "\55\1\105\1\101\1\110\1\111\10\uffff\1\124\1\114\1\106\1\116\1\111"+
        "\1\104\1\125\1\101\1\122\1\104\1\124\1\122\1\130\1\124\1\uffff\1"+
        "\120\2\115\1\101\1\105\1\124\1\105\1\137\1\117\1\124\1\126\1\123"+
        "\1\101\1\103\1\127\1\125\1\103\1\105\1\124\1\55\1\122\3\105\1\122"+
        "\1\116\1\110\1\122\1\101\1\122\1\101\1\105\1\127\1\114\1\124\1\101"+
        "\1\103\1\110\2\124\1\117\1\121\1\101\1\110\1\111\1\uffff\1\105\1"+
        "\122\2\137\1\124\3\55\1\106\1\105\1\117\3\105\1\111\1\123\1\111"+
        "\1\123\1\114\1\122\2\105\1\110\1\117\1\116\1\125\1\101\1\124\1\122"+
        "\1\105\1\124\2\123\1\117\1\101\1\123\3\uffff\1\124\1\106\1\122\1"+
        "\130\1\126\1\55\1\116\1\55\1\124\1\55\1\131\1\104\2\123\1\101\1"+
        "\55\1\124\1\101\2\103\1\105\1\116\1\110\1\123\1\105\1\122\1\106"+
        "\1\105\1\117\2\105\1\127\1\105\1\117\1\127\1\124\1\105\1\uffff\1"+
        "\123\1\uffff\1\110\1\uffff\4\55\1\116\1\uffff\1\101\1\114\1\124"+
        "\1\110\1\124\2\55\1\105\1\55\1\111\1\124\1\106\1\122\1\130\1\126"+
        "\1\111\2\122\1\101\1\124\1\122\2\55\4\uffff\1\55\1\111\1\123\1\114"+
        "\1\105\1\110\2\uffff\1\123\1\uffff\2\105\1\117\1\127\1\124\1\105"+
        "\1\124\1\55\1\105\1\122\1\117\1\123\3\uffff\1\116\1\55\1\131\1\123"+
        "\1\101\1\55\1\116\2\122\1\101\1\124\1\122\1\110\1\uffff\1\55\1\104"+
        "\1\55\1\105\1\123\1\uffff\2\55\1\116\1\uffff\1\124\1\55\1\105\1"+
        "\122\1\117\1\123\1\55\1\uffff\1\55\1\uffff\2\55\2\uffff\1\55\1\101"+
        "\1\uffff\1\55\1\104\1\55\1\105\5\uffff\1\124\1\uffff\1\55\1\uffff"+
        "\1\55\1\111\2\uffff\1\117\1\116\1\55\1\uffff";
    static final String DFA13_maxS =
        "\1\172\6\uffff\1\114\1\105\1\117\1\122\1\130\1\117\1\116\1\117\1"+
        "\172\1\105\1\124\1\110\1\111\10\uffff\1\124\1\114\1\106\1\116\1"+
        "\111\1\104\1\125\1\101\1\122\1\104\1\124\1\122\1\130\1\124\1\uffff"+
        "\1\126\2\115\1\101\1\105\1\124\1\105\1\137\1\117\1\124\1\126\1\123"+
        "\1\101\1\103\1\127\1\125\1\103\1\105\1\124\1\172\1\122\3\105\1\122"+
        "\1\116\1\110\3\122\1\101\1\105\1\127\1\114\1\124\1\101\1\103\1\110"+
        "\2\124\1\117\1\130\1\117\1\110\1\111\1\uffff\1\105\1\122\2\137\1"+
        "\124\3\172\1\106\1\105\1\117\3\105\1\111\1\123\1\111\1\123\1\114"+
        "\1\122\2\105\1\110\1\117\1\116\1\125\1\101\1\124\1\122\1\105\1\124"+
        "\2\123\1\117\1\122\1\123\3\uffff\1\124\1\106\1\122\1\130\1\126\1"+
        "\172\1\116\1\172\1\124\1\172\1\131\1\104\2\123\1\101\1\172\1\124"+
        "\1\101\2\103\1\105\1\116\1\110\1\123\1\105\1\122\1\106\1\105\1\117"+
        "\2\105\1\127\1\105\1\117\1\127\1\124\1\105\1\uffff\1\123\1\uffff"+
        "\1\110\1\uffff\4\172\1\116\1\uffff\1\101\1\114\1\124\1\110\1\124"+
        "\2\172\1\105\1\172\1\111\1\124\1\106\1\122\1\130\1\126\1\111\2\122"+
        "\1\101\1\124\1\122\2\172\4\uffff\1\172\1\111\1\123\1\114\1\105\1"+
        "\110\2\uffff\1\123\1\uffff\2\105\1\117\1\127\1\124\1\105\1\124\1"+
        "\172\1\105\1\122\1\117\1\123\3\uffff\1\116\1\172\1\131\1\123\1\101"+
        "\1\172\1\116\2\122\1\101\1\124\1\122\1\110\1\uffff\1\172\1\104\1"+
        "\172\1\105\1\123\1\uffff\2\172\1\116\1\uffff\1\124\1\172\1\105\1"+
        "\122\1\117\1\123\1\172\1\uffff\1\172\1\uffff\2\172\2\uffff\1\172"+
        "\1\101\1\uffff\1\172\1\104\1\172\1\105\5\uffff\1\124\1\uffff\1\172"+
        "\1\uffff\1\172\1\111\2\uffff\1\117\1\116\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\15\uffff\1\54\1\55\1\56\1\57\1"+
        "\60\1\61\1\62\1\63\16\uffff\1\27\55\uffff\1\31\44\uffff\1\52\1\53"+
        "\1\7\45\uffff\1\15\1\uffff\1\17\1\uffff\1\21\5\uffff\1\30\27\uffff"+
        "\1\22\1\23\1\24\1\25\6\uffff\1\37\1\40\1\uffff\1\42\14\uffff\1\16"+
        "\1\20\1\26\15\uffff\1\10\5\uffff\1\33\3\uffff\1\41\7\uffff\1\11"+
        "\1\uffff\1\13\2\uffff\1\34\1\35\2\uffff\1\44\4\uffff\1\51\1\12\1"+
        "\14\1\32\1\36\1\uffff\1\45\1\uffff\1\47\2\uffff\1\46\1\50\3\uffff"+
        "\1\43";
    static final String DFA13_specialS =
        "\u0122\uffff}>";
    static final String[] DFA13_transitionS = {
            "\2\31\2\uffff\1\31\22\uffff\1\31\1\uffff\1\32\4\uffff\1\33\1"+
            "\1\1\2\2\uffff\1\3\1\uffff\1\4\1\30\12\27\1\5\2\uffff\1\6\3"+
            "\uffff\1\7\1\10\1\11\1\12\1\13\1\14\2\26\1\15\3\26\1\16\1\17"+
            "\3\26\1\20\1\21\1\22\2\26\1\23\3\26\1\24\1\uffff\1\25\1\uffff"+
            "\1\26\1\uffff\32\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\34\5\uffff\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41\2\uffff\1\42\6\uffff\1\43",
            "\1\44",
            "\1\45",
            "\1\46\15\uffff\1\47",
            "\1\26\2\uffff\12\26\7\uffff\4\26\1\50\11\26\1\51\13\26\4\uffff"+
            "\1\26\1\uffff\32\26",
            "\1\53",
            "\1\54\15\uffff\1\55\4\uffff\1\56",
            "\1\57",
            "\1\60",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "\1\77\5\uffff\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\26\2\uffff\12\26\7\uffff\2\26\1\123\1\26\1\124\7\26\1\125"+
            "\6\26\1\126\2\26\1\127\3\26\4\uffff\1\26\1\uffff\32\26",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141\1\142\3\uffff\1\143\7\uffff\1\144\3\uffff\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162\6\uffff\1\163",
            "\1\164\15\uffff\1\165",
            "\1\166",
            "\1\167",
            "",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a\1\u009b\3\uffff\1\u009c\7\uffff\1\u009d\3\uffff\1"+
            "\u009e",
            "\1\u009f",
            "",
            "",
            "",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00a6",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00a8",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "",
            "\1\u00c5",
            "",
            "\1\u00c6",
            "",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00cb",
            "",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00d3",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "",
            "",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "",
            "",
            "\1\u00e9",
            "",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "",
            "",
            "",
            "\1\u00f6",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u0104",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u0106",
            "\1\u0107",
            "",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u010a",
            "",
            "\1\u010b",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u0116",
            "",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u0118",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u011a",
            "",
            "",
            "",
            "",
            "",
            "\1\u011b",
            "",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u011e",
            "",
            "",
            "\1\u011f",
            "\1\u0120",
            "\1\26\2\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | ID | INT | COMMENT | WS | STRING | CHAR );";
        }
    }
 

}