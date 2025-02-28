public class A
{
    protected int _x;

    public A()
    {
        _x = 0;
    }

    public A(int x)
    {
        _x = x;
    }

    public A( A a)
    {
        _x = a._x;
    }

    //method
    public int get_X()
    {
        return _x;
    }

    public int sum(int y)
    {
        return _x + y;
    }

    public String toString()
    {
        return "_x = " + _x + "\t";
    }

}
