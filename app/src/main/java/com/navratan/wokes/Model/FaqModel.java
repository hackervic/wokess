package com.navratan.wokes.Model;

public class FaqModel {

    String ques , answer;
    private boolean expanded;

    public FaqModel(String ques, String answer) {
        this.ques = ques;
        this.answer = answer;
        this.expanded=false;
    }

    public FaqModel() {
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    public String getQues() {
        return ques;
    }

    public void setQues(String ques) {
        this.ques = ques;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
