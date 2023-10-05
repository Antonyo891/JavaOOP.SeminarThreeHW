import java.util.ArrayList;
import java.util.Iterator;

public class StreamOfGroup implements Iterator<StudentsGroup> {
    private ArrayList<StudentsGroup> flowOfGroup;
    private int index=0;

    public StreamOfGroup(ArrayList<StudentsGroup> flowOfGroup) {
        this.flowOfGroup = flowOfGroup;
    }

    public int getFlowOfGroupSize() {
        return this.flowOfGroup.size();
    }

    public ArrayList<StudentsGroup> getFlowOfGroup() {
        return this.flowOfGroup;
    }

    public void setFlowOfGroup(ArrayList<StudentsGroup> flowOfGroup) {
        this.flowOfGroup = flowOfGroup;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public boolean hasNext() {
        if (index>=this.flowOfGroup.size()){
            index=0;
            return false;
        } return index<flowOfGroup.size();
    }

    @Override
    public StudentsGroup next() {
    if (!hasNext()) {
        index=0;
        return null;
    }    return this.flowOfGroup.get(index++);
    }

    public StudentsGroup previous() {
        if (index==0) {
            index = this.flowOfGroup.size()-1;
            return this.flowOfGroup.get(index);}
        return this.flowOfGroup.get(--index);            
    }

}
