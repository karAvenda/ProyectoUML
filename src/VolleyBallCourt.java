public class VolleyBallCourt {
    String size;
   String nameCourt;
    int numMesh;

    public VolleyBallCourt(String size, String nameCourt, int numMesh) {
        this.size = size;
        this.nameCourt = nameCourt;
        this.numMesh = numMesh;
    }

    public String displayDataCourt(){
        return ("Size:"+size+"\nName Court:"+nameCourt+"\nNumber Mesh:"+numMesh);

        //System.out.println("Datos de la cancha de volley");


    }

    public String getSize() {
        return size;
    }

    public String getNameCourt() {
        return nameCourt;
    }

    public int getNumMesh() {
        return numMesh;
    }
}
