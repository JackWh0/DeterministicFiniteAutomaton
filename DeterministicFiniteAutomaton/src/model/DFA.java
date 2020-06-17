package model;

import java.util.ArrayList;
import java.util.List;

public class DFA {

    private List<String> alphabet;
    private int numberOfStates;
    private char initialState;
    private List<String> finalStates;
    private List<String> transitions;
    private String currentState;
    private int currentValuePosition;

    public DFA() {
        alphabet = new ArrayList<>();
        finalStates = new ArrayList<>();
        transitions = new ArrayList<>();
        currentState = "" + initialState;
        currentValuePosition = 0;
    }

    public boolean checkRepeatedTransition(String transition) {
        if (!transitions.isEmpty()) {
            for (int i = 0; i < transitions.size(); i++) {
                if (transitions.get(i).equals(transition)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void addFinalState(String finalState) {
        finalStates.add(finalState);
    }

    public void addTransition(String state1, String value, String state2) {
        transitions.add(state1 + value + state2);
    }

    public void setAlphabet(List<String> alphabet) {
        this.alphabet = alphabet;
    }

    public List<String> getAlphabet() {
        return alphabet;
    }

    public void setNumberOfStates(int numberOfStates) {
        this.numberOfStates = numberOfStates;
    }

    public int getNumberOfStates() {
        return numberOfStates;
    }

    public void setInitialState(char initialState) {
        this.initialState = initialState;
    }
    
    public List<String> getFinalStates() {
        return finalStates;
    }

    public String getTransitions() {
        String transitionsTable = "";

        for (int i = 0; i < transitions.size(); i++) {
            transitionsTable += "  " + transitions.get(i).charAt(0) + "     |     " + transitions.get(i).charAt(1)
                    + "   |     " + transitions.get(i).charAt(2) + "       |     \n";
        }
        return "State | With  | Goes to |\n" + transitionsTable;
    }

}
