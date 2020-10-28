class Sphere {
    public float radius;
    public Sphere(float setradius){
	radius = setradius;
    }

    public float volume(){
	return (float)(4*Math.PI)*this.radius*this.radius*this.radius/(float)3;
    }
}

public class TestSphere{
    static float heightContactPoint(Sphere s1, Sphere s2){
	return 2*s1.radius*s2.radius/(s1.radius+s2.radius);//s1.radius+(s2.radius - s1.radius)*s1.radius/(s2.radius + s1.radius);
    }
    public static void main(String argv[]){
	Sphere s1 = new Sphere((float)3.0);
	Sphere s2 = new Sphere((float)3.0);
	Sphere s3 = new Sphere((float)5.0);
	System.out.println("s1: radius=" + s1.radius + "volume=" + s1.volume());
	System.out.println("s2: radius=" + s2.radius + "volume=" + s2.volume());
	System.out.println("s3: radius=" + s3.radius + "volume=" + s3.volume());
	System.out.println("s1&s2: height of contact point=" + heightContactPoint(s1, s2));
	System.out.println("s2&s3: height of contact point=" + heightContactPoint(s2, s3));
	System.out.println("s3&s1: height of contact point=" + heightContactPoint(s3, s1));
    }
}