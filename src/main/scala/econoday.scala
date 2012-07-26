package com.typedynamic.eventrisk

import org.jsoup.Jsoup
import java.net.URL
import collection.mutable._

import collection.JavaConversions._ /* implicit collections conversions */

class Econoday(econodayURL : String) {
  val parseTimeout = 500 /* in ms */
  val doc = Jsoup.connect(econodayURL).get()
  val tbl = doc.select(".eventstable")
  val rows = tbl.select("tr")
  val days = rows.get(0).select("td").map(x => x.text())
  days.map (x => print(x ++ "\n"))
  val events = rows.slice(1,2).map(s => s.select("td").map(col => col.select(".econoevents").map(evt => (evt.select("a").text(), evt.childNode(1).toString()))))
  val evtmap = new HashMap[String, Option[(String, String)]]
  events.map { x => x.zipWithIndex.map { case (evt, row_idx) => (evtmap += (days.get(row_idx) -> evt.lastOption))}}
  print(evtmap)
//items.map (x => print(x.text() ++ "\n"))
}
