package main.java;
interface Name{
    String getName();
}
abstract class Shape implements Name{
}
class Circle extends Shape{

    @Override
    public String getName() {
        return "circle";
    }
}
class Quard extends Shape{

    @Override
    public String getName() {
        return "quard";
    }
}
class Cone extends Shape{

    @Override
    public String getName() {
        return "cone";
    }
}
class Cube extends Shape{

    @Override
    public String getName() {
        return "cube";
    }
}
class Oval extends Shape{

    @Override
    public String getName() {
        return "oval";
    }
}
class ShapeTest {
    public static void main(String[] args) {
        Shape a=new Circle();
        Shape m=new Cone();
        Shape b=new Quard();
        Shape d=new Oval();
        Shape v=new Cube();
        System.out.println(a.getName());;
        System.out.println(m.getName());
        System.out.println(b.getName());;
        System.out.println(d.getName());
        System.out.println(v.getName());
    }
}