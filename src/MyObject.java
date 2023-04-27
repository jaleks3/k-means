public class MyObject {
    private final double[] vector;
    private int cluster;
    private int pastCluster;
    public MyObject(String lineOfData,int k) {

        String[] values = lineOfData.split(",");

        //assign values
        this.vector = new double[values.length];

        this.cluster = (int) (Math.random() * k);

        for(int i = 0; i< vector.length; i++)
            vector[i] = Double.parseDouble(values[i]);
    }
    public double[] getVector() {
        return vector;
    }
    public int getCluster() {
        return cluster;
    }

    public double distance(double[] v){
        double res = 0;
        for (int i = 0; i < this.vector.length; i++) {
            double diff = v[i] - this.vector[i];
            res += diff * diff;
        }
        return Math.sqrt(res);
    }

    public void setCluster(int newCluster) {
        this.pastCluster = cluster;
        this.cluster = newCluster;
        System.out.println("Previous cluster: "+pastCluster+" ; New cluster: "+cluster);
    }

    public int getPastCluster() {
        return pastCluster;
    }
}
