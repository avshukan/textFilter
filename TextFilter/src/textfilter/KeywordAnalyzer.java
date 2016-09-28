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

    @Override
    public Label processText(String text) {
        for (int i = 0; i < this.keywords.length; i++) {

            if (text.contains(this.keywords[i])) {
                return this.l;
            }
        }
        return Label.OK;
    }

    protected abstract String[] getKeywords();

    /**
     *
     * @return
     */
    protected abstract Label getLabel();

}
