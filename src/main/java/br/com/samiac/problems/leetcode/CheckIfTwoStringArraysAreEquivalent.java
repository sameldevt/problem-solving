package br.com.samiac.problems.leetcode;

public class CheckIfTwoStringArraysAreEquivalent {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder sbWord1 = new StringBuilder();
        StringBuilder sbWord2 = new StringBuilder();

        for(String s : word1){
            sbWord1.append(s);
        }

        for(String s : word2){
            sbWord2.append(s);
        }

        if(sbWord1.length() != sbWord2.length()){
            return false;
        }

        return sbWord1.toString().equals(sbWord2.toString());
    }
}
