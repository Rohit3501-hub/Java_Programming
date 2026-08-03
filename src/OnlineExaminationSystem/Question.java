package OnlineExaminationSystem;

public abstract class Question {
    private int questionId;
    private String questionTitle;
    private int marks;

    private String difficultLevel;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getDifficultLevel() {
        return difficultLevel;
    }

    public void setDifficultLevel(String difficultLevel) {
        this.difficultLevel = difficultLevel;
    }

    public Question(int questionId, String questionTitle, int marks, String difficultLevel) {
        this.questionId = questionId;
        this.questionTitle = questionTitle;
        this.marks = marks;
        this.difficultLevel = difficultLevel;


    }

    public void displayQuestion() {
        System.out.println("Question ID: " + questionId);
        System.out.println("Question Title: " + questionTitle);
        System.out.println("Marks: " + marks);
        System.out.println("Difficulty Level: " + difficultLevel);
    }

    public void evaluateAnswer() {

        System.out.println("Evaluating answer for question ID: " + questionId);
    }
}
