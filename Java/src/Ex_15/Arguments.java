package Ex_15;

public class Arguments {
        public static double multiply(double... factors){
            double result=1.0;
            for (double f:factors)
                result*=f;
            return result;
        }

        public static void main(String[] args)

        {
            if (args.length < 2)
                System.out.print("Enter max 2 number:");
		      else {
            double[] factors = new double[args.length];


            for (int i=0; i<args.length;i++) {
                if (i<args.length-1) {
                    factors[i] = Double.parseDouble(args[i]);
                    System.out.printf("%.2f × ", factors[i]);
                }
                else{
                    factors[i] = Double.parseDouble(args[i]);
                    System.out.printf("%.2f = ",factors[i]);
                }
            }

            System.out.printf("%.2f",multiply(factors));
        }
        }
}
