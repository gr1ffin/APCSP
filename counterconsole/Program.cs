using System;
using System.IO;
using Google.Apis.Auth.OAuth2;
using Google.Apis.Sheets.v4;
using Google.Apis.Sheets.v4.Data;
using System.Collections.Generic;   //Need this to use lists<>.


namespace GoogleSheetsAndCSharp
{
    class Program
    {
        static readonly string[] Scopes = { SheetsService.Scope.Spreadsheets };
        static readonly string ApplicationName = "Counter";
        static readonly string SpreadsheetID = "1zaVfRInZZnz0oml589kXT-j7OFI2LSn5iCq5A1VdKn4";
        static readonly string sheet = "Sheet1";
        static SheetsService service;
        public static int NewData;
        public static int convertedRow;

        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");

            GoogleCredential credential;
            using (var stream = new FileStream("C:\\Users\\agent\\OneDrive\\Documents\\GitHub\\AP-CSP\\counterconsole\\sheets.json", FileMode.Open, FileAccess.Read))
            {
                credential = GoogleCredential.FromStream(stream).CreateScoped(Scopes);
            }

            service = new SheetsService(new Google.Apis.Services.BaseClientService.Initializer()
            {
                HttpClientInitializer = credential,
                ApplicationName = ApplicationName,
            });

            ReadEntries();
            ButtonPress();
        }

        static void ReadEntries()
        {
            var range = $"{sheet}!A1:B1";
            var request = service.Spreadsheets.Values.Get(SpreadsheetID, range);

            var response = request.Execute();
            var values = response.Values;
          
            if (values != null && values.Count > 0)
            {
                foreach (var row in values)
                {
                    Console.WriteLine("{0}", row[1]);
                    var test = row[1];
                    convertedRow = int.Parse(s: test.ToString());
                }
            }
            else
            {
                Console.WriteLine("No data found.");
            }
            
        }

        static void CreateEntry()
        {
            var range = $"{sheet}!B2";
            var valueRange = new ValueRange();

            var objectList = new List<object>() { Convert.ToString(4) };
            valueRange.Values = new List<IList<object>> { objectList };

            var appendRequest = service.Spreadsheets.Values.Append(valueRange, SpreadsheetID, range);
            appendRequest.ValueInputOption = SpreadsheetsResource.ValuesResource.AppendRequest.ValueInputOptionEnum.USERENTERED;
            var appendResponse = appendRequest.Execute();
        }

        static void UpdateEntry(string updateText)
        {
            var range = $"{sheet}!B1";
            var valueRange = new ValueRange();
            var objectList = new List<object>() { updateText };
            valueRange.Values = new List<IList<object>> { objectList };

            var updateRequest = service.Spreadsheets.Values.Update(valueRange, SpreadsheetID, range);
            updateRequest.ValueInputOption = SpreadsheetsResource.ValuesResource.UpdateRequest.ValueInputOptionEnum.USERENTERED;   //UpdateRequest in this line, is different from the variable updateRequest
            var updateResponse = updateRequest.Execute();
        }

        static void ButtonPress()
        {
            NewData = convertedRow + 1;
            UpdateEntry(Convert.ToString(NewData));
        }

    }
}