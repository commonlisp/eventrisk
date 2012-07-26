package com.typedynamic.eventrisk

object Main extends App {
  override def main(args: Array[String]) = {
    dataFeeds.show()
    println("DJIA (cash): " + IndexPortfolio.indexPrice(IndexPortfolio.djia))    
  }
}
