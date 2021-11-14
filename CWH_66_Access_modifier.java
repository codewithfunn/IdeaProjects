package com.company;

class C1{                //  |  Modifier   |  Class  | Package   |   Subclass  |  World   |
    public int x =25;    //  |  Public     |    Y    |    Y      |     Y       |    Y     |
    protected int y=65;  //  |  Protected  |    Y    |    Y      |     Y       |    N     |
    int z = 35;          //  |  Default    |    Y    |    Y      |     N       |    N     |
    private int a =42;   //  |  Private    |    Y    |    N      |     N       |    N     |

    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class CWH_66_Access_modifier {
    public static void main(String[] args) {
        C1 c = new C1();
        c.meth1();
    }
}
