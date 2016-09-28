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
public abstract class KeywordAnalyzer implements TextAnalyzer{

    String[] keywords;
    Label l;

    KeywordAnalyzer() {
    }

    private String[] getKeywords() {
        return this.keywords;
    }

    private Label getLabel() {
        return this.l;
    }

}
