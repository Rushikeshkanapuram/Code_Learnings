using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Decorator;

class Program
{
    static void Main()
    {
        ICar car = new Hyundai();
        CarDecorator decorator = new OfferPrice(car);

        Console.WriteLine(string.Format("Make : {0} Price: {1}" + "DiscountedPrice : {2}", decorator.Make, decorator.GetPrice().ToString(), decorator.GetDiscountedPrice().ToString()));
    }
}