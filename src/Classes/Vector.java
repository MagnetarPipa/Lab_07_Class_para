package Classes;

public class Vector {

    int X;
    int Y;
    int Z;

    public Vector(int x, int y, int z) {

        this.setX(x);
        this.setY(y);
        this.setZ(z);

    }


    public Vector add(Vector another){

        return new Vector(this.getX()+another.getX(),this.getY()+another.getY(),this.getZ()+another.getZ());
    }

    public int scal_mult(Vector another){

        int X1=this.getX()*another.getX();
        int Y2=this.getY()*another.getY();
        int Z2=this.getZ()*another.getZ();


        return  X1+Y2+Z2;

    }


    public int getX() {
        return X;
    }

    public void setX(int x) {
        this.X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        this.Y = y;
    }

    public int getZ() {
        return Z;
    }

    public void setZ(int z) {
        this.Z = z;
    }


    @Override
    public String toString() {
        return "Vector{" + "X=" + X + ", Y=" + Y + ", Z=" + Z + '}';
    }
}
