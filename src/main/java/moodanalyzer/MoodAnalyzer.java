package moodanalyzer;

//UC1
public class MoodAnalyzer {
    static final String SAD_RESULT = "SAD";
    static final String HAPPY_RESULT = "HAPPY";

    public String message;

    public MoodAnalyzer() {
        this.message = "";
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzeMood() {
        try {
            message = message.toLowerCase();

            String result = "";

            if (message.contains("sad")) {
                result = SAD_RESULT;
            } else {
                result = HAPPY_RESULT;
            }

            return result;
        } catch (NullPointerException e) {
            System.out.println("error");
            return "HAPPY";
        }

    }

}
