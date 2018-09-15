class Quiz {
    Quiz(){}
    	String question;
    	String choice;
    	String answer;
    	String Maximum_marks;
    	String penalty;
        String size;
    	Quiz(String q,String c,String a,String max,String p) {
    		this.question = q;
    		this.choice = c;
    		this.answer = a;
    		this.Maximum_marks = max;
    		this.penalty = p;
    	}
    	Quiz(String q) {
    		this.answer = q;
    	}
    }