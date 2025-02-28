public class B extends A
{
    private int _y;
    @SuppressWarnings("unused")
    private A _a;
    
    public B()
    {
        _a = new A();
        _y = 0;
    }

    public B(int y)
    {
        _a = new A();
        _y = y;
    }
    
    public B(int y , int x , A a)
    {
        super(x);
        _a = new A(a);
        _y = y;
    }
    
    public int sum(int z)
    {
        return  z + _x + _y;
    }
    
    /*
    public String toString()
    {
        return super.toString() + " _y = " + _y + "\t   " + "_a = " +  _a._x;
    }
    */
}
