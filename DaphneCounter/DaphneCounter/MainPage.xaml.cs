using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace DaphneCounter
{
    public partial class MainPage : ContentPage
    {
        public MainPage()
        {
            InitializeComponent();
            GoogleSheetsAndCSharp.Program.Start();
        }

        void Button_Clicked(object sender, System.EventArgs e)
        {
            GoogleSheetsAndCSharp.Program.ButtonPress();
        }
    }
}
