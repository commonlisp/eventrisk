package com.typedynamic.eventrisk

import java.net.URL
import collection.immutable._
import Feed._

object ecbData {
  val ecbRSSURLs = HashMap("press" -> new URL("http://www.ecb.int/rss/press.html"),
                         "stats" -> new URL("http://www.ecb.int/rss/statpress.html"),
                         "policy" -> new URL("http://www.ecb.int/rss/operations.html"))

  println(feedItems(ecbRSSURLs("press")))
  println(feedItems(ecbRSSURLs("stats")))
  println(feedItems(ecbRSSURLs("policy")))
}

