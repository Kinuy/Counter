package org.example;

public class Count {
    private static int totalCount = 0;
    private int instanceCount = 0;

/*    public Count() {
//        totalCount++;
//        incrementInstanceCount();
    }*/

/*    public Count(int instanceCount) {
        this.instanceCount = instanceCount;
    }*/

    public static void incrementTotalCount(){
        totalCount++;
    }
    public void incrementInstanceCount(){
        instanceCount++;
    }

    @Override
    public String toString() {
        return "Count{" +
                "instanceCount=" + instanceCount +
                "TotalCount=" + totalCount +
                '}';
    }
}
