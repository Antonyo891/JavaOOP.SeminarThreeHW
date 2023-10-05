import java.util.Comparator;

public class StreamComparator implements Comparator<StreamOfGroup> {

    @Override
    public int compare(StreamOfGroup o1, StreamOfGroup o2) {
        if (o1.getFlowOfGroupSize()==o2.getFlowOfGroupSize())return 0;
        else if (o1.getFlowOfGroupSize()>o2.getFlowOfGroupSize()) return 1;
        else return -1;
        //return compare(o1.getFlowOfGroupSize(), o2.getFlowOfGroupSize()); }
    
}}
