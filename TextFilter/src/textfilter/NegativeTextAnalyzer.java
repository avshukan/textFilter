/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfilter;

/**
 *
 * @author _
 */
public class NegativeTextAnalyzer extends KeywordAnalyzer {

    String[] keywords;

    NegativeTextAnalyzer() {
        super();
        this.l = Label.NEGATIVE_TEXT;
    }

    @Override
    protected String[] getKeywords() {
        return this.keywords;
    }

    @Override
    protected Label getLabel() {
        return this.l;
    }

}
