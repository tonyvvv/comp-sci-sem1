/*
    Lecture note example - Loops!!
*/

class LectureLoops{
    public static void main(String args[]) {
        int x = 1;
        int count = 0;
        while(true){
            if(count == 10){
                break;
            }
            System.out.println(x);
            x = x * 5;
            count = count + 1;
        }
        
	}
}
