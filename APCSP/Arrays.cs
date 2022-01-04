using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

public class Arrays
{
    public static void Main(String[] args)
    {
        var a = "a";
        var b = "b";
        var c = "c";
        var d = "d";

        var ListOfValues = new List<string>();
        ListOfValues.AddRange(new List<string>
        {
            c, b, d, c, d, b, a, a, d, a, c, b, a, a, b, d, d, a, d, a, d, a, d
        });

        Console.WriteLine(ListOfValues);
        Console.WriteLine(ListOfValues.size())
    }
}
