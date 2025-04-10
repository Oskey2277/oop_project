package QnA;

public class QuizTime {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        quiz.add(new Question("Which country does Nepal share its borders with?", "China and India"));
        quiz.add(new Question("Who is known as the “Light of Asia”?", "Gautam Buddha"));
        quiz.add(new Question("How many districts are there in Nepal?", "77"));
        quiz.add(new Question("Which is the highest mountain in the world??", "Mount Everest"));
        quiz.add(new Question("Who is the current President of Nepal?", "Ram Chandra Poudel"));
       

        quiz.giveQuiz();
    }
}

