package com.typedynamic.eventrisk

import com.ib.client._
import collection.mutable._

object IBDriver {

  var id = 0
  val cl = new EClientSocket(IBWrapper)  

  def stkContract(symbol: String): Contract = {
    val c = new Contract
    c.m_symbol = symbol
    c.m_secType = "STK"
    c.m_exchange = "SMART"
    c.m_currency = "USD"
    return c
  }

  def globexContract(symbol: String, expiry: String): Contract = {
    val c = new Contract
    c.m_symbol = symbol
    c.m_secType = "FUT"
    c.m_exchange = "GLOBEX"
    c.m_currency = "USD"
    c.m_expiry = expiry
    return c 
  }

  def nextReqId(): Int = { 
     id += 1
     return id
  }

  def reqContractDetails(symbol: String, callback: ContractDetails => Unit ) {
    val c = new Contract
    c.m_symbol = symbol
    
    cl.reqContractDetails(nextReqId(), c)
  }

  var prices = new HashMap[(String, Int), LinkedList[Double]]

  def reqMktData(symbol: String) {
    val n_id = nextReqId()
/*    IBMsgHandlers.mktDataHandlers += (n_id -> (fieldid, price, _) => ( match prices(symbol, fieldid) { case Some(pricelist) => { pricelist += price }
                     case None -> { prices += (symbol, fieldid) => new LinkedList(price) } }) )
    cl.reqMktData(n_id, stkContract(symbol), "", false) */
  }

  def start() {
    val r0 = cl.eConnect("127.0.0.1", 7496, 0)
  }
}
