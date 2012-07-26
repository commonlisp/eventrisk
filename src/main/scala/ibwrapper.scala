package com.typedynamic.eventrisk

import com.ib.client._
import collection.JavaConversions._

object IBWrapper extends EWrapper 
{

  def tickSnapshotEnd(x: Int) {} 
  def deltaNeutralValidation(x: Int, x0: com.ib.client.UnderComp) {}
  def fundamentalData(x: Int, x0: java.lang.String) {}
  def currentTime(x: Long) {}
  def realtimeBar(x: Int, x0: Long, x1: Double, x2: Double, x3: Double, x4: Double, x5: Long, x6: Double, x7: Int) {}
  def scannerDataEnd(x: Int) {}
  def scannerData(x: Int, x0: Int, x1: com.ib.client.ContractDetails, x2: String, x3: String, x4: java.lang.String, x5: java.lang.String) {}
  def scannerParameters(x: java.lang.String) {}
  def historicalData(x1: Int, x2: java.lang.String, x3: Double, x4: Double, x5: Double, x6: Double, x7: Int, x8: Int, x9: Double, x10: Boolean) {}
  def receiveFA(x1: Int, x2: java.lang.String) {}
  def managedAccounts(x1: java.lang.String) {}
  def updateNewsBulletin(x1: Int, x2: Int, x3: java.lang.String, x4: java.lang.String) {}
def updateMktDepthL2  (x1: Int, x2: Int, x3: java.lang.String, x4: Int, x5: Int, x6: Double, x7: Int) {}
def updateMktDepth  (x1: Int, x2: Int, x3: Int, x4: Int, x5: Double, x6: Int) {}
def execDetailsEnd  (x1: Int) {}
def execDetails  (x1: Int, x2: com.ib.client.Contract, x3: com.ib.client.Execution) {}
def contractDetailsEnd  (x1: Int) {}
def bondContractDetails  (x1: Int, x2: com.ib.client.ContractDetails) {}
def contractDetails  (x1: Int, x2: com.ib.client.ContractDetails) {}
def nextValidId  (x1: Int) {}
def accountDownloadEnd  (x1: java.lang.String) {}
def updateAccountTime  (x1: java.lang.String) {}
def updatePortfolio  (x1: com.ib.client.Contract, x2: Int, x3: Double, x4: Double, x5: Double, x6: Double, x7: Double, x8: java.lang.String) {}
def updateAccountValue  (x1: java.lang.String, x2: java.lang.String, x3: java.lang.String, x4: java.lang.String) {}
def openOrderEnd  () {}
def openOrder  (x1: Int, x2: com.ib.client.Contract, x3: com.ib.client.Order, x4: com.ib.client.OrderState) {}
def orderStatus  (x1: Int, x2: java.lang.String, x3: Int, x4: Int, x5: Double, x6: Int, x7: Int, x8: Double, x9: Int, x10: java.lang.String) {}
def tickEFP  (x1: Int, x2: Int, x3: Double, x4: java.lang.String, x5: Double, x6: Int, x7: java.lang.String, x8: Double, x9: Double) {}
def tickString  (x1: Int, x2: Int, x3: java.lang.String) {}
def tickGeneric  (x1: Int, x2: Int, x3: Double) {}
def tickOptionComputation  (x1: Int, x2: Int, x3: Double, x4: Double, x5: Double, x6: Double, x7: Double, x8: Double, x9: Double, x10: Double) {}
def tickSize  (x1: Int, x2: Int, x3: Int) {}
  def tickPrice  (tickerId: Int, field: Int, price: Double, canAutoExec: Int) {
    IBMsgHandlers.mktDataHandlers(tickerId)(field, price, canAutoExec)    
  }
// From AnyWrapper
def connectionClosed() {}

def error(x1: Int, x2: Int, x3: java.lang.String) { println("Error w/ payload: " + x3) }
def error(x1: java.lang.String) { println("Error: " + x1) }
def error(x1: java.lang.Exception) { throw x1 }
}

