public class NestedTryAndCatch4 {
public static void main(String[] args) {
try {                         // OUTER TRY
    System.out.println("Outer try starts");

    try {                     // INNER TRY
        System.out.println("Inner try starts");

        System.out.println(5 / 0);  // EXCEPTION HERE

        System.out.println("Inner try ends");
    }
    catch (NullPointerException e) {
        System.out.println("Nulls are not allowed");
    }

    System.out.println("Outer try ends");  // NOT REACHED
}
catch (ArithmeticException e) {
    System.out.println("Divide by zero not allowed : Outer");
}
    }
}

/*

OUTER TRY
│
├── Outer try starts       ✅
│
├── INNER TRY
│   ├── Inner try starts   ✅
│   ├── 5 / 0              ❌ Exception
│   └── Inner try ends     ❌ skipped
│
├── Inner catch            ❌ doesn't match
│
├── Outer try ends         ❌ skipped
│
└── Outer catch            ✅ handles exception

*/