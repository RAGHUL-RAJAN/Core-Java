package Class_Object;

class Test {
    String name = "Test case Passed";
    void printText(){
        System.out.println(name);
    }
}

class TestCase{
    public static void main(String[] args) {
        Test tc = new Test();
        tc.printText();
    }
}


