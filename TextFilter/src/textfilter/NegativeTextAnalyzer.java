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

    NegativeTextAnalyzer() {
        String[] s = new String[3];
        this.keywords = new String[3];
        s[0] = ":(";
        s[1] = "=(";
        s[2] = ":|";
        System.arraycopy(s, 0, this.keywords, 0, s.length);
        this.l = Label.NEGATIVE_TEXT;
    }

    @Override
    public Label processText(String text) {
        for (int i = 0; i < this.keywords.length; i++) {

            if (text.contains(this.keywords[i])) {
                return this.l;
            }
        }
        return Label.OK;
    }

}
