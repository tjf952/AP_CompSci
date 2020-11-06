public class DeskClock implements Clock
{
    private int hours;
    private int  minutes;
    final int MAX_MINUTES = 60;
    final int MAX_HOURS = 12;
    // No arguments
    public DeskClock(){
        this(12,0);
    }
    // Two arguments
    public DeskClock(int hr, int min){
        hours = hr;
        minutes = min;
    }
    
    // Accessors
    public int getHour(){
        return hours;
    }
    public int getMinutes(){
        return minutes;
    }
    // Modifiers/Mutators
    // Precondition: hr and min represent valid time
    public void setHour(int hr){
        hours = hr;
    }
    public void setMinutes(int min){
        minutes = min;
    }
    // Override Object's methods
    public String toString(){
        String answer = "";
        if(hours/10 < 1){
            answer += "0" + hours;
        } else{
            answer += hours;
        }
        if(minutes/10 <1){
            answer += ":0" + minutes;
        } else{
            answer += ":" + minutes;
        }
        return answer;
    }
    
    public boolean equals (Object obj){
        if(hours == ((Clock)obj).getHour() && minutes == ((Clock)obj).getMinutes()){
            return true;
        } 
        return false;
    }
    // Other methods
    /** 
     * "normalizes" time to proper hour & minutes values
     *  For example: 1<=hour<=12 and 0<=minutes<60
     *               AM and PM are not distinguished
     *  May be changed for each "clock style"
     */
    public void normalizeTime(){
        if(minutes >= MAX_MINUTES){
            hours += minutes/MAX_MINUTES;
            minutes = minutes%MAX_MINUTES;
        }
        if(hours > MAX_HOURS){
            hours = hours%MAX_HOURS;
        }
    }
    
    // Adds a minute to time & calls normalizeTime()
    public void addOneMinute(){
        minutes++;
        normalizeTime();
    }
    
    // Adds some minutes to time & calls normalizeTime()
    public void addMinutes(int min){
        minutes += min;
        normalizeTime();
    }
    
    // Adds some hours & minutes to time 
    //  & calls normalizeTime()
    public void addTime(int hr, int min){
        minutes += min;
        hours += hr;
        normalizeTime();
    }
    
    // Resets the time
    // Precondition: hr and min represent valid time
    public void resetTime(int hr, int min){
        hours = hr;
        minutes = min;
    }
}