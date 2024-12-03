package programs;

public class FIveNumberSUm {
    public static void main(String args[])
    {
        if(args.length ==5)
        {
            int value =0;
            for(String arg: args)
            {
                value+= Integer.parseInt(arg);
            }
            System.out.println(value);

        }
        else{
            System.out.println("incorrect values");
        }
    }
}
