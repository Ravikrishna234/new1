import java.util.Scanner;

/**
 * Solution class for code-eval.
 */
public final class Solution {
     /**
     * Constructs the object.
     */
    private Solution() {
        // leave this blank
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
         // instantiate this Quiz
        Quiz q = new Quiz();
         // code to read the test cases input file
        Scanner s = new Scanner(System.in);
        // check if there is one more line to process
        while (s.hasNext()) {
            // read the line
            String line = s.nextLine();
             // split the line using space
            String[] tokens = line.split(" ");
              // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "LOAD_QUESTIONS":
                System.out.println("|----------------|");
                System.out.println("| Load Questions |");
                System.out.println("|----------------|");
                loadQuestions(s, q, Integer.parseInt(tokens[1]));
                break;
                case "START_QUIZ":
                System.out.println("|------------|");
                System.out.println("| Start Quiz |");
                System.out.println("|------------|");
                startQuiz(s, q, Integer.parseInt(tokens[1]));
                break;
                case "SCORE_REPORT":
                System.out.println("|--------------|");
                System.out.println("| Score Report |");
                System.out.println("|--------------|");
                displayScore(q);
                break;
                default:
                break;
            }
        }
    }
    /**
     * Loads questions.
     *
     * @param      s              The scanner object for user input
     * @param      quiz           The quiz object
     * @param      questionCount  The question count
     */
    static String[] q1;
    static String[]	c1 = new String[50];
    public static void loadQuestions(final Scanner s, final Quiz quiz, final int questionCount) {
        // write your code here to read the questions from the console
        // tokenize the question line and create the question object
        // add the question objects to the quiz class"
        int i;
        if(questionCount == 0) {
        	System.out.println("Quiz does not have questions");
        	return;
        }
         for(i = 0; i < questionCount; i++) {
        	 q1 = s.nextLine().split(":");
        	 c1 = q1;
        	 Quiz iz = new Quiz(q1[0]);
        	 Quiz cz = new Quiz(q1[0],q1[1],q1[2],q1[3],q1[4]);
        	 if(q1[0].equals("")){
        	 	System.out.println("Error! Malformed question");
        	 	return;
        	 }
        	 	else if(Integer.parseInt(q1[4]) > 0) {
        	 		System.out.println("Invalid penalty for "+q1[0]);
        	 		return;
        	 	}
        	 	else if(Integer.parseInt(q1[3]) < 0) {
        	 		System.out.println("Invalid max marks for "+q1[0]);
        	 		return;
        	 	}
        	 }

    		 if(i == questionCount) {
     			System.out.println(questionCount+" "+"are added to quiz");
        }
     }

    /**
     * Starts a quiz.
     *
     * @param      s            The scanner object for user input
     * @param      quiz         The quiz object
     * @param      answerCount  The answer count
     */
    public static void startQuiz(final Scanner s, final Quiz quiz, final int answerCount) {
        // write your code here to display the quiz questions
        // read the user responses from the console
        // store the user respones in the quiz object
        String a = s.nextLine();
}
    /**
     * Displays the score report
     *
     * @param      quiz     The quiz object
     */
    public static void displayScore(final Quiz quiz) {
        // write your code here to display the score report
    }
}
