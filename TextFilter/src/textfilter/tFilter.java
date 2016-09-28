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
public class tFilter {

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        Label res;
        for (int i = 0; i < analyzers.length; i++) {
            res = analyzers[i].processText(text);
            if (res != Label.OK) {
                return res;
            }
        }
        return Label.OK;
    }

}
