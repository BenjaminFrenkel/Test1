import java.util.*;

public class Test1
{
    public static void main(String[]args)
    {
        System.out.println("Hello World!");
        ArrayList<Integer> list = new ArrayList<>();

    }
}

class Class {
    int a, b;
    String c, d;

    public Class(int a, int b, String c, String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Class aClass = (Class) o;
        return a == aClass.a &&
                b == aClass.b &&
                Objects.equals(c, aClass.c) &&
                Objects.equals(d, aClass.d);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c, d);
    }

    @Override
    public String toString() {
        return "Class{" +
                "a=" + a +
                ", b=" + b +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }



}
