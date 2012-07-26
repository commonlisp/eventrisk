package com.typedynamic.eventrisk

import Config._
import collection.immutable._
import org.jsoup.Jsoup

import io.Source._
import collection.JavaConversions._

object YieldCurve {
  def yieldPage(): Map[Int, Double] = {
    val bondyieldsUrl = conf.getString("bondyieldsUrl")
    return Map(Jsoup.connect(bondyieldsUrl).get.
               select("#column0 table.mdcTable tr").drop(1).
               map(elem => (elem.child(0).text.toInt, 
                            elem.child(5).text.toDouble)): _*)
  }
}
