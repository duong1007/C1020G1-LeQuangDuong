package class_and_object.bai_tap.stop_watch;

public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch(){
        this.startTime = System.currentTimeMillis();
    }

    public long getEndTime() {
        return this.endTime;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long start() {
       return this.startTime = System.currentTimeMillis( );
    }

    public long stop() {
        return this.endTime = System.currentTimeMillis( );
    }
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
