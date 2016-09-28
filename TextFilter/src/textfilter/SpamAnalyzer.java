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
public class SpamAnalyzer extends KeywordAnalyzer {
 
    private String[] keywords;
    
    SpamAnalyzer(String[] s) {
        this.keywords = new String[s.length];
        System.arraycopy(s, 0, this.keywords, 0, s.length);
        this.l = Label.SPAM;
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
