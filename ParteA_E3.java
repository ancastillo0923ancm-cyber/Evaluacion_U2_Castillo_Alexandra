public class ParteA_E3 {
    // a no cambia porque nosotros le estamos asignando un numero que en este caso es el 5 
    static void m(int a, int[] v) { a++; v[1] += a; } 
    public static void main(String[] args) { int a = 5; int[] v = {1, 2, 3}; m(a, v); 
    System.out.println(a + " " + v[1]);
}
}