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
public abstract class KeywordAnalyzer {

    String[] keywords;

    KeywordAnalyzer() {
    }

    abstract void getKeywords(String[] s);

    abstract Label getLabel();

}
