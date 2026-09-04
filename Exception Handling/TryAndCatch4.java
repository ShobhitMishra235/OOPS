
public class TryAndCatch4 {
/*

try {
    file.open();
    readFile();              // NullPointerException
}
catch (ArithmeticException e) {
    System.out.println("Error");
}
finally {
    file.close();            // ✅ executes
}
    
*/

/*

try {
    file.open();
    readFile();       // exception
}
catch (ArithmeticException e) {
}
file.close();         // ❌ never reached

*/
}

