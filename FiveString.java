public class FiveString{
    public static void main(String[] args)
    {
        if(args.length == 5)
        {
            String newvalue = "";
            for(String arg : args)
            {
                newvalue+=arg;
            }
            System.out.println(newvalue);
        }
        else{
            System.out.println("value is not correct");
        }

    }
}