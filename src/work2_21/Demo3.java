package work2_21;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -02 -21
 * Time: 12:01
 */

interface A {
    void funcA();
}
interface B {
    void funcB();
}
interface C {
    void funcC();
}
interface D extends A,B,C{
    void funcD();
}
class F implements D {
    @Override
    public void funcA() {
    }
    @Override
    public void funcB() {
    }
    @Override
    public void funcC() {
    }
    @Override
    public void funcD() {
    }
}

abstract class TestAbstrect {
    public abstract void testAbstrect();
}
class Test extends TestAbstrect implements A,B,C {
    @Override
    public void funcA() {
    }
    @Override
    public void funcB() {
    }
    @Override
    public void funcC() {
    }
    @Override
    public void testAbstrect() {
    }
}

public class Demo3 {
}
