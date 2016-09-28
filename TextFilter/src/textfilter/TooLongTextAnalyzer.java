/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfilter;

/**
 *
 * @author Alexander Shukan
 */
public class TooLongTextAnalyzer implements TextAnalyzer {

    private int maxLength;

    public TooLongTextAnalyzer(int m) {
        this.maxLength = m;
    }

    @Override
    public Label processText(String text) {
        if (text.length() > this.maxLength) {
            return Label.TOO_LONG;
        } else {
            return Label.OK;
        }
    }
}
