package Interface;

public class ByThrees implements Series {
    int start;
    int val;
    int prev;

    ByThrees(){
        val = 0;
        prev = -3;
    }
    @Override
    public int getNext() {
        prev = val;
        val += 3;
        return val;
    }
    @Override
    public void reset() {
        val = 0;
        prev = -3;
    }
    @Override
    public void setStart(int x) {
        start = x;
        val = x;
        prev = x - 3;
    }
    int getPrevious(){
        return prev;
    }
}


