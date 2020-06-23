package model;

import java.util.ArrayList;
import java.util.List;

public class DFA {

    private List<String> alphabet;
    private int numberOfStates;
    private char initialState;
    private List<String> finalStates;
    private List<String> transitions;
    private char currentState;
    private int currentValuePosition;

    public DFA() {
        alphabet = new ArrayList<>();
        finalStates = new ArrayList<>();
        transitions = new ArrayList<>();
        currentState = initialState;
        currentValuePosition = 0;
    }

    public boolean checkRepeatedValue(String transition) {
        char state1 = transition.charAt(0);
        char value = transition.charAt(1);

        if (!transitions.isEmpty()) {
            for (int i = 0; i < transitions.size(); i++) {
                char state1TransitionList = transitions.get(i).charAt(0);
                char valueTransitionList = transitions.get(i).charAt(1);

                if (state1 == state1TransitionList && value == valueTransitionList) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkAlphabet(String input) {
        char inputFirstCharacter = input.charAt(0);

        if (checkIfCanStart(inputFirstCharacter)) {
            if (input.length() == 1) {
                return checkIfCanEnd(currentState);
            }
            if (checkTransition(input)) {
                currentState = initialState;
                return true;
            }
        }

        return false;
    }

    private boolean checkTransition(String input) {
        for (int i = 0; i < transitions.size(); i++) {
            char state1Transition = transitions.get(i).charAt(0);
            char valueTransition = transitions.get(i).charAt(1);
            char state2Transition = transitions.get(i).charAt(2);

            if (state1Transition == currentState) {
                if (valueTransition == input.charAt(currentValuePosition)) {
                    currentState = state2Transition;
                    currentValuePosition++;

                    if (input.length() == currentValuePosition) {
                        return checkIfCanEnd(currentState);
                    }
                    return checkTransition(input);
                }
            }
        }

        return false;
    }

    private boolean checkIfCanEnd(char currentState) {
        for (int i = 0; i < finalStates.size(); i++) {
            char finalSt = finalStates.get(i).charAt(0);

            if (currentState == finalSt) {
                return true;
            }
        }

        return false;
    }

    private boolean checkIfCanStart(char inputFirstCharacter) {
        for (int i = 0; i < transitions.size(); i++) {
            char state1Transition = transitions.get(i).charAt(0);
            char valueTransition = transitions.get(i).charAt(1);
            char state2Transition = transitions.get(i).charAt(2);

            if (state1Transition == initialState) {
                if (valueTransition == inputFirstCharacter) {
                    currentState = state2Transition;
                    currentValuePosition = 1;
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

    public char getInitialState() {
        return initialState;
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
