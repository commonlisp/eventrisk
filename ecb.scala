import java.net.URL
import java.util.Date

import com.sun.syndication.feed.synd._
import com.sun.syndication.io.SyndFeedInput
import com.sun.syndication.io.XmlReader

import collection.immutable._
import collection.JavaConversions._

val ecbRSSURLs = HashMap("press" -> new URL("http://www.ecb.int/rss/press.html"),
                         "stats" -> new URL("http://www.ecb.int/rss/statpress.html"),
                         "policy" -> new URL("http://www.ecb.int/rss/operations.html"))

def feedItems(url : URL): collection.mutable.Seq[(Date, String)] = {
  val input = new SyndFeedInput()
  val feed = input.build(new XmlReader(url))
  val feedEntries = feed.getEntries()
  val castFeedEntries = feedEntries.asInstanceOf[java.util.List[SyndEntry]]
  return castFeedEntries.take(2).map(entry => (entry.getPublishedDate(), entry.getTitle()))
}

println(feedItems(ecbRSSURLs("press")))
println(feedItems(ecbRSSURLs("stats")))
println(feedItems(ecbRSSURLs("policy")))

