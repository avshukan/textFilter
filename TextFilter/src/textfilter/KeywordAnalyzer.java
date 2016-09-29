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
public abstract class KeywordAnalyzer implements TextAnalyzer {

    String[] keywords;
    Label l;
    KeywordAnalyzer(String[] s) {
        this.keywords = new String[s.length];
        System.arraycopy(s, 0, this.keywords, 0, s.length);
        this.l = Label.SPAM;
    }

    KeywordAnalyzer() {
        this.keywords = new String[3];
        this.keywords[0] = ":(";
        this.keywords[1] = "=(";
        this.keywords[2] = ":|";
    }

    @Override
    public Label processText(String text) {
        System.out.println(text);
        System.out.println(keywords[0]);
        for (int i = 0; i < this.keywords.length; i++) {
            if (text.contains(this.keywords[i])) {
                return this.l;
            }
        }
        return Label.OK;
    }

    protected abstract String[] getKeywords();

    protected abstract Label getLabel();

}
