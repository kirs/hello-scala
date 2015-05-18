/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
package finance.currencies

import Currency._

object Converter {
  def convert(money: Money, to: Currency) = {
    //fetch current market rate... using mocked value here
    val conversionRate = 2
    new Money(money.amount * conversionRate, to)
  }
}