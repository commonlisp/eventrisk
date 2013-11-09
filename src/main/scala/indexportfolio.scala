package com.typedynamic.eventrisk

import Config._
import actors.Futures._

import collection.JavaConversions._
import org.jsoup.Jsoup

case class PriceWeightedIndex(symbols: List[String], divisor: Double)

object IndexPortfolio { 

def securityPrice(symbol: String): Double = {
	   val url = conf.getString("quoteSourceUrl")
       val c = Jsoup.connect(url+symbol)
	   val elems = c.get.select(".time_rtq_ticker")
	   if (elems.first == null)
		   return 0.0
	   else
		    elems.first.
			  text.
			  toDouble
                    
}

def indexPrice(idx: PriceWeightedIndex): Double = {
  return (idx.symbols.map(securityPrice)).sum/idx.divisor
  
}

def parIndexPrice(idx: PriceWeightedIndex): Double = {
  return (idx.symbols.map( x => future { securityPrice(x) } )).map (_.apply()).sum/idx.divisor
}
val djia = PriceWeightedIndex(List("AA", "AXP", "BA", "BAC", "CAT", "CSCO", "CVX", "DD", "DIS", "GE", "HD", "HPQ", "IBM", "INTC", "JNJ", "JPM", "KFT", "KO", "MCD", "MMM", "MRK", "MSFT", "PFE", "PG", "T", "TRV", "UTX", "VZ", "WMT", "XOM"), 0.132129493) 
}


