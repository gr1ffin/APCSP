namespace APCSP
{
    public class Program
    {
        public static void Main(String[] args)
        {
            
            int i = 0;
            int[] randomList = new int[50000];
            while (i < 50000)
            {
                Random random = new Random();

                int n = random.Next(100000, 999999);
                randomList.Append(n);
                i++;
            }
            Array.Sort(randomList);
            BinarySearch(randomList, 9772240);
        }

        static void BinarySearch(int[] arr, int target)
        {
            int low = 0;
            int high = arr.Length - 1;
            int mid = 0;
            int count = 0;
            while (low <= high)
            {
                count = count + 1;
                mid = (high + low) / 2;
                if (arr[mid] < target)
                {
                    low = mid + 1;
                }
                else if (arr[mid] > target)
                {
                    high = mid - 1;
                }
                else
                {
                    Console.WriteLine("Found, " + count);
                }
            }

        }
    }
}