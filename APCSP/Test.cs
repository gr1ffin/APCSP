namespace DefaultNamespace
{
    public class Test
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
                c, b, d, c, d, b, a, a, d, a, c, b, a, a, b, d, d, a, d, a, d, a, d, b, b, a, d, d, b, a, b, b, c, a, d, c, d, a
            });

            Console.WriteLine(ListOfValues);
            Console.WriteLine(ListOfValues.size())

    }
}