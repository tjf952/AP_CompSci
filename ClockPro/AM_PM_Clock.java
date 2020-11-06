public class AM_PM_Clock extends MilitaryClock
{
    private String time;
    final int MAX_MINUTES = 60;
    final int MAX_TIME = 24;
    final int MAX_HOURS = 12;
    // No arguments
    public AM_PM_Clock(){
        this(12, 0, "AM");
    }
    // Two arguments
    public AM_PM_Clock(int hr, int min, String myTime){
        super(hr, min);
        time = myTime;
    }
    //Prints
    @Override
    public String toString(){
        return super.toString() + time;
    }
    //Normalizes time
    
    @Override
    public void normalizeTime(){
        if(getMinutes() >= MAX_MINUTES){
            setHour(getHour() + getMinutes()/MAX_MINUTES);
            setMinutes(getMinutes()%MAX_MINUTES);
        }
        if(getHour() >= MAX_HOURS){
            time = "PM";
        } else if(getHour() < MAX_HOURS){
            time = "AM";
        }
        if(getHour() >= MAX_HOURS){
            setHour(getHour()%MAX_HOURS);
        }
        if(getHour() == 0){
            setHour(12);
        }
    }
    
    // Resets the time
    public void resetTime(int hr, int min, String myTime){
        setHour(hr);
        setMinutes(min);
        time = myTime;
    }
}