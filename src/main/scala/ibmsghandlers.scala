package com.typedynamic.eventrisk

import collection.mutable._

object IBMsgHandlers {
  var mktDataHandlers = new HashMap[Int, (Int, Double, Int) => Unit]  
}
