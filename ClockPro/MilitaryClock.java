public class MilitaryClock extends DeskClock
{
    final int MAX_MINUTES = 60;
    final int MAX_HOURS = 24;
    
    // No arguments
    public MilitaryClock(){
        this(0,0);
    }
    // Two arguments
    public MilitaryClock(int hr, int min){
        super(hr, min);
    }
    // Other methods
    @Override
    public void normalizeTime(){
        if(getMinutes() >= MAX_MINUTES){
            setHour(getHour() + getMinutes()/MAX_MINUTES);
            setMinutes(getMinutes()%MAX_MINUTES);
        }
        if(getHour() >= MAX_HOURS){
            setHour(getHour()%MAX_HOURS);
        }
    }
}