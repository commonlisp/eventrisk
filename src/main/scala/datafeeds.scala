package com.typedynamic.eventrisk

import java.net.URL
import collection.immutable._
import Feed._

object dataFeeds {
  val rssURLs = 
    HashMap("ecb" -> ("press"::"statpress"::"operations"::Nil),
            "nyfed" -> ("esms"::Nil))

  def buildRssURL(key : String, prefix : String, suffix : String): URL = {
    return new URL(prefix + key + suffix)
  }

  def ecbRSSURLs(key : String): URL = {
    return buildRssURL(key, "http://www.ecb.int/rss/", ".html")
  }

  def show() {
    rssURLs("ecb").map( feed => println(feedItems(ecbRSSURLs(feed))))
  }
}

