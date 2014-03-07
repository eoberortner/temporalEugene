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

import org.cidarlab.minieugene.interpreter.*;
import org.cidarlab.minieugene.symbol.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MiniEugeneParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ESC_SEQ", "EXPONENT", "HEX_DIGIT", "ID", "INT", "OCTAL_ESC", "STRING", "UNICODE_ESC", "WS", "'('", "')'", "','", "'.'", "':='", "'='", "'AFTER'", "'ALL_AFTER'", "'ALL_BEFORE'", "'ALL_FORWARD'", "'ALL_NEXTTO'", "'ALL_REVERSE'", "'BEFORE'", "'CONTAINS'", "'DRIVES'", "'ENDSWITH'", "'EQUALS'", "'EXACTLY'", "'FORWARD'", "'INDUCES'", "'MATCHES'", "'MORETHAN'", "'N'", "'NEXTTO'", "'NOT'", "'NOTCONTAINS'", "'NOTEQUALS'", "'NOTEXACTLY'", "'NOTMATCHES'", "'NOTMORETHAN'", "'NOTTHEN'", "'NOTWITH'", "'REPRESSES'", "'REVERSE'", "'SAME_ORIENTATION'", "'SOME_AFTER'", "'SOME_BEFORE'", "'SOME_FORWARD'", "'SOME_NEXTTO'", "'SOME_REVERSE'", "'STARTSWITH'", "'THEN'", "'WITH'", "'['", "']'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public MiniEugeneParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public MiniEugeneParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return MiniEugeneParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g"; }


    private MiniEugeneInterpreter interp;
    public void init(SymbolTables symbols) {
        this.interp = new MiniEugeneInterpreter(symbols);
    }



    // $ANTLR start "miniEugene"
    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:66:1: miniEugene : ( size )? ( constraint '.' | composite_constraint )+ ;
    public final void miniEugene() throws RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:67:2: ( ( size )? ( constraint '.' | composite_constraint )+ )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:67:4: ( size )? ( constraint '.' | composite_constraint )+
            {
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:67:4: ( size )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==37) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:67:5: size
                    {
                    pushFollow(FOLLOW_size_in_miniEugene40);
                    size();

                    state._fsp--;


                    }
                    break;

            }


            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:67:12: ( constraint '.' | composite_constraint )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==INT||LA2_0==18||(LA2_0 >= 21 && LA2_0 <= 36)||(LA2_0 >= 38 && LA2_0 <= 58)) ) {
                    alt2=1;
                }
                else if ( (LA2_0==ID) ) {
                    int LA2_3 = input.LA(2);

                    if ( ((LA2_3 >= ID && LA2_3 <= INT)||LA2_3==18||(LA2_3 >= 21 && LA2_3 <= 36)||LA2_3==38||(LA2_3 >= 40 && LA2_3 <= 58)) ) {
                        alt2=1;
                    }
                    else if ( (LA2_3==15||LA2_3==19) ) {
                        alt2=2;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:67:13: constraint '.'
            	    {
            	    pushFollow(FOLLOW_constraint_in_miniEugene45);
            	    constraint();

            	    state._fsp--;


            	    match(input,18,FOLLOW_18_in_miniEugene47); 

            	    }
            	    break;
            	case 2 :
            	    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:67:29: composite_constraint
            	    {
            	    pushFollow(FOLLOW_composite_constraint_in_miniEugene50);
            	    composite_constraint();

            	    state._fsp--;


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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "miniEugene"



    // $ANTLR start "size"
    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:70:1: size : 'N' '=' INT '.' ;
    public final void size() throws RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:70:7: ( 'N' '=' INT '.' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:70:10: 'N' '=' INT '.'
            {
            match(input,37,FOLLOW_37_in_size64); 

            match(input,20,FOLLOW_20_in_size66); 

            match(input,INT,FOLLOW_INT_in_size68); 

            match(input,18,FOLLOW_18_in_size70); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "size"



    // $ANTLR start "composite_constraint"
    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:73:1: composite_constraint : ID ( '(' list_of_parameters ')' )? ':=' composite_constraint_block '.' ;
    public final void composite_constraint() throws RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:74:2: ( ID ( '(' list_of_parameters ')' )? ':=' composite_constraint_block '.' )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:74:4: ID ( '(' list_of_parameters ')' )? ':=' composite_constraint_block '.'
            {
            match(input,ID,FOLLOW_ID_in_composite_constraint81); 

            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:74:7: ( '(' list_of_parameters ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:74:9: '(' list_of_parameters ')'
                    {
                    match(input,15,FOLLOW_15_in_composite_constraint85); 

                    pushFollow(FOLLOW_list_of_parameters_in_composite_constraint87);
                    list_of_parameters();

                    state._fsp--;


                    match(input,16,FOLLOW_16_in_composite_constraint89); 

                    }
                    break;

            }


            match(input,19,FOLLOW_19_in_composite_constraint94); 

            pushFollow(FOLLOW_composite_constraint_block_in_composite_constraint96);
            composite_constraint_block();

            state._fsp--;


            match(input,18,FOLLOW_18_in_composite_constraint98); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "composite_constraint"



    // $ANTLR start "composite_constraint_block"
    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:77:1: composite_constraint_block : constraint ( ',' composite_constraint_block )? ;
    public final void composite_constraint_block() throws RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:78:2: ( constraint ( ',' composite_constraint_block )? )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:78:4: constraint ( ',' composite_constraint_block )?
            {
            pushFollow(FOLLOW_constraint_in_composite_constraint_block109);
            constraint();

            state._fsp--;


            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:78:15: ( ',' composite_constraint_block )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:78:16: ',' composite_constraint_block
                    {
                    match(input,17,FOLLOW_17_in_composite_constraint_block112); 

                    pushFollow(FOLLOW_composite_constraint_block_in_composite_constraint_block114);
                    composite_constraint_block();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "composite_constraint_block"



    // $ANTLR start "constraint"
    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:81:1: constraint : ( 'NOT' )? ( operand )? operator ( operand )? ;
    public final void constraint() throws RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:82:2: ( ( 'NOT' )? ( operand )? operator ( operand )? )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:82:4: ( 'NOT' )? ( operand )? operator ( operand )?
            {
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:82:4: ( 'NOT' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==39) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:82:5: 'NOT'
                    {
                    match(input,39,FOLLOW_39_in_constraint130); 

                    }
                    break;

            }


            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:82:13: ( operand )?
            int alt6=2;
            switch ( input.LA(1) ) {
                case ID:
                    {
                    alt6=1;
                    }
                    break;
                case INT:
                    {
                    alt6=1;
                    }
                    break;
                case 58:
                    {
                    int LA6_3 = input.LA(2);

                    if ( (LA6_3==INT) ) {
                        int LA6_5 = input.LA(3);

                        if ( (LA6_5==59) ) {
                            alt6=1;
                        }
                    }
                    }
                    break;
            }

            switch (alt6) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:82:14: operand
                    {
                    pushFollow(FOLLOW_operand_in_constraint135);
                    operand();

                    state._fsp--;


                    }
                    break;

            }


            pushFollow(FOLLOW_operator_in_constraint139);
            operator();

            state._fsp--;


            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:82:33: ( operand )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0 >= ID && LA7_0 <= INT)||LA7_0==58) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:82:34: operand
                    {
                    pushFollow(FOLLOW_operand_in_constraint142);
                    operand();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "constraint"



    // $ANTLR start "operator"
    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:85:1: operator : (| 'CONTAINS' | 'NOTCONTAINS' | 'EXACTLY' | 'NOTEXACTLY' | 'MORETHAN' | 'NOTMORETHAN' | 'WITH' | 'NOTWITH' | 'THEN' | 'NOTTHEN' | 'STARTSWITH' | 'ENDSWITH' | 'BEFORE' | 'ALL_BEFORE' | 'SOME_BEFORE' | 'AFTER' | 'ALL_AFTER' | 'SOME_AFTER' | 'NEXTTO' | 'ALL_NEXTTO' | 'SOME_NEXTTO' | 'EQUALS' | 'NOTEQUALS' | 'MATCHES' | 'NOTMATCHES' | 'FORWARD' | 'ALL_FORWARD' | 'SOME_FORWARD' | 'REVERSE' | 'ALL_REVERSE' | 'SOME_REVERSE' | 'SAME_ORIENTATION' | 'REPRESSES' | 'INDUCES' | 'DRIVES' );
    public final void operator() throws RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:85:9: (| 'CONTAINS' | 'NOTCONTAINS' | 'EXACTLY' | 'NOTEXACTLY' | 'MORETHAN' | 'NOTMORETHAN' | 'WITH' | 'NOTWITH' | 'THEN' | 'NOTTHEN' | 'STARTSWITH' | 'ENDSWITH' | 'BEFORE' | 'ALL_BEFORE' | 'SOME_BEFORE' | 'AFTER' | 'ALL_AFTER' | 'SOME_AFTER' | 'NEXTTO' | 'ALL_NEXTTO' | 'SOME_NEXTTO' | 'EQUALS' | 'NOTEQUALS' | 'MATCHES' | 'NOTMATCHES' | 'FORWARD' | 'ALL_FORWARD' | 'SOME_FORWARD' | 'REVERSE' | 'ALL_REVERSE' | 'SOME_REVERSE' | 'SAME_ORIENTATION' | 'REPRESSES' | 'INDUCES' | 'DRIVES' )
            int alt8=36;
            switch ( input.LA(1) ) {
            case ID:
            case INT:
            case 17:
            case 18:
            case 58:
                {
                alt8=1;
                }
                break;
            case 28:
                {
                alt8=2;
                }
                break;
            case 40:
                {
                alt8=3;
                }
                break;
            case 32:
                {
                alt8=4;
                }
                break;
            case 42:
                {
                alt8=5;
                }
                break;
            case 36:
                {
                alt8=6;
                }
                break;
            case 44:
                {
                alt8=7;
                }
                break;
            case 57:
                {
                alt8=8;
                }
                break;
            case 46:
                {
                alt8=9;
                }
                break;
            case 56:
                {
                alt8=10;
                }
                break;
            case 45:
                {
                alt8=11;
                }
                break;
            case 55:
                {
                alt8=12;
                }
                break;
            case 30:
                {
                alt8=13;
                }
                break;
            case 27:
                {
                alt8=14;
                }
                break;
            case 23:
                {
                alt8=15;
                }
                break;
            case 51:
                {
                alt8=16;
                }
                break;
            case 21:
                {
                alt8=17;
                }
                break;
            case 22:
                {
                alt8=18;
                }
                break;
            case 50:
                {
                alt8=19;
                }
                break;
            case 38:
                {
                alt8=20;
                }
                break;
            case 25:
                {
                alt8=21;
                }
                break;
            case 53:
                {
                alt8=22;
                }
                break;
            case 31:
                {
                alt8=23;
                }
                break;
            case 41:
                {
                alt8=24;
                }
                break;
            case 35:
                {
                alt8=25;
                }
                break;
            case 43:
                {
                alt8=26;
                }
                break;
            case 33:
                {
                alt8=27;
                }
                break;
            case 24:
                {
                alt8=28;
                }
                break;
            case 52:
                {
                alt8=29;
                }
                break;
            case 48:
                {
                alt8=30;
                }
                break;
            case 26:
                {
                alt8=31;
                }
                break;
            case 54:
                {
                alt8=32;
                }
                break;
            case 49:
                {
                alt8=33;
                }
                break;
            case 47:
                {
                alt8=34;
                }
                break;
            case 34:
                {
                alt8=35;
                }
                break;
            case 29:
                {
                alt8=36;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:86:2: 
                    {
                    }
                    break;
                case 2 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:86:4: 'CONTAINS'
                    {
                    match(input,28,FOLLOW_28_in_operator157); 

                    }
                    break;
                case 3 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:87:4: 'NOTCONTAINS'
                    {
                    match(input,40,FOLLOW_40_in_operator162); 

                    }
                    break;
                case 4 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:88:4: 'EXACTLY'
                    {
                    match(input,32,FOLLOW_32_in_operator167); 

                    }
                    break;
                case 5 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:89:4: 'NOTEXACTLY'
                    {
                    match(input,42,FOLLOW_42_in_operator172); 

                    }
                    break;
                case 6 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:90:4: 'MORETHAN'
                    {
                    match(input,36,FOLLOW_36_in_operator177); 

                    }
                    break;
                case 7 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:91:4: 'NOTMORETHAN'
                    {
                    match(input,44,FOLLOW_44_in_operator182); 

                    }
                    break;
                case 8 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:92:4: 'WITH'
                    {
                    match(input,57,FOLLOW_57_in_operator187); 

                    }
                    break;
                case 9 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:93:4: 'NOTWITH'
                    {
                    match(input,46,FOLLOW_46_in_operator192); 

                    }
                    break;
                case 10 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:94:4: 'THEN'
                    {
                    match(input,56,FOLLOW_56_in_operator197); 

                    }
                    break;
                case 11 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:95:4: 'NOTTHEN'
                    {
                    match(input,45,FOLLOW_45_in_operator202); 

                    }
                    break;
                case 12 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:96:4: 'STARTSWITH'
                    {
                    match(input,55,FOLLOW_55_in_operator209); 

                    }
                    break;
                case 13 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:97:4: 'ENDSWITH'
                    {
                    match(input,30,FOLLOW_30_in_operator214); 

                    }
                    break;
                case 14 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:98:4: 'BEFORE'
                    {
                    match(input,27,FOLLOW_27_in_operator219); 

                    }
                    break;
                case 15 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:99:4: 'ALL_BEFORE'
                    {
                    match(input,23,FOLLOW_23_in_operator224); 

                    }
                    break;
                case 16 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:100:4: 'SOME_BEFORE'
                    {
                    match(input,51,FOLLOW_51_in_operator229); 

                    }
                    break;
                case 17 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:101:4: 'AFTER'
                    {
                    match(input,21,FOLLOW_21_in_operator234); 

                    }
                    break;
                case 18 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:102:4: 'ALL_AFTER'
                    {
                    match(input,22,FOLLOW_22_in_operator239); 

                    }
                    break;
                case 19 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:103:4: 'SOME_AFTER'
                    {
                    match(input,50,FOLLOW_50_in_operator244); 

                    }
                    break;
                case 20 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:104:4: 'NEXTTO'
                    {
                    match(input,38,FOLLOW_38_in_operator249); 

                    }
                    break;
                case 21 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:105:4: 'ALL_NEXTTO'
                    {
                    match(input,25,FOLLOW_25_in_operator254); 

                    }
                    break;
                case 22 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:106:4: 'SOME_NEXTTO'
                    {
                    match(input,53,FOLLOW_53_in_operator259); 

                    }
                    break;
                case 23 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:107:4: 'EQUALS'
                    {
                    match(input,31,FOLLOW_31_in_operator264); 

                    }
                    break;
                case 24 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:108:4: 'NOTEQUALS'
                    {
                    match(input,41,FOLLOW_41_in_operator269); 

                    }
                    break;
                case 25 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:109:4: 'MATCHES'
                    {
                    match(input,35,FOLLOW_35_in_operator274); 

                    }
                    break;
                case 26 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:110:4: 'NOTMATCHES'
                    {
                    match(input,43,FOLLOW_43_in_operator279); 

                    }
                    break;
                case 27 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:111:4: 'FORWARD'
                    {
                    match(input,33,FOLLOW_33_in_operator284); 

                    }
                    break;
                case 28 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:112:4: 'ALL_FORWARD'
                    {
                    match(input,24,FOLLOW_24_in_operator289); 

                    }
                    break;
                case 29 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:113:4: 'SOME_FORWARD'
                    {
                    match(input,52,FOLLOW_52_in_operator294); 

                    }
                    break;
                case 30 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:114:4: 'REVERSE'
                    {
                    match(input,48,FOLLOW_48_in_operator299); 

                    }
                    break;
                case 31 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:115:4: 'ALL_REVERSE'
                    {
                    match(input,26,FOLLOW_26_in_operator304); 

                    }
                    break;
                case 32 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:116:4: 'SOME_REVERSE'
                    {
                    match(input,54,FOLLOW_54_in_operator309); 

                    }
                    break;
                case 33 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:117:4: 'SAME_ORIENTATION'
                    {
                    match(input,49,FOLLOW_49_in_operator314); 

                    }
                    break;
                case 34 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:118:4: 'REPRESSES'
                    {
                    match(input,47,FOLLOW_47_in_operator319); 

                    }
                    break;
                case 35 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:119:4: 'INDUCES'
                    {
                    match(input,34,FOLLOW_34_in_operator324); 

                    }
                    break;
                case 36 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:120:4: 'DRIVES'
                    {
                    match(input,29,FOLLOW_29_in_operator329); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "operator"



    // $ANTLR start "operand"
    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:123:1: operand : ( ID | INT | '[' INT ']' );
    public final void operand() throws RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:123:9: ( ID | INT | '[' INT ']' )
            int alt9=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt9=1;
                }
                break;
            case INT:
                {
                alt9=2;
                }
                break;
            case 58:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:123:11: ID
                    {
                    match(input,ID,FOLLOW_ID_in_operand342); 

                    }
                    break;
                case 2 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:124:4: INT
                    {
                    match(input,INT,FOLLOW_INT_in_operand348); 

                    }
                    break;
                case 3 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:125:4: '[' INT ']'
                    {
                    match(input,58,FOLLOW_58_in_operand353); 

                    match(input,INT,FOLLOW_INT_in_operand355); 

                    match(input,59,FOLLOW_59_in_operand357); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "operand"



    // $ANTLR start "list_of_parameters"
    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:128:1: list_of_parameters : operand ( ',' list_of_parameters )? ;
    public final void list_of_parameters() throws RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:129:2: ( operand ( ',' list_of_parameters )? )
            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:129:4: operand ( ',' list_of_parameters )?
            {
            pushFollow(FOLLOW_operand_in_list_of_parameters368);
            operand();

            state._fsp--;


            // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:129:12: ( ',' list_of_parameters )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/Eugene/miniEugene/workspace/temporalEugene-core/grammar/MiniEugene.g:129:13: ',' list_of_parameters
                    {
                    match(input,17,FOLLOW_17_in_list_of_parameters371); 

                    pushFollow(FOLLOW_list_of_parameters_in_list_of_parameters373);
                    list_of_parameters();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "list_of_parameters"

    // Delegated rules


 

    public static final BitSet FOLLOW_size_in_miniEugene40 = new BitSet(new long[]{0x07FFFFDFFFE00600L});
    public static final BitSet FOLLOW_constraint_in_miniEugene45 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_miniEugene47 = new BitSet(new long[]{0x07FFFFDFFFE00602L});
    public static final BitSet FOLLOW_composite_constraint_in_miniEugene50 = new BitSet(new long[]{0x07FFFFDFFFE00602L});
    public static final BitSet FOLLOW_37_in_size64 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_size66 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_size68 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_size70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_composite_constraint81 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_15_in_composite_constraint85 = new BitSet(new long[]{0x0400000000000600L});
    public static final BitSet FOLLOW_list_of_parameters_in_composite_constraint87 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_composite_constraint89 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_composite_constraint94 = new BitSet(new long[]{0x07FFFFDFFFE00600L});
    public static final BitSet FOLLOW_composite_constraint_block_in_composite_constraint96 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_composite_constraint98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constraint_in_composite_constraint_block109 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_composite_constraint_block112 = new BitSet(new long[]{0x07FFFFDFFFE00600L});
    public static final BitSet FOLLOW_composite_constraint_block_in_composite_constraint_block114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_constraint130 = new BitSet(new long[]{0x07FFFF5FFFE00600L});
    public static final BitSet FOLLOW_operand_in_constraint135 = new BitSet(new long[]{0x07FFFF5FFFE00600L});
    public static final BitSet FOLLOW_operator_in_constraint139 = new BitSet(new long[]{0x0400000000000602L});
    public static final BitSet FOLLOW_operand_in_constraint142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_operator157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_operator162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_operator167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_operator172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_operator177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_operator182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_operator187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_operator192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_operator197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_operator202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_operator209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_operator214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_operator219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_operator224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_operator229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_operator234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_operator239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_operator244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_operator249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_operator254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_operator259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_operator264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_operator269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_operator274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_operator279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_operator284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_operator289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_operator294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_operator299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_operator304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_operator309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_operator314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_operator319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_operator324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_operator329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_operand342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_operand348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_operand353 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_operand355 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_operand357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operand_in_list_of_parameters368 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_list_of_parameters371 = new BitSet(new long[]{0x0400000000000600L});
    public static final BitSet FOLLOW_list_of_parameters_in_list_of_parameters373 = new BitSet(new long[]{0x0000000000000002L});

}