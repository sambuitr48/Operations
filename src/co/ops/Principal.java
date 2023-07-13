package co.ops;

public class Principal {
    public static void main(String[] args) {
        Sum plus = new Sum();
        plus.number1 = 35;
        plus.number2 = 45;
        System.out.println("The sum of the numbers is: " + plus.plus());

        Subtraction rest = new Subtraction();
        rest.restnumber1 = 50;
        rest.restnumber2 = 44;
        System.out.println("The rest of the numbers is: " + rest.sub());

        Split part = new Split();
        part.divnumber1 = 40;
        part.divnumber2 = 2;
        System.out.println("The split of the numbers is: " + part.spl());

        Multiplication mtl = new Multiplication();
        mtl.multnumber1 = 500;
        mtl.multnumber2 = 200;
        System.out.println("The multiplication of the numbers is: " + mtl.multiply());
    }
}


